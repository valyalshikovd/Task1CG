package Elements;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Tree {
    public Tree(Graphics2D g, int x0, int y0, double scale) {

        Ellipse2D ellipse2D = new Ellipse2D.Double(x0, y0 - 12 - 20 - 30, 12 * scale, 25 * scale);
        g.setColor(new Color(138, 158, 24));
        g.fill(ellipse2D);

        Ellipse2D ellipse2D2 = new Ellipse2D.Double(x0 + 9, y0 - 40, 3 * scale, 20 * scale);
        g.setColor(new Color(128, 64, 0));
        g.fill(ellipse2D2);
    }
}