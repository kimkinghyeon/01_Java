<<<<<<< HEAD
package com.ogiraffers.section02.terminal;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application02 {

    public static void main(String[] args) {

        /* reduce
        * 스트림에 있는 모든 요소를 누적시킨다.
        * Optional<T> reduce(BinaryOperator<T>accumulator);
        * T reduce(T identity, BinaryOperator<T> accumulator); */

        // 인자가 1개일 경우
        OptionalInt reduceOneParam = IntStream.range(1,4) // 1,2,3
//                .reduce((a,b) ->{
//                    return Integer.sum(a,b);
//                });
        .reduce(Integer::sum);
        System.out.println("reduceOneParam = " + reduceOneParam); // 1 + 2 + 3
        // 인자가 2개일 경우
        int reduceTwoParam = IntStream.range(1,4) // 1, 2, 3
                .reduce(100,Integer::sum); // 100 부터 Stream 안의 요소를 누적시켜라
        System.out.println("reduceTwoParam = " + reduceTwoParam); // identity -> 초기값


    }

=======
package com.ogiraffers.section02.terminal;public class Application02 {
>>>>>>> c865fb1d7ff669dec49004731169a22c0b91063e
}
