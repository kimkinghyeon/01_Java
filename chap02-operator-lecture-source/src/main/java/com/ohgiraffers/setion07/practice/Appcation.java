package com.ohgiraffers.setion07.practice;

public class Appcation {
    public static void main(String[] args) {

        System.out.println("==== 산술연산자 ====");
        int a = 15;
        int b = 4;
        System.out.println("a / b = " + (a / b));
        int a8 = 8;
        int b3 = 3;
        System.out.println("a % b = " + (a8 % b3));
        int a5 = 5;
        int a2 = 2;
        System.out.println("a2 * a5 - 3= " + (a2 * a5 - 3));

        System.out.println("==== 복합 대입연산자 ====");
        int x = 10;
        int y = 20;
        int z = 8;

        x += 5;
        System.out.println("x = " + x);
        y /= 4;
        System.out.println("y = " + y);
        z %= 3;
        System.out.println("z = " + z);

        System.out.println("==== 증감 연산자 ====");
        int i1 = 0;
        int j1 = 10;
        int k1 = 5;

        int i = i1++;
        System.out.println("i1 = " + i);
        int j = --j1;
        System.out.println("j1 = " + j);
        int k = ++k1;
        System.out.println("k1 = " + k);

        System.out.println("==== 비교 연산자 ====");
        int num1 = 10;
        int num2 = 20;
        int age = 19;

        System.out.println("num1:10 == num2:20 = " + (num1 == num2));
        System.out.println("15 >= num:10 =" + (15 >= num1));
        System.out.println("age:19 >= 18 = " + (age >= 18));

        System.out.println("==== 논리 연산자 ====");
        boolean a1 = true;
        boolean b1 = false;
        System.out.println("a(true)와 b(false)의 논리 and 연산 : " + (a1 && b1));
        int age1 = 20;
        int x1 = 10;
        int y1 = 20;
        System.out.println("age1 가 18이상 65미만인지 = " + (age1 >= 18 && age1 < 65));
        System.out.println("x1 == 10 = " + (x1 >= 10));
        System.out.println("y1 >= 25 = " + (y1 >= 25));

    }
}
