package com.ohgiraffers.section01.intro;

public interface OuterCalculator {

    // 내부 인터페이스
    @FunctionalInterface
    public interface Sum {
        int sumTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minusTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple {
        int MultipleTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Division {
        int DivisionTwoNumber(int a, int b);
    }
}
