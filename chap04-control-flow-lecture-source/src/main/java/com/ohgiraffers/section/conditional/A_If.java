package com.ohgiraffers.section.conditional;

import java.util.Scanner;

public class A_If {

    /*
     * [if문 표현식]
     * of([조건식]){
     *   // 조건식이 ture 일 떄 실행할 명령문
     * }

     * 조건식 : ture of false 가 나오는 연산식을 조건식이라고 한다.
     * if 문은 조건식의 결과 같이 참(ture) 나오면 {} 안에 있는 코드를 실행하고,
     * 조건식의 결과 같이 거짓(false) {} 안에 있는 코드를 무시한다.
     **/

    public void testSimpLeIfStatement() {

        // 정수 한 개를 입력 받아 그 수가 짝수이면 " 입력하신 숫자는 짝수 입니다." 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요");
        int num = sc.nextInt();
        // 짝수가 아니면 출력하지 않는 코드를 작성한다.
        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수 입니다.");
        }
        // 단, 조건과 상관없이 프로그램이 종료될때 ' 프로그램을 종료합니다." 라고 출력
        System.out.println("프로그램을 종료합니다.");

    }

    public void testNestedIfStatement() {
        // 정수 한개를 입력받아
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 한 개를 입력하세요.");
        int num = sc.nextInt();
        // 그 수가 양수인 경우에만 짝수인지를 확인하여
        if (num > 0){
            // 짝수이면 " 입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고,
            if (num % 2 == 0) {
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }
        }
        // 둘 중 하나라도 해당하지 않는 아무 내용도 출력하지 않는 코드를 작성해보자.
        // 단, 조건과 상관 없이 프로그램이 종료될 떄 " 프로그램을 종료합니다. " 라고 출력되도록한다.
        System.out.println("프로그램을 종료합니다.");
    }
}
