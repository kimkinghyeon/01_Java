package com.ohgiraffers.section02;

public class WildCardFarm {
    // 매개변수로 전달받는 토끼농장을 구현할 떄 사용한 타입변수를 제한

    public void anyType(RabbitFarm<?> farm) {
        // Rabbit 에 포함한
        farm.getAnimal().cry();
    }
        // Bunny 이거나 Bunny 를 상속받은 토끼 농장만
    public void extendsType(RabbitFarm<? extends Bunny> farm){

        farm.getAnimal().cry();
    }
        // Bunny 이거나 Bunny 의 부모타입 토끼 농장만
    public void superType(RabbitFarm<? super Bunny> farm) {

        farm.getAnimal().cry();
    }

}
