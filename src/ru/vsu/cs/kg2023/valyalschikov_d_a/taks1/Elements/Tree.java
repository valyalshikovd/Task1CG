package ru.vsu.cs.kg2023.valyalschikov_d_a.taks1.Elements;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Tree {
    private int x0;
    private int y0;
    private double scale;

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public Tree(int x0, int y0, double scale) {
        this.x0 = x0;
        this.y0 = y0;
        this.scale = scale;
    }
     public void draw(Graphics2D g){
         Ellipse2D ellipse2D = new Ellipse2D.Double(x0 - 5, y0 - 60, 12 , 25 );
         g.setColor(new Color(138, 158, 24));
         g.fill(ellipse2D);

         Ellipse2D ellipse2D2 = new Ellipse2D.Double(x0 , y0 -50, 3 , 20 );
         g.setColor(new Color(128, 64, 0));
         g.fill(ellipse2D2);
     }
}