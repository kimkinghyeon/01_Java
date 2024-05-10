package com.ohgiraffers.section1.literal;

public class Application2 {
    public static void main(String[] args) {

        // 수업 목표 : 값을 직접 연산하여 출력 할 수 있다.
        // 이 떄 값의 형태에 따라 사용 할 수 있는 연산자의 종류와 결과가 달라진다.

        // 정수와 정수의 연산
        System.out.println("========== 정수와 정수의 연산 ==========");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 % 10); // 나누기를 한 나머지 값
        System.out.println(123 / 10); // 나누기를 한 목의 값

        // 실수와 실수의 연산
        System.out.println("========== 실수와 실수의 연산 ==========");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23); // 계산의 결과는 실수의 형태로 나온다.
        System.out.println(1.23 * 10);
        System.out.println(1.23 / 10);
        System.out.println(1.23 % 1.0);

        // 정수와 실수의 연산
        // 정수와 실수를 연산을 하면 결과는 항상 실수가 나온다.
        System.out.println("========== 정수와 실수의 연산 ==========");
        System.out.println(123 + 0.5); // 실수
        System.out.println(123 - 0.5); // 실수
        System.out.println(123 * 0.5); // 실수
        System.out.println(123 / 0.5); // 실수
        System.out.println(123 % 0.5); // 실술

        // 문자와 문자의 연산
        // 문자는 내부적으로 숫자로 인식되어 연산된다.
        System.out.println("========== 문자와 문자의 연산 ==========");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        // 문자와 정수의 연산
        System.out.println("========== 문자와 정수의 연산 ==========");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 10);
        System.out.println('a' / 10);
        System.out.println('a' % 10);

        // 문자와 실수의 연산
        // 결과는 실수의 형태로 나온게 된다.
        System.out.println("========== 문자와 실수의 연산 ==========");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 10.0);
        System.out.println('a' / 10.0);
        System.out.println('a' % 10.0);

        /*
        * 결론은 문자는 내부적으로 숫자 취급을 한다.
        * */

        // 문자열과 문자열의 연산
        // 문자열과 문자열의 연산은 합치기(이어붙이기)가 된다. 문자열이 하나의 문자열이됨)
        // 예) "hello" + "world" = helloworld
        // 문자열과 문자열의 연산은 '+' 연산만 가능하다.
        System.out.println("========== 문자열과 문자열의 연산 ==========");
        System.out.println("hello" + "world!");
        //System.out.println("hello" - "world!");
        //System.out.println("hello" * "world!");
        //System.out.println("hello" / "world!");
        //System.out.println("hello" % "world!");

        // 문자열과 다른 형태의 값 연산
        System.out.println("========== 문자열과 다른형태의 값 연산 ==========");
        System.out.println("kimkang" + 123); // 정수와의 연산
        System.out.println("kimkang" + 123.456); // 실수와의 연산
        System.out.println("kimkang" + 'a'); // 문자와의 연산
        System.out.println("kimkang" + true); // 논리값과의 연산

        // 주의해야할점 숫자로된 문자열 형태의 값도 + 연산을 했을떄 문자열 합치기가 된다.
        System.out.println("123" + "456"); // 123456









    }
}

