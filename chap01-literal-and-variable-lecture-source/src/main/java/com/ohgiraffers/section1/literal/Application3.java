package com.ohgiraffers.section1.literal;

public class Application3 {
    public static void main(String[] args) {

        // 수업목표 : 문자열 합치기 결과를 예측하고 사용할 수 있다.
        System.out.println("======== 두개의 문자열 합차기========");
        System.out.println(9 + 9); // 뭐가 나올까? 18
        System.out.println("9" + 9); // 99
        System.out.println(9 + "9"); // 99
        System.out.println("9" + "9"); // 99

        System.out.println("======== 세개의 문자열 합차기========");
        // 더하기의 연산 순서를 알 수 있다.
        // '+' 연산은 방향은 왼쪽에서 오른쪽이다. ( 숫자 부터 합쳐짐 )
        System.out.println(9 + 9 + "9"); //189
        System.out.println(9 + "9" + 9); //999
        System.out.println("9" + "9" +9); //999

        System.out.println("9" + (9 + 9)); //918

        // 10과 20의 사칙연산 + 나머지연산 결과를 출력하세요.
        System.out.println("======== 10과 20의 사칙연산 결과========");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("======== 10과 20의 사칙연산 결과========");
        System.out.println( "10과 20의 합" + (10 + 20)); // 10과 20의 합 30
        System.out.println( "10과 20의 합" + (10 - 20));
        System.out.println( "10과 20의 합" + (10 * 20));
        System.out.println( "10과 20의 합 나누기한 몫" + (10 / 20));
        System.out.println( "10과 20의 합 나누기한 나머지"+ (10 % 20));




    }
}
