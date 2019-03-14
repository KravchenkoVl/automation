package com.playtika.automation.homework.homework4;

public class PointFactory {
    public static Point getRandomPoint() {
        float x = (float) (-5 + Math.random() * 10);
        float y = (float) (-5 + Math.random() * 10);
        return new Point(x, y);
    }
}
