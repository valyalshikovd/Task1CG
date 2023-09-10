package ru.vsu.cs.kg2023.valyalschikov_d_a.taks1.Elements;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Cloud {
    public int x0;
    public int y0;
    public int width;


    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }


    public Cloud( int x0, int y0, int width) {
        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
    }


    public void draw(Graphics2D g){
        Ellipse2D ellipse2D = new Ellipse2D.Double(x0, y0, 40, 40);
        Ellipse2D ellipse2D2 = new Ellipse2D.Double(x0 + width, y0, 40, 40);
        Rectangle rectangle = new Rectangle(x0 + 20, y0, width, 40);
        g.setColor(Color.WHITE);
        g.fill(ellipse2D);
        g.fill(ellipse2D2);
        g.fill(rectangle);
    }

}

