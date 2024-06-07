package com.ogiraffers.section02.terminal;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application01 {

    public static void main(String[] args) {

        /* Calculating
        * 수학연산과 관련된 , 다양한 메소드를 제공하는데 , 최소,최대,종합 등의 결과를 보여준다. */

        long count = IntStream.range(1,10).count();
        long sum = IntStream.range(1,10).sum();


        // count() : 스트림에 담겨있는 갯수를 반환
        System.out.println("count = " + count);
        // sum() : 스트림에 담겨있는 숫자들을 종합을 반환
        System.out.println("sum = " + sum);
        System.out.println("sum = " + sum);

        System.out.println("========== Sum 활용 ==========");

        int oddSum = IntStream.range(1,10)
                .filter(i -> i % 2 == 1) // 1,3,5,7,9
                .sum();
        System.out.println("oddSum = " + oddSum); // 1,3,5,7,9 = 25

        // OptionalInt 값이 존재할 수도 없을 수도 있다. Int 타입

        OptionalInt max = IntStream.range(1,10).max();
        OptionalInt min = IntStream.range(1,10).min();
        System.out.println("========= max min =========");
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }

}
