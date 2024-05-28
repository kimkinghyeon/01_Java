package com.ohgiraffers.section04.use3;

public class Application {
    public static void main(String[] args) {

        //Dice dice = new HellDice();// SuperDice 로 변경해도 작동되게
        Dice dice = new SuperDice();// SuperDice 로 변경해도 작동되게

        Dice dice1 = new Dicer();

        dice1.throwDice(dice);
    }
}
