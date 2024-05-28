package com.ogiraffers.section01.extend;

public class RacingCar extends Car {
    public RacingCar(){

        System.out.println("RacingCar 기본 생성자 호출 ...");

    }

    @Override
    public void run() {

        System.out.println("RacingCar 전속력으로 질주합니다.");
    }

    @Override
    public void soundHorn() {

        // 레이싱카는 경적을 울리지 않는다.
        System.out.println("RacingCar 경적있는거 봄? ");
    }

    @Override
    public void stop() {

        System.out.println("RacingCar Stop");
    }
}
