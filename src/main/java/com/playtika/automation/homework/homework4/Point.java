package com.playtika.automation.homework.homework4;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.concurrent.ThreadLocalRandom;

public class Point {
    private float x;
    private float y;

    public Point() {
        x = new BigDecimal(Math.random(),new MathContext(3)).floatValue();
        y = new BigDecimal(Math.random(),new MathContext(3)).floatValue();
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(float xy) {
        this(xy, xy);
    }

    public float distance(Point toPoint) {
        float resX = this.x - toPoint.x;
        float resY = this.y - toPoint.y;
        float res = (float) Math.sqrt((resX * resX) + (resY * resY));
        return res;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
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

    public boolean equalsX(Point otherPoint) {
        if (x == otherPoint.x) {
            return true;
        }
        return false;
    }

    public boolean equalsY(Point otherPoint) {
        if (y == otherPoint.y) {
            return true;
        }
        return false;
    }
}