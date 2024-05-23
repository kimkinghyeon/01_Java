package com.ohgiraffers.secation03.avstraction;

public class CartRaider {
    /* 1). 카레이서 클래스
     *   - 속성 : 자동차
     *   - 행위 : 시동을걸어라, 엑셀레이터를 밞아라, 브레이크를 밞아라, 시동을 꺼라 */
    private  final  BungBungE car = new BungBungE();
    public void startUp(){
        car.startUp();
    }
    public void stepAccelerator(){
        car.go();
    }
    public void stepBreak(){
        car.stop();
    }
    public void turnOff(){
        car.turnOff();
    }
}
