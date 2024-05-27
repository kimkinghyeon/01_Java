package com.ogiraffers.secation01.init;

public class Application {
    public static void main(String[] args) {
        /*
         * 객체배열
         *
         * 객체배열은 레퍼런스변수에 대한 배열이다,.
         * 생성한 인스턴스도 배열을 이용해서 관리하며
         * 동일한 타입의 여러개 인스턴스를 각가 취급하지 않고 연속 처리할 수 있어서 좋다
         * 또한 반환값이 1개의 값만 반환 할 수 있기 때문에
         * 동일한 타입의 여러 인스턴스를 반환해야하는 경우 객체배열을 이용 할 수 있다.*/

        Car car1 = new Car("킬라", 300);
        Car car2 = new Car("르샬라", 300);
        Car car3 = new Car("타길라", 300);
        Car car4 = new Car("세니타", 300);
        Car car5 = new Car("글루하", 300);

        System.out.println("================ 객체 배열 이용 안함 ================");
        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        Car[] carArray = new Car[5];

        carArray[0] = car1;
        carArray[1] = car2;
        carArray[2] = car3;
        carArray[3] = car4;
        carArray[4] = car5;

        carArray[0] = new Car("킬라", 300);
        carArray[1] = new Car("르샬라", 300);
        carArray[2] = new Car("타길라", 300);
        carArray[3] = new Car("세니타", 300);
        carArray[4] = new Car("글루하", 300);

        System.out.println("================== 객체 배열 이용 ===================");
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }

        // 객체 배열도 할당과 동시에 초기화 가능
        Car[] carArray2 = {car1, car2, car3, car4, car5};

        Car[] carArray3 = {
                new Car("킬라", 300)
                ,new Car("르샬라", 300)
                ,new Car("타길라", 300)
                ,new Car("세니타", 300)
                ,new Car("글루하", 300)
        };
        System.out.println("================ 할당과 동시에 초기화 ================");
        for (Car c : carArray3){
            c.driveMaxSpeed();
        }

    }
}
