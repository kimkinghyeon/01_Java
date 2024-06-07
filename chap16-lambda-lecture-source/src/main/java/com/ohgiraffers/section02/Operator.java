package com.ohgiraffers.section02;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Operator {
    public static void main(String[] args) {

        /* Operator : 매개변수와 리턴값이 있는 apllyxxx() 메소드를 가지고있다.
         *             Function 과 거의 유사하지만 다른점음 매개변수를 이용해 연산을 한 후
         *             동일한 타입으로 리턴해 주는 것이 다르다.
         *
         * BinaryOperator<T>#apply(T t1,T t2) : T : T와 T를 연산하여 T를 리턴한다. */
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello","world"));

        // UnaryOperator<T>#apply(T t) : T : T를 연산하여 T를 리턴
        UnaryOperator<String> unaryOperator = (str) -> str + "world";
        System.out.println(unaryOperator.apply("hello"));



    }
}
