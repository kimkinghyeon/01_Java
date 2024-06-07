package com.ogiraffers.section02.generation.itermediate;

import java.util.stream.IntStream;

public class Application01 {
    public static void main(String[] args) {
    // 중간연산,중계연산

    /* Stream<T> filter(Predicate<? super T> predicate);
    * 필터(filter)는 스트림에서 특정 데이터만 걸래내는 메소드
    * 매개변수로 받는 Predicate 는 boolean 을 리턴하는 함수형 인터페이스 */

        IntStream intStream = IntStream.range(0,10); // 0 ~ 9
        // i % 2 == 0 인경우만 출력
        intStream.filter(i -> (i % 2) == 0 ) // 0,2,4,6,8
                .forEach(i -> System.out.print(i + "  "));

    }
}
