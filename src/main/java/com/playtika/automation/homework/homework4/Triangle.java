package com.playtika.automation.homework.homework4;

import static com.playtika.automation.homework.homework4.TrianglesEnum.*;

public class Triangle {
    public static final float EPSILON = 0.01f;
    private Point a;
    private Point b;
    private Point c;
    private float sideAB;
    private float sideBC;
    private float sideCA;

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
        sideAB = a.distance(b);
        sideBC = b.distance(c);
        sideCA = c.distance(a);
    }

    public float perimeter() {
        float res = sideAB + sideBC + sideCA;
        return res;
    }

    public float square() {
        float p = perimeter() / 2; //полупериметр
        float res = (float) Math.sqrt(p * (p - sideAB) * (p - sideBC) * (p - sideCA));
        return res;
    }

    private boolean equalsSide(float side1, float side2) {
        if (Math.abs(side1 - side2) < EPSILON) {
            return true;
        }
        return false;
    }

    private boolean isEquilateral() {
        if (equalsSide(sideAB, sideBC) && equalsSide(sideBC, sideCA)) {
            return true;
        } else {
            return false;
        }
    }
    private boolean isRectangular() {
        if (Math.abs((sideAB * sideAB) - ((sideBC * sideBC) + (sideCA * sideCA))) < EPSILON ||
                Math.abs((sideBC * sideBC) - ((sideCA * sideCA) + (sideAB * sideAB))) < EPSILON ||
                Math.abs((sideCA * sideCA) - ((sideAB * sideAB) + (sideBC * sideBC))) < EPSILON) {
            return true;
        } else {
            return false;
        }
    }
    private boolean isIsosceles() {
        if (equalsSide(sideAB, sideBC) || equalsSide(sideBC, sideCA) || equalsSide(sideCA, sideAB)) {
            return true;
        } else {
            return false;
        }
    }

    public TrianglesEnum type() {
        if (isEquilateral()) {
            return Equilateral;
        } else if (isRectangular()) {
            return Rectangular;
        } else if (isIsosceles()) {
            return Isosceles;
        } else {
            return Arbitrary;
        }
    }

    @Override
    public String toString() {
        return "Треугольник [A" + a.toString() + " B" + b.toString() + " C" + c.toString() + "]";
    }

    public void getInfo(){
        System.out.println(toString());
        System.out.println("P: " + perimeter());
        System.out.println("S: " + square());
        switch (type()) {
            case Equilateral:
                System.out.println("Тип: Равносторонний");
                break;
            case Rectangular:
                System.out.println("Тип: Прямоугольный");
                break;
            case Isosceles:
                System.out.println("Тип: Равнобедренный");
                break;
            case Arbitrary:
                System.out.println("Тип: Произвольный");
                break;
        }
    }
}


