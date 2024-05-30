package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.Bunny;
import com.ohgiraffers.section02.DrunkenBunny;
import com.ohgiraffers.section02.Rabbit;
import com.ohgiraffers.section02.RabbitFarm;

public class Application {
    // extends : 특정타입만 사용하도록 제네릭 범위를 제한 할 수 있다.
    public static void main(String[] args) {

        /*
         * extends 키워드를 이용하여 특정 타입 만 사용하도록 범위지정
         * -> 지정한 특정 타입과 함계, 특정 타입의 자식타입들을
         * */

        // Animal 타입은  Rabbit 의 후손이 아니기 때문에 , 제네릭클래스 인스턴스 생성이 불가
        // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
        // RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();
        // RabbitFarm<snake> farm3 = new RabbitFarm<snake>();
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry(); // animal 의 타입? => Rabbit

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry(); // animal 의 타입 => Bunny

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry(); // animal 의 타입? => DrunkenBunny

    }
}
