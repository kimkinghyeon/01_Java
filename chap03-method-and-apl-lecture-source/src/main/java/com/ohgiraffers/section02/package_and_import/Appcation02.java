package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.calculator;

import java.util.Date;

import static com.ohgiraffers.section01.method.calculator.staticMaxNumber0f;

public class Appcation02 {
    public static void main(String[] args) {

        /*
        * 임포트
        *
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우, 패키지명을 포함한 풀 클래스 이름을
        * 사용해야하지만 너무 길다.
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
        * */

        calculator calc = new calculator();
        int min = calc.nonStaticNumber0f(50, 60);

        System.out.println("50과 60 중 더 작은것은 ? " + min);

        // static 메소드 경우
        int max = staticMaxNumber0f(100, 200);

        System.out.println("100과 200 중 더 큰것은 ? " + max);

        int max2 = staticMaxNumber0f(100, 200);
        System.out.println(" 100과 200 중 더 큰것은 ? " + max2);

        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());


    }
}
