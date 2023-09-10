package ru.vsu.cs.kg2023.valyalschikov_d_a.taks1.Elements;

import java.awt.*;

public class Birds {
    private int x0;
    private int y0;
    private int[] xPoints;
    private int[] yPoints;
    private boolean flag;

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public Birds(int x0, int y0) {
        xPoints = new int[]{3, 6, 16, 9};
        yPoints = new int[]{-17, 21, 16, 23};
        this.x0 = x0;
        this.y0 = y0;
    }

    public void draw(Graphics2D g){
        for (int i = 0; i < 4; i++) {
            xPoints[i] = x0 + (int) Math.round(xPoints[i]);
            yPoints[i] = y0 + (int) Math.round(yPoints[i]);
        }
        Polygon polygon = new Polygon(xPoints, yPoints, 3);
        g.setColor(new Color(255, 255, 255));
        g.fill(polygon);
    }
    public void move(){
        System.out.println(yPoints[0]);
        if(yPoints[0] > -20 && yPoints[0] < -15 ){
            flag = true;
        }
        if(yPoints[0] > 9 && yPoints[0] < 13 ){
            flag = false;

        }
        if(flag){
            yPoints[0]++;
        }else{
            yPoints[0]--;
        }


    }
}
