package com.ohgiraffers.section06.ternary;

public class Appcation01 {
    public static void main(String[] args) {

        /*
        * 삼항연산자
        * 자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        * 항목 3개
        * (조건식) ? ((true)참일때 사용할 값) : ((false)거짓일 때 사용할 값)
        * 조건식 : 반드시 결과가 true 또는 false가 나오게 작성해야함
        * 비교/논리 연산자가 주로 사용됨
        * */

        // 삼항연산자 단독 사용
        int num1 = 10;
        int num2 = -10;

        String result1 = (num1 > 0) ? "양수다." : "양수가 아니다.";
        System.out.println("result1 = " + result1);
        String result2 = (num2 > 0) ? "양수다." : "양수가 아니다.";
        System.out.println("result2 = " + result2);

        // 삼항연산자 중첩 사용

        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0) ? "양수다." : (num3 == 0) ? "0이다. " : "음수다.";
        String result4 = (num4 > 0) ? "양수다." : (num4 == 0) ? "0이다. " : "음수다.";
        String result5 = (num5 > 0) ? "양수다." : (num5 == 0) ? "0이다. " : "음수다.";
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);

    }
}
