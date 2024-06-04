package com.ohgiraffers.section02;

import java.time.LocalDateTime;
import java.util.function.*;

public class Application02 {

    public static void main(String[] args) {

        /* Supplier : 매개변수가 없고 리턴값이 있는 getxxx() 메서드를 가진다.
        * Supplier<T>#get() : T : 객체 T를 리턴 */

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();

        LocalDateTime localDateTime = supplier.get();

        System.out.println(localDateTime);

        /* BooleanSupplier#getAsBoolean() : boolean : boolean 값을 리턴*/
        BooleanSupplier booleanSupplier = ()  -> {
            int random = (int) (Math.random() *2);
            return random == 0? false : true;
        };

        System.out.println("랜덤 true or false = " + booleanSupplier.getAsBoolean());

        /* IntSupplier#getAsInt() : int : int 값을 리턴*/
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) +1;
        System.out.println("주사위는 던저 졌다." + intSupplier.getAsInt());

        // DoubleSupplier#getAsDouble() : double : double 값을 리턴
        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random() 리턴값 = " + doubleSupplier.getAsDouble());

        // LongSupplier#getAsLong() : long : long 값을 리턴
        LongSupplier longSupplier = () -> new java.util.Date().getTime();
        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난시간 = " + longSupplier.getAsLong() + "시간");
    }
}
