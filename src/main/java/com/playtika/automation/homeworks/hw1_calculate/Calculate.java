package com.playtika.automation.homeworks.hw1_calculate;

public class Calculate {
    public static void main(String[] args) {
        calculate1();
        calculate2();
        calculate3();
        calculate4();
    }

    public static void calculate1(){
        long x = 211321332;
        long y = 121231231;
        long z = 789789789;
        long n = 465446433;
        long resultL = x - (y + 123) / z * n;
        System.out.println("x - (y + 123) / z * n = " + resultL);
    }

    public static void calculate2(){
        int x = 123666654;
        int y = 12313323;
        int z = 4569587;
        int n = 178965412;
        int resultI = (x + (50 - y * z) / n) - x;
        System.out.println("(x + (50 - y * z) / n) - x = " + resultI);
    }

    public static void calculate3(){
        float x = 123.123f;
        float y = 654789.12f;
        float z = 464646.11f;
        float n = 13131336.55f;
        float resultF = x / (y * (z - 1) - 564) + n;
        System.out.println("x / (y * (z - 1) - 564) + n = " + resultF);
    }

    public static void calculate4(){
        double x = 1313131313.999;
        double y = 4646464646464646.11;
        double z = 113131313.333;
        double n = 44991984651.3489;
        double resultD = -x / -y + z / (n + 15);
        System.out.println("-x / -y + z / (n + 15) = " + resultD);
    }
}
