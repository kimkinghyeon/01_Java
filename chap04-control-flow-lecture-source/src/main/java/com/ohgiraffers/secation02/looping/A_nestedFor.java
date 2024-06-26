package com.ohgiraffers.secation02.looping;

import java.util.Scanner;

public class A_nestedFor {

    // 중첩 for 문
    // 중첩 for 문 안에 for 문을 의미한다.
    public void printGugudanFromTwoToNine() {
        // 구구단 전체를 출력하는 기능

        for (int dan = 2; dan < 10; dan++) {
            System.out.println(dan + "단 입니다.");

            System.out.println();

            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            // 줄바꿈
            System.out.println();
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        for (int dan = 2; dan < 10; dan++) {
            // 단 * (1 ~ 9)
            printGugudan0f(dan);
            System.out.println();
        }
    }

    //한단씩 구구단을 출력하는 메서드
    public void printGugudan0f(int dan) {
        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    /* 키보드로 정수를 하나 입력받아 정수만큼 한 행에 "*"을 5개씩 출력하세요 */

    public void printStarInputRowTimes() {

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 행 수를 입력하세요.");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            System.out.print("*");
            printStar(row);
        }
    }

    public void printStar(int row) {
        for (int i = 1; i <= row; i++) {
            System.out.print("*");

        }
        System.out.println();
    }

    public void pirntTriangleStars() {
        /*
         * 키보드로 정수를 하나 입력받아, 해당 정수만큼 한 행에 "*"을 행의 번호개씩 출력하세요
         *
         * 예시) 정수를 입력하세요 : 5
         * *
         * **
         * ***
         * ****
         * *****
         * */

        // 매개변수로 받은 row 만큼 오른쪽으로 별을 찍는 메서드
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄의 수를 입력하세여.");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void triangStar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄의 수를 입력하세요.");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangStar1() {

        //Scanner sc = new Scanner(System.in);
        System.out.println("역방향 별찍기");
        //int row = sc.nextInt();

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangStar2(){

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            for(int j = 5; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void triangStar3(){
        for(int i = 1; i < 10; i +=2){
            for(int j = 9; j > i; j-=2){
                System.out.print(" ");
            }
        for(int j = 0; j < i; j++){
            System.out.print("*");
        }
            System.out.println();
        }

    }
}

