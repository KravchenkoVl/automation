package com.playtika.automation.homework.homework4;

import static com.playtika.automation.homework.homework4.PointFactory.getRandomPoint;

public class TrianglesFactory {
    public static Triangle getRandomTriangle() {
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Triangle triangle = new Triangle(p1, p2, p3);
        while (triangle.square() == 0) {
            p1 = getRandomPoint();
            p2 = getRandomPoint();
            p3 = getRandomPoint();
            triangle = new Triangle(p1, p2, p3);
        }
        return triangle;
    }
}