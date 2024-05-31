package com.ohgiraffers.section02;

import com.ohgiraffers.section02.exception.MoneyNegativeException;
import com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price,int money) throws Exception {

        if (price < 0){
            throw new PriceNegativeException("상품 가격이 음수임 말이됌?");
        }

        if(money < 0){

            throw new MoneyNegativeException("가지고 있는 돈이 어떻게 음수임, 병형신이야?");
        }

        if (money >= price){
            System.out.println(".상품을 구입하기 위한 금액 맞음");
        } else{

            throw new NotEnoughMoneyException("가지고 잇는 돈 보다 상품 가격이 더 비싸\n" +
                    "나가 거지얌");
        }
    }
}
