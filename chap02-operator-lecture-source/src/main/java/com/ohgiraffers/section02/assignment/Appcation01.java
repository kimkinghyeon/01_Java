package com.ohgiraffers.section02.assignment;

public class Appcation01 {
    public static void main(String[] args) {

        /*
        * 대입연산자와 산술 복합 대입 연산자
        * '=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
        * '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
        * '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
        * '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
        * '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
        * '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함 */

        int num = 10;
        int num2 = 10;

        num += 3;
        System.out.println(num); // 13
        num2 = num2 + 3;
        System.out.println(num2); // 13
        
        num -= 5; // num = num = -5; 13이라는 결과 값에서 더함
        System.out.println("num = " + num);

        num *= 2; // num = num * 2 8 이라는 결과 값에서 더함
        System.out.println("num = " + num);
        
        num /=2; // num = num / 2; 16 이라는 결과 값에서 더함
        System.out.println("num = " + num);

        num %=3; // num = num % 3; 8 이라는 결과 값에서 더함
        System.out.println("num = " + num);

        /* 주의 사항 : 산술 복합 대입연산자의 작성 순서에 주의해야한다.
        * 부호를 넣을때 주의 할것 예) num -= 1; (o) num =- 1; (x)※저장소 초기화 */

    }
}
