package com.ohgiraffers.section03;

import java.util.function.Function;

public class Application02 {
    public static void main(String[] args) {

        Function<String, Account> function = Account::new;

        Account account1 = function.apply("홍 홍 홍");
        Account account2 = function.apply("김 김 김");
        Account account3 = function.apply("이 이 이");
        Account account4 = function.apply("배 배 배");

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);


    }
}
