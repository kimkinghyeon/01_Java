package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price,int money) throws Exception {
        System.out.println("가지고 있는돈 : " + money + "원 입니다.");

        if (money >= price){
            System.out.println("상품을 구입하기 위한 충분한 금액입니다.");
        } else {

            /* 강제로 예외 발생
            * 예외를 발생 시키고 메소드 헤드에 throw 구문을 추가
            * 예외를 발생시키는 쪽에서는 throw 로 예외에 대한 책임을 위임해서
            * 해당 예외에 대한 처리를 강제화 시킨다.*/

            throw new Exception();

        }

        System.out.println("욜로화이팅^^");
    }

}
