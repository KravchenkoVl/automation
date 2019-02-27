package com.playtika.automation.HomeWork;

public class Triangle {

    private Point A;
    private Point B;
    private Point C;
    private float a;
    private float b;
    private float c;


    public Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
        a = A.distance(B);
        b = B.distance(C);
        c = C.distance(A);
    }

    public float perimeter() {
        float res = this.a + this.b + this.c;
        return res;
    }

    public float square() {
        float p = this.perimeter() / 2;
        float res = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return res;
    }

    public String type() {
        if (this.a == this.b && this.b == this.c) {
            return "Равносторонний";
        } else if (this.a * this.a == this.b * this.b + this.c * this.c ||
                this.b * this.b == this.a * this.a + this.c * this.c ||
                this.c * this.c == this.a * this.a + this.b * this.b) {
            return "Прямоугольный";
        } else if (this.a == this.b && this.b != this.c && this.a != this.c ||
                   this.a == this.c && this.c != this.b && this.a != this.b ||
                   this.b == this.c && this.c != this.a && this.b != this.a) {
            return "Равнобедренный";
        } else {
            return "Произвольный";
        }
    }
}


