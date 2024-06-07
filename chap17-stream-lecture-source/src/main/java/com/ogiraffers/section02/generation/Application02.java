package com.ogiraffers.section02.generation;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application02 {

    public static void main(String[] args) {

        /* 기본타입 스트림 생성
         * range(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자로 종료값 전까지 범위의 스트림생성
         * rangeClosed (시작값, 종료값) : 시작값부터 1식 증가하는 숫자로 종료값가기 범위의 스트림생성*/

        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("======== ========");

        LongStream longStream = LongStream.rangeClosed(5, 10);
        longStream.forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("======== ========");

        /* Wrapper 클래스자료형의 스트림으로 변환이 필요할 때 boxing 을 통해 할 수 있다.
         * doubles(갯수) :
         * boxed() : 기본 타입 스트림인 xxxStream 을 박싱하여 Wrapper 타입의 Stream<xxx>으로 반환 */

        // 실수형 랜덤 수 5개를 담은 doubleStream
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("======== ========");

        // 문자열을 intStream 으로 변환
        IntStream healloworldChars = "hello world".chars(); // 문자열을 int 형으로 변경
        healloworldChars.forEach(v -> System.out.print(v + " "));
        System.out.println();
//        System.out.println("======== ========");

        Stream<String> stringStream1 = Stream.of("java","oracle","jdbc");
        Stream<String> stringStream2 = Stream.of("html","css","javascript");

        // 스트림은 1회성으로 사용 가능하며, 이미 최종 연산이 끝난 스트림은 재사용이 불가능하다.
        // 다시 사용할시 IllegalStateException 이 발생한다.(아. 예외처리 ㅋㅋ)
//        stringStream1.forEach(System.out::println);
//        System.out.println("======== ========");
//        stringStream2.forEach(System.out::println);

        // concat() : 두개를 스트림을 동일 타입 스트림으로 합치기
        System.out.println("======== concatStream ========");
        Stream<String> concatStream = Stream.concat(stringStream1,stringStream2);
        concatStream.forEach(System.out::println);

    }

}
