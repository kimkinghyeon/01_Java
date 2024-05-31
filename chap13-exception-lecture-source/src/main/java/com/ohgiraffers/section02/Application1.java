package com.ohgiraffers.section02;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /* 사용자 정의의 예외클래스
        *
        * Runtime[Exception 의 후손 대부분을 예외처리를 강제화 하지않음
        * 이런경우에도 예외를 강제화 하고 싶으을 떄는, 사전에 정의된 예외클래스 외에
        * 개발자*/

        ExceptionTest et = new ExceptionTest();
        Scanner sc = new Scanner(System.in);
        System.out.println("상품 가격");
        int price = sc.nextInt();
        System.out.println("지갑");
        int money = sc.nextInt();

        try {

            et.checkEnoughMoney(price,money);

        } catch (Exception e) {

            // Exception 출력 - 로그를 남김
            e.printStackTrace();
        }

    }
}
