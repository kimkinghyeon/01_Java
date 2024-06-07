package com.ogiraffers.section02.terminal;

import java.util.Arrays;
import java.util.List;

public class Application04 {

    public static void main(String[] args) {

        /* match
        *
        * boolean anyMatch(Predicate<? super T> predicate);
        * // 하나라도 조건을 만족하는 값이 있는지
        * boolean allMatch(Predicate<? super T> predicate);
        * // 모든 조건을 만족하는지
        * boolean noneMatch(Predicate<? super T> predicate);
        * // 모든 조건을 만족하지 않는지 */

        List<String> stringList = Arrays.asList("Java","Spring","SpringBoot");
        // 하나라도 조건을 만족하는 값이 있는지 확인
        boolean anMatch = stringList.stream()
                .anyMatch(str -> str.contains("p")); // 문자열이 p를 포함하고 있는지
        System.out.println("anMatch = " + anMatch);

        // 모든 조건을 만족하는지
        boolean allMatch = stringList.stream()
                .allMatch(str -> str.length() >= 4); // 문자열의 길이가 4보다 같거나 크면
        System.out.println("allMatch = " + allMatch); // true

        // 모든 조건이 만족하지 않는지
        boolean noneMatch = stringList.stream()
                .noneMatch(str -> str.contains("z")); // 문자열에 z가 포함 하지 않는지
        System.out.println("noneMatch = " + noneMatch); // true

    }

}
