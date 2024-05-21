package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Appcation04 {
    public static void main(String[] args) {

        /*
        * 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램*/
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;
        double avg = 0;
        // 점수를 입력 받는다.
        // 입력받은 점수를 Scores 배열에 저장
        for(int i = 0; i < scores.length; i++){
            // (초기 선언) ( 조건식 : 배열수(5) (칸을 옮긴다.)
            System.out.println((i + 1) +"번째 학생의 점수 :");
            // i + 1 번째 수 ()
            scores[i] = sc.nextInt();
            // scores [i] 점수(입력)
            // 입력값
        }
        // 배열에 값들을 합계 -> int
        for(int i = 0; i < scores.length; i++){
            // 값을 꺼낸다.
            sum = sum + scores[i];
            // 입력한 값 sum 을 더함 반복(5:입력값)
        }
        // 배열의 값들을 평균 -> 실수
        avg = (double) sum/5;
        System.out.println("sum :" + sum);
        System.out.println("avg :" + avg);
    }
}
