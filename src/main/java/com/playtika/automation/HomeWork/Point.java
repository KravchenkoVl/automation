package com.playtika.automation.HomeWork;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public float distance(Point toPoint) {
        float resX = this.x - toPoint.x;
        float resY = this.y - toPoint.y;
        float res = (float) Math.sqrt((resX * resX) + (resY * resY));
        return res;
    }
}