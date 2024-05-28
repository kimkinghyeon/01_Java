package com.ohgiraffers.sectiaon01.polymorphism;

public class Application2 {
    public static void main(String[] args) {

        // 다향성을 적용해 객체 배열을 만들어 인스턴스를 연속 처리

        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        // Animal 클래스가 가지는 메소드를 오버라이딩한 메소드 호출시
        // 동적 바인딩을 이용가능

        for (int i = 0; i < animals.length; i++){
            animals[i].cry();
        }

        // 각 클래스 별 고유한 메소드를 동작
        // down-casting 을 명시적으로 해줘야함.
        // ClassCast Excetpion instanceof 연산자를 이용해서
        System.out.println("====================고유한 메소드 동작=======================");
        for (int i = 0; i < animals.length; i ++){

            if(animals[i] instanceof Rabbit) {
                ((Rabbit)animals[i]).jump();
            } else if (animals[i] instanceof Tiger) {
                ((Tiger)animals[i]).bite();
            }else {
                System.out.println("호랑이나 토끼가 아닙니다.");
            }
        }
    }
}
