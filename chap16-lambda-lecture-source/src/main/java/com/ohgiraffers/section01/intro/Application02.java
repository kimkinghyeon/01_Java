package com.ohgiraffers.section01.intro;

public class Application02 {

    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x,y) -> x + y;
        // minus
        OuterCalculator.Minus minus = (x,y) -> x - y;
        // multiple
        OuterCalculator.Multiple multiple = (x,y) -> x * y;
        // division
        OuterCalculator.Division division = (x,y) -> x / y;

        System.out.println("20 + 10 = " + sum.sumTwoNumber(20,10));
        System.out.println("20 - 10 = " + minus.minusTwoNumber(20,10));
        System.out.println("20 * 10 = " + multiple.MultipleTwoNumber(20,10));
        System.out.println("20 / 10 = " + division.DivisionTwoNumber(20,10));
    }
}
