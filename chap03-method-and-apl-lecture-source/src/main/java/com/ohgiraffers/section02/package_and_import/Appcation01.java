package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.calculator;

public class Appcation01 {
    public static void main(String[] args) {

        /*
        * 패키지
        *
        * 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음으로 단위를 구성하는것
        * 같은 패키지 내에 동일한 이름의 클래스를 만들 수 없다.
        * 패키지가 다르면 동일한 이름의 클래스를 만들 수 있다.
        * => 클래스명은 원래 패키지 명을 포함하고 있기 때문
        * com.ohgiraffers.section01.method.calculator
        * com.ohgiraffers.section01.method.Appcation01
        * com.ohgiraffers.section02.package_and_import.Appcation01
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우에는
        * 클래스명 앞에 패키지명을 명시해서 풀 클래스 이름으로 사용해야한다.
        * */

        com.ohgiraffers.section01.method.calculator calc = new com.ohgiraffers.section01.method.calculator();
        int min = calc.nonStaticNumber0f(30, 20);

        System.out.println(" 다른 패키지에서 메소드 호출 (최소값) :" + min);

        //static 메소드
        int max = com.ohgiraffers.section01.method.calculator.staticMaxNumber0f(30,20);

        System.out.println(" 다른 패키지에서 메소드 호출 (최대값) :" + max);
    }
}
