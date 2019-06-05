package com.playtika.automation.homeworks.hw4_triangles;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(float xy) {
        new Point(xy, xy);
    }

    public float distance(Point toPoint) {
        float resX = x - toPoint.x;
        float resY = y - toPoint.y;
        float res = (float) Math.sqrt((resX * resX) + (resY * resY));
        return res;
    }

    @Override
    public boolean equals(Object otherPoint) {
        if (otherPoint == null) {
            return false;
        }
        if (!(otherPoint instanceof Point)) {
            return false;
        }
        Point point = (Point) otherPoint;
        if (x != point.x) {
            return false;
        }
        return y == point.y;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}