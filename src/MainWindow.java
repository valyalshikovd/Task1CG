import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MainWindow extends JFrame {
    private final DrawPanel dp;

    public MainWindow() {
        dp = new DrawPanel();
        dp.setBackground(new Color(100, 190, 216));
        this.add(dp);
    }
}
