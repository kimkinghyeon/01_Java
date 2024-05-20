package com.ohgiraffers.section01.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practice1 {
    public void testPractice1() {

//   ”놀이기구를 탑승 하실 수 있습니다.”를 출력하고,
//   조건이 하나라도 충족되지 않을 경우
//  ”놀이기구를 탑승 하실 수 없습니다.”를 출력한다.

//   + 문제
//   어떤 조건에 의해 탑승할 수 없는지 이유를 같이 출력해준다.
//   - “나이가 9살 미만이라 탑승 하실 수 없습니다.”
//   - “키가 110cm 미만이라 탑승 하실 수 없습니다.”
//   - “나이가 9살 미만이고, 키가 110cm 미만이라 탑승하실 수 없습니다.”
        System.out.println("놀이랜드에 오신것을 환영합니다.");
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 나이는 몇살입니까?");
        int num = sc.nextInt();
        System.out.println("당신의 키는 몇입니까?");
        float num1 = sc.nextFloat();

        if (9 >= num){
            System.out.print("나이가 9살미만입니다.");
        } else if (9 < num){
            System.out.print("탑승가능한 나이입니다.");
        } if (110 >= num1){
            System.out.println("키가 110cm 미만이라 탑승하실 수 없습니다.");
        } else if (110 <= num1) {
            System.out.println("탑승할 수 있는 키 입니다.");
        }
        System.out.print("좋은 시간보내세요.:)");
    }


}
