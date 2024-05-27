package com.ogiraffers.secation01.init;

public class Car {

    // 모델 이름
    private String modelName;
    // 최고 솔력
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    // 필드값 출력 메소드
    public String driveMaxSpeed(){
        System.out.println(modelName + " 이(가) 최고시속" + maxSpeed + " km/h로 달려갑니다.");
        return "";
    }
}
