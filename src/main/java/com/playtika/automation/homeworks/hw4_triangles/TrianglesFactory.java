package com.playtika.automation.homeworks.hw4_triangles;

import static com.playtika.automation.homeworks.hw4_triangles.PointFactory.getRandomPoint;

public class TrianglesFactory {
    public static Triangle getRandomTriangle() {
        Point p1 = getRandomPoint();
        Point p2 = getRandomPoint();
        Point p3 = getRandomPoint();
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