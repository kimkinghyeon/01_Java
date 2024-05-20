package com.ohgiraffers.section01.practice;

import java.util.Scanner;

public class Practice2 {
    public void testSihuem(){
        //영어와 수학의 점수를 입력 받는다.
        //        두 과목의 평균이 60 점 이상이고,
        //두 과목 모두다 40 점 이상이여야 합격이 가능하다.
        //평균이 60 점 미만일 경우 “시험 불합격”
        //60 점은 넘지만 한과목이 40 점 미만일 경우 “한과목 과락으로 인한 불합격”
        //두 조건다 통과할경우 “시험 합격”
        //을 출력한다.
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 영어 점수는 몇점입니까?");
        int num = sc.nextInt();
        System.out.println("당신의 수학 점수는 몇입니까?");
        int num1 = sc.nextInt();
        int sum;
        double average;
        sum = num + num1;
        average = sum / 2.0;
        if (average < 60){
            System.out.println("시험 불합격입니다.");
        } else if (num < 40 || num1 < 40) {
            System.out.println("한 과목 과락으로 불합격입니다.");
        } else{
            System.out.println("시험 합격입니다.");
        }
    }
}
