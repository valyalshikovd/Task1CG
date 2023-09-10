package ru.vsu.cs.kg2023.valyalschikov_d_a.taks1.Elements;

import java.awt.*;

public class Home {

    public Home(Graphics2D g, int x0, int y0) {
        Rectangle rectangle = new Rectangle(x0 + 8, y0 - 36, 80, 40);
        g.setColor(new Color(206, 169, 142));
        g.fill(rectangle);


        int[] xPoints1 = {0, 14, 90, 106};
        int[] yPoints1 = {-36, -80, -80, -36 };
        for (int i = 0; i < 4; i++) {
            xPoints1[i] = x0 + xPoints1[i];
            yPoints1[i] = y0 + yPoints1[i];
        }
        g.setColor(new Color(255, 92, 5));
        Polygon polygon = new Polygon(xPoints1, yPoints1, 4);
        g.fill(polygon);

        int[] xPoints2 = {25, 25, 35, 35};
        int[] yPoints2 = {-10, -30, -30, -10 };
        for (int i = 0; i < 4; i++) {
            xPoints2[i] = x0 + xPoints2[i];
            yPoints2[i] = y0 + yPoints2[i];
        }
        g.setColor(new Color(84, 175, 250));
        Polygon polygon2 = new Polygon(xPoints2, yPoints2, 4);
        g.fill(polygon2);


        int[] xPoints3 = {45, 45, 55, 55};
        int[] yPoints3 = {-10, -30, -30, -10 };
        for (int i = 0; i < 4; i++) {
            xPoints3[i] = x0 + xPoints3[i];
            yPoints3[i] = y0 + yPoints3[i];
        }
        g.setColor(new Color(84, 175, 250));
        Polygon polygon3 = new Polygon(xPoints3, yPoints3, 4);
        g.fill(polygon3);

        int[] xPoints4 = {75, 75, 85, 85};
        int[] yPoints4 = {0, -20, -20, 0 };
        for (int i = 0; i < 4; i++) {
            xPoints4[i] = x0 + xPoints4[i];
            yPoints4[i] = y0 + yPoints4[i];
        }
        g.setColor(new Color(134, 77, 41));
        Polygon polygon4 = new Polygon(xPoints4, yPoints4, 4);
        g.fill(polygon4);


        int[] xPoints5 = {75, 75, 85, 85};
        int[] yPoints5 = {-70, -90, -90, -70 };
        for (int i = 0; i < 4; i++) {
            xPoints5[i] = x0 + xPoints5[i];
            yPoints5[i] = y0 + yPoints5[i];
        }
        g.setColor(new Color(122, 122, 122));
        Polygon polygon5 = new Polygon(xPoints5, yPoints5, 4);
        g.fill(polygon5);
//
//
//        int[] xPoints3 = {10, 10, 30, 30};
//        int[] yPoints3 = {-10, -30, -30, -10 };
//        for (int i = 0; i < 4; i++) {
//            xPoints3[i] = x0 + xPoints3[i];
//            yPoints3[i] = y0 + yPoints3[i];
//        }
//        g.fill(rectangle);
//        g.setColor(new Color(84, 175, 250));
//        Polygon polygon3 = new Polygon(xPoints3, yPoints3, 4);
//        g.fill(polygon3);

    }
}
