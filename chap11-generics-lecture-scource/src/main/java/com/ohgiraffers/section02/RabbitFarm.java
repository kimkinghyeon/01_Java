package com.ohgiraffers.section02;
// 제네릭 사용시
// 인터페이스 상속이 implements 키워드 대신 extends 사용
// public class RabbitFarm<T implements Animal> { => 에러
// public class RabbitFarm <T extends Animal> { => 정상
public class RabbitFarm <T extends Rabbit> {

    // 현 상황에서는 타입이 어떤걸로 선택될지 모르지만,
    // Rabbit 이나 Rabbit 을 상속받는 Bunny,DrunkenBunny 토끼의 후손만 가능
    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
