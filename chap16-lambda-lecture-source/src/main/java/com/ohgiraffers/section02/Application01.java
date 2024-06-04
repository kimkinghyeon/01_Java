package com.ohgiraffers.section02;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.*;

public class Application01 {

    public static void main(String[] args) {

        /* 표준 함수적 인터페이스
         * JDK 8 자주 사용되는 함수적 인터페이스를 표준 API 로 제공하고있다.
         * Consumer : 리턴값이 없는 accept() 메소드를 가지고있다.(매개변수 소비자 역할)
         * Supplier : 매개변수가 없고, 리턴값이 있는 getxxx()( 메소드를 가지고 있다.
         * Function : 매개변숭하 리턴값이 apllyxxx() 메소드를 가지고있다.(매개변수를 리턴값으로 매핑)
         * Operator : Function 과 똑같이 allyxxx() 메소드를 가지고 있는데,
         *            매개변수로 연산을 한 후 통일된 타입으로 리턴
         * Predicate : 매개변수와 boolean 값을 반환하는 testxxx() 메소드를 가지고 있다. (매개변수를 활용해서 boolean 값을 리턴) */

        Runnable runnable = () -> System.out.println("ㅎㅇ");
        runnable.run();
        // Consumer<T>#accept(T t) : void : 객체 T 를 받아 소비
        System.out.println("========== Consumer ==========");
        System.out.println();
        Consumer<String> consumer = (str) -> System.out.println(str + " 이(가) 출력");
        consumer.accept("hi");
        // BiConsumer<T, U>#accept(T t,U u) : void : 객체 T,U 를 받아 소비
        System.out.println("========== BiConsume ==========");
        System.out.println();
        BiConsumer<String, LocalTime> biConsumer = (str,time) -> System.out.println(str + " 이(가) " + time +" 에 출력됨");
        biConsumer.accept("시간은 워치 시간은 워치",LocalTime.now());
        // IntConsumer#accept(int value) : void : int 값을 받아서 소비
        System.out.println("========== IntConsumer ==========");
        System.out.println();
        IntConsumer intConsumer = (num) -> System.out.println("입력 정수제곱" + (num*num));
        intConsumer.accept(15);
        // LongConsumer#accept(long value) : void : long 값을 받아서 소비
        System.out.println("========== LongConsumer ==========");
        System.out.println();
        LongConsumer longConsumer = num -> System.out.println("입력 정수" + num);
        longConsumer.accept(12345);
        // ObjIntConsumer<T>#accept(T t,int value) : void : 객체 T 와 int 값을 받아서 소비
        System.out.println("========== ObjIntConsumer ==========");
        System.out.println();
        ObjIntConsumer<java.util.Random> objIntConsumer =
                (random, value) -> System.out.println("0 ~ " + value + " 전 까지의 난수" + random.nextInt(value));
        objIntConsumer.accept(new java.util.Random(),10);
        // ObjLongConsumer<T>#accept(T t,long value) : void : 객체 T 와 long 값을 받아서 소비
        System.out.println("========== ObjLongConsumer ==========");
        System.out.println();
        ObjLongConsumer<LocalDate> objLongConsumer =
                (date,days) -> System.out.println(date + "의 " + days + " 일 후의 날짜" + date.plusDays(days));
        objLongConsumer.accept(LocalDate.now(),10);
        // ObjDoubleConsumer<T>#accept(T t) : void : 객체 T 와 double 값을 받아서 소비
        System.out.println("========== ObjDoubleConsumer ==========");
        System.out.println();
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer =
                (sb,doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대 값 :"),-123.5);
    }

}
