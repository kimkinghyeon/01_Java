package com.ohgiraffers.secation02.looping;

import java.util.Scanner;


public class A_for {
    public void testExample0() {
        /*
         * "안녕하세요"를 5번 출력하기*/
        for (int i = 1; i <= 5; i++) {
            System.out.println("안녕하세요");
        }
    }

    public void testSimpleForStatement() {

        /*
         * [for문 표현식]
         *
         * for([초기식]; [조건식]; [증감식];) {
         *
         * // 조건을 만족할 경우 수행할 구문
         *
         * }
         *
         * */

        // 1부터 10까지 1씩 증가시키면서 i 값을 출력하는 기본 반복문
        for (int i = 15; i >= 10; i--) {

            System.out.println(i);
        }


    }

    public void testForExample() {

        /* 10명의 학생 이름을 입력받아 이름을 출력 해보자 */

        Scanner sc = new Scanner(System.in);

        // 첫번째 학생
//        System.out.println("1번째 학생의 이름을 입력해주세요");
//        String student1 = sc.nextLine();
//        System.out.println("1번째 학생의 이름은 " + student1 + "입니다.");

//        for ( int i =1; i <= 10; i++) {
//
//        System.out.println(i + "번째 학생의 이름을 입력해주세요");
//        String student = sc.nextLine();
//        System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");

    }


    public void testExample2() {

        /*
         * 1 ~ 10까지의 합계를 구하시오
         *
         * 1부터 10까지 1씩 증가시키면서, 값을 저장할 변수(total)에 계속 누적시켜 저장된 값을 출력하세요
         * */

        int num1 = 1;


        // 어떤걸 반복하면 좋을지?
        // 1. 변수(total) 1씩 증가하는 값을 담기
        // 2. 저장된 변수(num)을 total에 누적시키기

        int total2 = 0;

        for (int num = 1; num <= 10; num++) {

            total2 += num;
            // total2 = total2 + num;

        }
        System.out.println("total2 : " + total2);

    }

    public void testExample3() {

        /*
         * 5~10 사이의 난수를 발생시켜서
         * 1부터 발생한 난수까지의 합을 구해보자
         *
         *
         * */

        int random = (int) (Math.random() * 6) + 5;

        int total2 = 0;
        for (int num = 1; num <= random; num++) {

            System.out.println("total2 = " + total2 + " + " + num);

            total2 += num;

        }

        System.out.println("total2 : 1부터 " + random + "까지의 합은 " + total2);


    }

    public void testExample4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수 입력 :");
        int first = sc.nextInt();
        System.out.println("두번째 정수 입력 :");
        int second = sc.nextInt();

        int total = 0;

        System.out.println("first : " + first);
        System.out.println("second : " + second);
        //첫 번째 정수가 더 큰경우 (first > second)
        if (first > second) {
            for (int i = second; i <= first; i++) {
                total = total + i;
            }
        } else {
            for (int i = first; i <= second; i++) {
                total = total + i;
            }
        }
        System.out.println("total = " + total);
    }
}


