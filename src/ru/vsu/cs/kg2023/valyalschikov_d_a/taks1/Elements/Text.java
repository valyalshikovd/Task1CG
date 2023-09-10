package ru.vsu.cs.kg2023.valyalschikov_d_a.taks1.Elements;

import java.awt.*;

public class Text {
    private String text;
    private int x;
    private int y;

    public Text(String text, int x, int y) {
        this.text = text;
        this.x = x;
        this.y = y;
    }
    public void draw(Graphics2D g){
        Font font = new Font("Arial", Font.BOLD, 70);
        g.setColor(Color.WHITE);

        g.setFont(font);
        g.drawString(text, x, y);
    }
}
