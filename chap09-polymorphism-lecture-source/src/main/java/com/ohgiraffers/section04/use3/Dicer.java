package com.ohgiraffers.section04.use3;

public class Dicer implements Dice {

    public void throwDice(Dice dice){
        int diceNumber = dice.getNumber();
        System.out.println("하하 내가 나온 숫자는 [" + diceNumber + "] 다. ");
    }

    @Override
    public int getNumber() {
        return 0;
    }
}
