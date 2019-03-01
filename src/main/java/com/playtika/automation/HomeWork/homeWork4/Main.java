package com.playtika.automation.homeWork;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(10);
        Point p3 = new Point(55, 10);
        Triangle check = new Triangle(p1, p2, p3);
        System.out.println(check.perimeter());
        System.out.println(check.square());
        System.out.println(check.type());
    }
}
