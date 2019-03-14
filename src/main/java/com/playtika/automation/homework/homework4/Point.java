package com.playtika.automation.homework.homework4;

import java.math.BigDecimal;
import java.math.MathContext;

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
        float resX = this.x - toPoint.x;
        float resY = this.y - toPoint.y;
        float res = (float) Math.sqrt((resX * resX) + (resY * resY));
        return res;
    }

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