import Elements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Timer;
import java.util.TimerTask;

public class DrawPanel extends JPanel  {

    private Cloud cloud;
    private Cloud cloud1;
    private Cloud cloud2;
    private Cloud cloud3;
    private Cloud cloud4;
    private Cloud cloud5;
    public DrawPanel(){
        cloud = null;

    }

    @Override
    public void paint(Graphics gr){
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setColor(new Color(235, 238, 160));
        g.fill(new Ellipse2D.Double(640 , 80, 160,160));

        g.setColor(new Color(253, 218, 66));
        g.fill(new Ellipse2D.Double(660 , 100, 120,120));

        g.setColor(new Color(192, 206, 109));
        g.fill(new Ellipse2D.Double(120 , 580, 40,60));
        g.fill(new Ellipse2D.Double(1200 , 580, 40,60));
        g.fill(new Rectangle(140,580, 1080, 40));

        g.setColor(new Color(34, 176, 214));
        g.fill(new Ellipse2D.Double(80 , 600, 60,60));
        g.fill(new Ellipse2D.Double(1240 , 600, 60,60));
        g.fill(new Rectangle(110,600, 1160, 60));

        MountWithSnow mountWithSnow1 = new MountWithSnow(g, 200, 580, 2);
        MountWithSnow mountWithSnow2 = new MountWithSnow(g, 860, 580, 2.4);

        MountWithoutSnow mountWithoutSnow = new MountWithoutSnow(g, 520, 580, 1);
        MountWithoutSnow mountWithoutSnow2 = new MountWithoutSnow(g, 600, 580, 2);

        MountPiramide mountPiramide = new MountPiramide(g, 460, 580, 1.6);
        MountPiramide mountPiramide2 = new MountPiramide(g, 340, 580, 2);
        MountPiramide mountPiramide3 = new MountPiramide(g, 900, 580, 2);
        MountPiramide mountPiramide4 = new MountPiramide(g, 800, 580, 1.4);

        Tree tree1 = new Tree(g, 800, 580, 2);
        Tree tree2 = new Tree(g, 300, 580, 2);
        Tree tree3 = new Tree(g, 330, 580, 2);
        Tree tree4 = new Tree(g, 360, 580, 2);
        Tree tree5 = new Tree(g, 350, 580, 2);
        Tree tree6 = new Tree(g, 750, 580, 2);
        Tree tree7 = new Tree(g, 700, 580, 2);
        Tree tree8 = new Tree(g, 600, 580, 2);
        Tree tree9 = new Tree(g, 880, 580, 2);
        Tree tree10 = new Tree(g, 830, 580, 2);
        Tree tre11 = new Tree(g, 980, 580, 2);

        this.cloud = new Cloud(g, 700, 200, 2.0, 190);
        this.cloud.draw();
        this.cloud1 = new Cloud(g, 1000, 100, 2.0, 250);
        this.cloud1.draw();
        this.cloud2 = new Cloud(g, 100, 300, 1.5, 100);
        this.cloud2.draw();
        this.cloud3 = new Cloud(g, 950, 250, 2.5, 300);
        this.cloud3.draw();
        this.cloud4 = new Cloud(g, 280, 150, 2.0, 350);
        this.cloud4.draw();
        this.cloud5 = new Cloud(g, 800, 100, 3.0, 250);
        this.cloud5.draw();

        Cloud cloud = this.cloud;

//        Timer timer = new Timer();
//        TimerTask task = new TimerTask() {
//
//            @Override
//            public void run() {
//                this.cloud = new Cloud(g, this.cloud.getX0() - 10, 200, 2.0, 190);
//                this.cloud.draw();
//            }
//        };
//        timer.schedule(task, 0, 1000); // Первый параметр - задержка перед первым запуском, второй - периодичность в миллисекундах
    }




}
