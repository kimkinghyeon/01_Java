package com.ohgiraffers.section01.exception;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        Scanner sc = new Scanner(System.in);

        System.out.println("물거의 가격을 입력해주세요");
        int price = sc.nextInt();
        System.out.println("소지하고 있는 돈을 입력해주세요");
        int menoy = sc.nextInt();;

        try {
            et.checkEnoughMoney(10000,50000);
            System.out.println("욜로족 ㅊㅋ");
        } catch (Exception e) {
            System.out.println("~거지~");
        }
        System.out.println("프로그램좀료");

    }
}
