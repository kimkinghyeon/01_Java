package com.ohgiraffers.section04.use3;
//- Dice 인터페이스를 구현한 구현체
//- min 과 max 를 필드로 가지고 있다.
//- min과 max는 각각 1과 10으로 기본생성자를 통해 초기화된다.
//        - getNumber() 시 min ~ max까지의 랜덤한 수를 출력해준다.
public class SuperDice implements Dice {

    private int MIN_NUM;
    private int MAX_NUM;

    public SuperDice() {
        MIN_NUM = 1;
        MAX_NUM = 10;
    }

    @Override
    public int getNumber() {
        int random = (int)(Math.random()*(MAX_NUM - MIN_NUM + 1) + MIN_NUM);

        return random;
    }

    @Override
    public void throwDice(Dice dice) {

    }
}

