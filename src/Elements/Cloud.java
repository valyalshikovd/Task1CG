package Elements;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Timer;
import java.util.TimerTask;

public class Cloud {

    public int x0;
    private int shift;
    private Ellipse2D ellipse2D;
    private Ellipse2D ellipse2D2;
    private Rectangle rectangle;

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    private Graphics2D g;

    public Cloud(Graphics2D g, int x0, int y0, double scale, int width) {
        this.ellipse2D = new Ellipse2D.Double(x0, y0, 40, 40);
        this.ellipse2D2 = new Ellipse2D.Double(x0 + width, y0, 40, 40);
        this.rectangle = new Rectangle(x0 + 20, y0, width, 40);
        this.g = g;
        this.x0 = x0;
    }

    public void move(){
        this.rectangle.setFrame((int) rectangle.getX() + 1, rectangle.getY(), 40, 40);
    }

    public void draw(){
        g.setColor(Color.WHITE);
        g.fill(ellipse2D);
        g.fill(ellipse2D2);
        g.fill(rectangle);
    }

}

