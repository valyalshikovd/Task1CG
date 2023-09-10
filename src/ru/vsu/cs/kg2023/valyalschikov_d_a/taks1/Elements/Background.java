package ru.vsu.cs.kg2023.valyalschikov_d_a.taks1.Elements;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public  class Background {
    public  Background(Graphics2D g){
        g.setColor(new Color(235, 238, 160));
        g.fill(new Ellipse2D.Double(640, 80, 160, 160));

        g.setColor(new Color(253, 218, 66));
        g.fill(new Ellipse2D.Double(660, 100, 120, 120));


        g.setColor(new Color(192, 206, 109));
        g.fill(new Ellipse2D.Double(120, 580, 40, 60));
        g.fill(new Ellipse2D.Double(1200, 580, 40, 60));
        g.fill(new Rectangle(140, 580, 1080, 40));

        g.setColor(new Color(34, 176, 214));
        g.fill(new Ellipse2D.Double(80, 600, 60, 60));
        g.fill(new Ellipse2D.Double(1240, 600, 60, 60));
        g.fill(new Rectangle(110, 600, 1160, 60));
    }
}
