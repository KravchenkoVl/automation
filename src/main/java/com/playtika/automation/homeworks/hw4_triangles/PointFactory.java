package com.playtika.automation.homeworks.hw4_triangles;

public class PointFactory {
    public static Point getRandomPoint() {
        float x = (float) Math.random() * 10 - 5;
        float y = (float) Math.random() * 10 - 5;
        return new Point(x, y);
    }
}
