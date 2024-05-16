package com.ohgiraffers.section01.method;

public class Appcation09 {
    public static void main(String[] args) {

        // 다른 클래스에서 작성한 메소드 호출

        int first = 100;
        int second = 50;

        /*
        * 사용준비
        * [클래스명] [사용할이름] = new [클래스명]();
        *
        * 사용
        * [사용할이름].[메소드명]();
        * */

        calculator calc = new calculator();
        int min = calc.nonStaticNumber0f(first, second);
        int max = calculator.staticMaxNumber0f(first, second);

        System.out.println("두 수 중 최소 값은 : " + min );
        System.out.println("두 수 중 최대 값은 : " + max);

    }
}
