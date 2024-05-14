package com.ohgiraffers.section03.increment;

public class Appcation01 {
    public static void main(String[] args) {


        /*
        * 증강 연산자
        *
        * 피연산자의 앞 or 뒤에 사용이 가능하다.
        * '++' : 1 증가의 의미
        * '--' : 1 감소의 의미
        * */

        // 단항으로 사용될떄
        int num = 20;
        System.out.println("num = " + num); //20

        num++;
        System.out.println("num = " + num); //21

        ++num;
        System.out.println("num = " + num); //22

        num--;
        System.out.println("num = " + num); //21

        --num;
        System.out.println("num = " + num); //20

        // 증감연산자를 다른 연산자와 함꼐 사용
        /*
        * 증감연산자는 다른 연산자와 함꼐 사용할 떄 의미가 달라진다.
        * '++var' : 피연산자의 값을 먼저 1을 증가시킨후 다른 연산을 진행한다.
        * 'var++' : 다른 연산을 먼전 진행하고 난 뒤 마지막에 피연산자의 값을 1증가시킨다.
        * 'var--' : 다른 연산을 먼저 진행하고 난듸에 마지막에 피연사자의 값을 1 감소시킨다.
        * '--var' : 피연산자의 값을 먼저 1을 감소시킨후 다른 연산을 진행한다.
        * */

        int firstNum = 20;

        int result1 = firstNum++ * 3;
        System.out.println("result1 = " + result1);
        System.out.println("result1 = " + firstNum);

        int secondNum = 20;
        int result2 = ++secondNum * 3; // 63
        System.out.println("result2 = " + result2);
        System.out.println("secondNum = " + secondNum);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum = " + addNum);
        System.out.println("num1 = " + num1);

    }
}
