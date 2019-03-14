package com.playtika.automation.homework.homework4;

public class Triangle {
    public static final float EPSILON = 0.01f;
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float perimeter() {
        float sideAB = a.distance(b);
        float sideBC = b.distance(c);
        float sideCA = c.distance(a);
        float res = sideAB + sideBC + sideCA;
        return res;
    }

    public float square() {
        float sideAB = a.distance(b);
        float sideBC = b.distance(c);
        float sideCA = c.distance(a);
        float p = perimeter() / 2;
        float res = (float) Math.sqrt(p * (p - sideAB) * (p - sideBC) * (p - sideCA));
        return res;
    }

    public boolean equalsSide(float side1, float side2) {
        if (Math.abs(side1 - side2) < EPSILON) {
            return true;
        }
        return false;
    }

    public byte type() {
        float sideAB = a.distance(b);
        float sideBC = b.distance(c);
        float sideCA = c.distance(a);
        if (equalsSide(sideAB, sideBC) && equalsSide(sideBC, sideCA)) {
            return 1; //"Равносторонний";
        } else if (Math.abs((sideAB * sideAB) - ((sideBC * sideBC) + (sideCA * sideCA))) < EPSILON ||
                Math.abs((sideBC * sideBC) - ((sideCA * sideCA) + (sideAB * sideAB))) < EPSILON ||
                Math.abs((sideCA * sideCA) - ((sideAB * sideAB) + (sideBC * sideBC))) < EPSILON) {
            return 2; //"Прямоугольный";
        } else if (equalsSide(sideAB, sideBC) || equalsSide(sideBC, sideCA) || equalsSide(sideCA, sideAB)) {
            return 3; //"Равнобедренный";
        } else {
            return 4; //"Произвольный";
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
            case 1:
                System.out.println("Тип: Равносторонний");
                break;
            case 2:
                System.out.println("Тип: Прямоугольный");
                break;
            case 3:
                System.out.println("Тип: Равнобедренный");
                break;
            case 4:
                System.out.println("Тип: Произвольный");
                break;
        }
    }
}


