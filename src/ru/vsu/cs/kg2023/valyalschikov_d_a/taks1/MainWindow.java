package ru.vsu.cs.kg2023.valyalschikov_d_a.taks1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel dp;

    public MainWindow() {
        dp = new DrawPanel();
        dp.setBackground(new Color(100, 190, 216));
        this.add(dp);
    }
}
