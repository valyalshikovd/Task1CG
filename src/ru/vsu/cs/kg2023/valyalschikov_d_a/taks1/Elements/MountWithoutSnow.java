package ru.vsu.cs.kg2023.valyalschikov_d_a.taks1.Elements;

import java.awt.*;

public class MountWithoutSnow {
    private int x0;
    private int y0;
    private double scale;
    public MountWithoutSnow( int x0, int y0, double scale) {
        this.y0 = y0;
        this.x0 = x0;
        this.scale = scale;
    }
    public void draw(Graphics2D g){
        int[] xPoints = {0, 43, 90, 83, 53, 10};
        int[] yPoints = {0, -83, -81, -66, -67, 0};
        for (int i = 0; i < 6; i++) {
            xPoints[i] = x0 + (int) Math.round(xPoints[i] * scale);
            yPoints[i] = y0 + (int) Math.round(yPoints[i] * scale);
        }
        Polygon polygon = new Polygon(xPoints, yPoints, 6);
        g.setColor(new Color(89, 87, 101));
        g.fill(polygon);


        int[] xPoints1 = {10, 53, 83, 90, 123};
        int[] yPoints1 = {0, -67, -66, -81, 0};
        for (int i = 0; i < 5; i++) {
            xPoints1[i] = x0 + (int) Math.round(xPoints1[i] * scale);
            yPoints1[i] = y0 + (int) Math.round(yPoints1[i] * scale);
        }
        Polygon polygon1 = new Polygon(xPoints1, yPoints1, 5);
        g.setColor(new Color(67, 65, 79));
        g.fill(polygon1);
    }
}
