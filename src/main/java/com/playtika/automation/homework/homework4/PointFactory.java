package com.playtika.automation.homework.homework4;

public class PointFactory {
    public static Point getRandomPoint() {
        float x = (float) (-50 + Math.random() * 100);
        float y = (float) (-50 + Math.random() * 100);
        return new Point(x, y);
    }
}
