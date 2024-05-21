package com.ohgiraffers.secation02;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {


        int[][] iarr = new int[3][5];

        iarr[0][0] = 1;
        iarr[0][1] = 2;
        iarr[0][2] = 3;
        iarr[0][3] = 4;
        iarr[0][4] = 5;

        iarr[1][0] = 6;
        iarr[1][1] = 7;
        iarr[1][2] = 8;
        iarr[1][3] = 9;
        iarr[1][4] = 10;

        iarr[2][0] = 11;
        iarr[2][1] = 12;
        iarr[2][2] = 13;
        iarr[2][3] = 14;
        iarr[2][4] = 15;

        System.out.println(" 문제 2");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(" 입력" );
        for(int i = 0; i < iarr.length; i++){

            for(int j = 0; j < iarr[i].length; j++){
                iarr[i][j] = num;
                num++;
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("0번째 인덱스 배열");
        System.out.print(iarr[0][0] + " ");
        System.out.print(iarr[0][1] + " ");
        System.out.print(iarr[0][2] + " ");
        System.out.print(iarr[0][3] + " ");
        System.out.print(iarr[0][4] + " ");
        System.out.println();

        System.out.println("1번째 인덱스 배열");
        System.out.print(iarr[1][0] + " ");
        System.out.print(iarr[1][1] + " ");
        System.out.print(iarr[1][2] + " ");
        System.out.print(iarr[1][3] + " ");
        System.out.print(iarr[1][4] + " ");
        System.out.println();

        System.out.println("2번째 인덱스 배열");
        System.out.print(iarr[2][0] + " ");
        System.out.print(iarr[2][1] + " ");
        System.out.print(iarr[2][2] + " ");
        System.out.print(iarr[2][3] + " ");
        System.out.print(iarr[2][4] + " ");
        System.out.println();

        System.out.println(" 문제 ");
        for (int j = 0; j < iarr.length; j++) {

            System.out.println(j + "번째 인덱스 배열");

            // 각 인덱스의 배열값에 차례로 출력하는 반복문
            for (int i = 0; i < 5; i++) {
                System.out.print(iarr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
