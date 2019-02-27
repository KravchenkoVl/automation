package com.playtika.automation.HomeWork;

public class HomeWork_4_Triangles {
    public static void main(String[] args) {
        Point p1 = new Point(10);
        Point p2 = new Point(10,0);
        Point p3 = new Point();
        Triangle check = new Triangle(p1, p2, p3);
        System.out.println(check.perimeter());
        System.out.println(check.square());
        System.out.println(check.type());
    }
}
