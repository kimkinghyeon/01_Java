package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Appcation01 {
    public static void main(String[] args) {

        // java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        // java.lang은 패키지 이름 생략가 능
        // java.util.Scanner scanner = new java.util.Scanner(System.in);

        //java.lang은 패키지 이름 생략 가능
        //java.util.Scanner scanner = new java.util.Scanner(System.in);

        Scanner sc = new Scanner(System.in);


        //int num = sc.nextInt();

       // System.out.println(num);

        // 자료형별 값 입력 받기
        /*
         * 문자열 입력 받기
         *
         * nextLine() : 입력받은 값을 문자열로 반환해준다.
         *
         * */

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은" + name + "입니다");

        /*
         * 정수형 값 입력받기
         *
         * nextInt() : 입력받은 값을 int 형으로 반환해준다.
         * */

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt(); // 매개변수 : 진법
        System.out.println("입력하신 나이는 " + age + "입니다");

        // nextByte(), nextShort()

        /*
         * 정수형(long)
         *
         * nextLong() : 입력받은 값을 long형으로 반환해준다.
         * */

        System.out.print("원하는 월급을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money + "입니다");

        /*
         * 실수형(float)
         *
         * nextFloat() : 입력받은 값을 float형으로 반환해준다.
         * */
        Scanner sc1 = new Scanner(System.in);
        System.out.print("키를 입력해주세요 : ");
        float height = sc1.nextFloat();
        System.out.println("입력하신 키는 " + height + "cm입니다");

        System.out.println("아무 문자나 입력하세요");
        String str = sc.nextLine();
        char ch = str.charAt(0);
        System.out.print("입력하신 문자는 : " + ch + "입니당.");
    }
}
