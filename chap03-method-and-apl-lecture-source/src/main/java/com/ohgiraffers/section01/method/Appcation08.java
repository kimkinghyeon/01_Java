package com.ohgiraffers.section01.method;

public class Appcation08 {
    public static void main(String[] args) {
        // static 메소드 호출
        // static 메소드 <-> non - static 메소드

        /*
        *  static 메소드를 호출하는 방법
        *  [클래스명].[메소드명]();
        * */

        System.out.println("10과 20의 합 :" + Appcation08.sumTwoNumbers(10,20));

        System.out.println("20과 30의 합 :" + sumTwoNumbers(20,30));
    }

    public static int sumTwoNumbers(int first, int second){

        return first + second;
    }
}
