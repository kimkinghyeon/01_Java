package com.ohgiraffers.section01.method;

public class Appcation10 {
    public static void main(String[] args) {

        int num1 =16;
        int num2 = 5;

        calculator calc = new calculator();
        int num3 = calc.nonStaticNumber0f1(num1, num2);
        int num4 = calc.nonStaticNumber0f2(num1, num2);
        int num5 = calc.nonStaticNumber0f3(num1, num2);
        int num6 = calc.nonStaticNumber0f4(num1, num2);
        int num7 = calculator.staticNumber0f5(num1, num2);

        System.out.println("==== 과제 ====");
        System.out.println("두 수의 더하기 " + num3);
        System.out.println("두 수의 빼기 " + num4);
        System.out.println("두 수의 곱하기 " + num5);
        System.out.println("두 수의 나누기 " + num6);
        System.out.println("두 수의 나머지 " + num7);
    }
}
