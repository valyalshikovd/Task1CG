package ru.vsu.cs.kg2023.valyalschikov_d_a.taks1.Elements;

import java.awt.*;

public class MountWithSnow {
    public MountWithSnow(Graphics2D g, int x0, int y0, double scale) {
        int[] xPoints = {0, 30, 50, 54, 46};
        int[] yPoints = {0, -44, -55, -49, 0};
        for(int i = 0; i < 5; i++){
            xPoints[i] = x0+(int) Math.round(xPoints[i]*scale);
            yPoints[i] = y0+(int) Math.round(yPoints[i]*scale);
        }
        Polygon polygon = new Polygon(xPoints, yPoints, 5);
        g.setColor(new Color(74, 74, 76));
        g.fill(polygon);


        int[] xPoints1 = {45, 54, 63, 91, 120};
        int[] yPoints1 = {0, -49, -36, -43, 0};
        for(int i = 0; i < 5; i++){
            xPoints1[i] = x0+(int) Math.round(xPoints1[i]*scale);
            yPoints1[i] = y0+(int) Math.round(yPoints1[i]*scale);
        }
        Polygon polygon1 = new Polygon(xPoints1, yPoints1, 5);
        g.setColor(new Color(106, 105, 111));
        g.fill(polygon1);


        int[] xPoints2 = {54, 63, 91, 63};
        int[] yPoints2 = {-49, -36, -43, -86};
        for(int i = 0; i < 4; i++){
            xPoints2[i] = x0+(int) Math.round(xPoints2[i]*scale);
            yPoints2[i] = y0+(int) Math.round(yPoints2[i]*scale);
        }
        Polygon polygon2 = new Polygon(xPoints2, yPoints2, 4);
        g.setColor(Color.WHITE);
        g.fill(polygon2);


        int[] xPoints3 = {30, 63, 54, 50};
        int[] yPoints3 = {-44, -86, -49, -55};
        for(int i = 0; i < 4; i++){
            xPoints3[i] = x0+(int) Math.round(xPoints3[i]*scale);
            yPoints3[i] = y0+(int) Math.round(yPoints3[i]*scale);
        }
        Polygon polygon3 = new Polygon(xPoints3, yPoints3, 4);
        g.setColor(new Color(181, 181, 181));
        g.fill(polygon3);




    }
}
