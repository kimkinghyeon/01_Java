package com.ohgiraffers.section02;

import java.util.Objects;
import java.util.function.Predicate;

public class Application05 {
    public static void main(String[] args) {

    /* Predicate : 매개변수의 boolean 리턴값이 있는 testXXX() 를 가지고 있따.
    *              이 메소드들은 매개변수 값을 이용하여 true 혹은 false 값을 리턴하는 역할

    Predicate<T>#test(T t) : boolean : T 를 조사하여 boolean 을 리턴 */
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인 : " + predicate.test("123")); //true
        System.out.println("문자열인지 확인 : " + predicate.test(123));   //false
    }
}
