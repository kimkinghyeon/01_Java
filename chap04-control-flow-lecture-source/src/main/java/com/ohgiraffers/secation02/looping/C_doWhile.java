package com.ohgiraffers.secation02.looping;

import java.util.Scanner;

public class C_doWhile {
    /*
     * doWhile 문 표현식
     *
     * [초기식]
     *
     * do{
     *
     * // 반복할 코드
     * // 1회차에는 무조건 실행하고 이후에는 조건식을 확인해 만족하는 경우 수행되는 코드.
     *   [증감식]
     * } while([조건식])
     * */
    public void testSimpleDoWhileStatement() {
        do {
            System.out.println(" 최소 한번은 동작함 ..... ");
        } while (false);

        System.out.println(" 반복문 종료 확인 ..... ");
    }

    public void testDoWhileExample1() {

        // 키보드로 문자열을 입력받아 반복적으로 출력

        Scanner sc = new Scanner(System.in);

        String str = "";

        do {
            // 반복할 코드
            // 1회차에는 무조건 실행하고 이후에는 조건식을 확인해 만족하는 경우 수행되는 코드
            // [증감식]
            System.out.println(" 문자열을 입력하세요 : ");
            str = sc.nextLine();
            System.out.println(str);

            /*
             * equals () : 문자열은 == 비교가 불가능하다. String 클래스에서 제공하는 equals() 기능으로 비교 가능하다.
             * */

        } while (!str.equals("exit"));
        System.out.println(" 프로그램을 종료합니다.");
    }

    public void testSimpleContinueStatement2() {

        // contunue 모든 반복문을 건너 뛰는 것이 아닌. 자신에게 가장 인접한 반복문 실행만 건너뛴다.

        /* 구구단 2 ~ 9 까지 출력
         * 각 단의 수 가 짝수인 경우 출력을 생략한다.
         * */
        for (int dan = 2; dan < 10; dan++) {
            System.out.println(dan + "단 입니다.");

            System.out.println();

            for (int su = 1; su < 10; su++) {

                if (su % 2 == 0) {
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();

        }

    }
}