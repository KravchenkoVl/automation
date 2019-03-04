package com.playtika.automation.homework.homework4;

public class Triangle {
    public static final float EPSILON = 0.001f;

    private Point A;
    private Point B;
    private Point C;
    private float a;
    private float b;
    private float c;

    public Triangle() {
        do {
            A = new Point();
            B = new Point();
            C = new Point();
        } while (A.equals(B) || B.equals(C) || C.equals(A) ||
                 A.equalsX(B) && A.equalsX(C) || A.equalsY(B) && A.equalsY(C));
        a = A.distance(B);
        b = B.distance(C);
        c = C.distance(A);
    }

    public Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
        a = A.distance(B);
        b = B.distance(C);
        c = C.distance(A);
    }

    public float perimeter() {
        float res = a + b + c;
        return res;
    }

    public float square() {
        float p = this.perimeter() / 2;
        float res = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return res;
    }

    public byte type() {
        if (equalsSideAB() && equalsSideBC()) {
            return 1; //"Равносторонний";
        } else if (Math.abs((a * a) - ((b * b) + (c * c))) < EPSILON ||
                Math.abs((b * b) - ((c * c) + (a * a))) < EPSILON ||
                Math.abs((c * c) - ((a * a) + (b * b))) < EPSILON) {
            return 2; //"Прямоугольный";
        } else if (equalsSideAB() || equalsSideCA() || equalsSideBC()) {
            return 3; //"Равнобедренный";
        } else {
            return 4; //"Произвольный";
        }
    }

    @Override
    public String toString() {
        StringBuilder check = new StringBuilder();
        check.append("Треугольник [A(");
        check.append(A.getX());
        check.append(", ");
        check.append(A.getY());
        check.append(") B(");
        check.append(B.getX());
        check.append(", ");
        check.append(B.getY());
        check.append(") C(");
        check.append(C.getX());
        check.append(", ");
        check.append(C.getY());
        check.append(")]");
        return check.toString();
    }

    public void getInfo(){
        System.out.println(this.toString());
        System.out.println("P: " + this.perimeter());
        System.out.println("S: " + this.square());
        switch (this.type()) {
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

    public boolean equalsSideAB() {
        if (Math.abs(a - b) < EPSILON) {
            return true;
        }
        return false;
    }

    public boolean equalsSideBC() {
        if (Math.abs(b - c) < EPSILON) {
            return true;
        }
        return false;
    }

    public boolean equalsSideCA() {
        if (Math.abs(c - a) < EPSILON) {
            return true;
        }
        return false;
    }
}


