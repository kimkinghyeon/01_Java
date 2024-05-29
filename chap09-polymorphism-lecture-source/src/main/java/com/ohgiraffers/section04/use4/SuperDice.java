package com.ohgiraffers.section04.use4;

public class SuperDice implements Dice {

    private int MAX_NUM;
    private int MIN_NUM;

    public SuperDice() {
        this.MAX_NUM = 10;
        this.MIN_NUM = 1;
    }

    @Override
    public int getNumber() {
        int num = (int) (Math.random() * 10) + 1;// 0.xxxxx -> 곱하기 2
        return num;
    }
}
