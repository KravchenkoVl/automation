package com.playtika.automation.homework.homework4;

public class Triangle {

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
                 A.equalsX(B) && B.equalsX(C) || A.equalsY(B) && B.equalsY(C));
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
        if (a == b && b == c) {
            return 1; //"Равносторонний";
        } else if (a * a == (b * b) + (c * c) ||
                b * b == (a * a) + (c * c) ||
                c * c == (a * a) + (b * b)) {
            return 2; //"Прямоугольный";
        } else if (a == b || a == c || b == c) {
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
}


