package com.ogiraffers.section02.generation.itermediate;

import javax.swing.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application03 {

    public static void main(String[] args) {

        /* Stream<T> sorted();
        Stream<T> sorted(Comparator<? super T> component);
        sorted() 인자가 없어도 호출이 가능, 인자가 없으면 오름차순으로 자동 정렬 */
        System.out.println("===================== 오름차순 ====================");

        List<Integer> integersList = IntStream.of(5,10,99,2,1,33)
                .boxed()
                .sorted()
                .toList();
        System.out.println("integersList = " + integersList);

        System.out.println("===================== 내림차순 ====================");
//                .sorted(Comparator.reverseOrder())
        List<Integer> integersList1 = IntStream.of(5,10,99,2,1,33)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("integersList = " + integersList1);
    }
}
