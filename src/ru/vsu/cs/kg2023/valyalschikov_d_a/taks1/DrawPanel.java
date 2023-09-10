package ru.vsu.cs.kg2023.valyalschikov_d_a.taks1;

import ru.vsu.cs.kg2023.valyalschikov_d_a.taks1.Elements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.TimerTask;

public class DrawPanel extends JPanel {
    private Birds birds;
    private Cloud[] clouds = new Cloud[5];
    private Tree[] trees = new Tree[11];
    private MountPiramide[] piramides = new MountPiramide[4];
    private MountWithoutSnow[] mountsWithoutSnow = new MountWithoutSnow[2];
    private Text text;

    public DrawPanel() {
        birds = new Birds(1, 1);
        for (int i = 0; i < 11; i++) {
            Random random = new Random();
            trees[i] = new Tree(250 + random.nextInt(650), 610, 0.8 + random.nextInt(10) / 100);
        }
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            clouds[i] = new Cloud(100 + random.nextInt(1000), 40 + random.nextInt(350), 50 + random.nextInt(500));
        }
        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            piramides[i] = new MountPiramide(300 + random.nextInt(560), 580, 1 + random.nextInt(10) / 100);
        }
        for (int i = 0; i < 2; i++) {
            Random random = new Random();
            mountsWithoutSnow[i] = new MountWithoutSnow(300 + random.nextInt(560), 580, 1 + i);
        }
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_K) {
                    initialDefault();
                    repaint();
                }
            }
        });
        this.setFocusable(true);
        update();
    }

    private void update() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    if (clouds[i].x0 == -clouds[i].width - 80) {
                        Random random = new Random();
                        clouds[i] = new Cloud(1450, 40 + random.nextInt(350), 50 + random.nextInt(500));
                    }
                    clouds[i].x0++;

                }
                birds.move();
                repaint();

            }
        };
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(task, 0, 20);
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        Background background = new Background(g);
        drawStaticObjects(g);


    }

    private void drawStaticObjects(Graphics2D g) {
        //birds.draw(g);

        MountWithSnow mountWithSnow1 = new MountWithSnow(g, 200, 580, 2);
        MountWithSnow mountWithSnow2 = new MountWithSnow(g, 860, 580, 2.4);

        text = new Text("Good morning!", 450, 350 );
        text.draw(g);

        for (int i = 0; i < 2; i++) {
            mountsWithoutSnow[i].draw(g);
        }
        for (int i = 0; i < 4; i++) {
            piramides[i].draw(g);
        }
        for (int i = 0; i < 5; i++) {
            clouds[i].x0 = clouds[i].x0-1;
            clouds[i].draw(g);
        }
        for (int i = 0; i < 11; i++) {
            trees[i].draw(g);
        }
        Home home = new Home(g, 800, 578);

    }

    private void initialDefault(){
        mountsWithoutSnow[0] = new MountWithoutSnow( 520, 580, 1);
        mountsWithoutSnow[1] = new MountWithoutSnow( 600, 580, 2);

        piramides[0] = new MountPiramide( 460, 580, 1.6);
        piramides[1] = new MountPiramide( 340, 580, 2);
        piramides[2] = new MountPiramide( 900, 580, 2);
        piramides[3] = new MountPiramide( 800, 580, 1.4);

        trees[0] = new Tree( 800, 610, 2);
        trees[1] = new Tree( 300, 610, 2);
        trees[2] = new Tree( 330, 610, 2);
        trees[3] = new Tree( 360, 610, 2);
        trees[4] = new Tree( 350, 610, 2);
        trees[5] = new Tree( 750, 610, 2);
        trees[6] = new Tree( 700, 610, 2);
        trees[7] = new Tree( 600, 610, 2);
        trees[8] = new Tree( 880, 610, 2);
        trees[9] = new Tree( 830, 610, 2);
        trees[10] = new Tree( 980, 610, 2);
    }
}
