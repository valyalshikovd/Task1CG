package Elements;

import java.awt.*;

public class MountPiramide {
    public MountPiramide(Graphics2D g, int x0, int y0, double scale) {
        int[] xPoints = {0, 35, 30};
        int[] yPoints = {0, -36, 0};
        for (int i = 0; i < 3; i++) {
            xPoints[i] = x0 + (int) Math.round(xPoints[i] * scale);
            yPoints[i] = y0 + (int) Math.round(yPoints[i] * scale);
        }
        Polygon polygon = new Polygon(xPoints, yPoints, 3);
        g.setColor(new Color(126, 135, 176));
        g.fill(polygon);


        int[] xPoints1 = {30, 35, 73};
        int[] yPoints1 = {0, -36, 0 };
        for (int i = 0; i < 3; i++) {
            xPoints1[i] = x0 + (int) Math.round(xPoints1[i] * scale);
            yPoints1[i] = y0 + (int) Math.round(yPoints1[i] * scale);
        }
        Polygon polygon1 = new Polygon(xPoints1, yPoints1, 3);
        g.setColor(new Color(166, 171, 200));
        g.fill(polygon1);

    }
}
