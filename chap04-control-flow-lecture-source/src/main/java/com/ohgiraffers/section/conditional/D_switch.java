package com.ohgiraffers.section.conditional;

import java.util.Scanner;

public class D_switch {

    /*
    *
    * switch문 표현식
    *
    * switch([비교할변수]) {
    *   case [비교값1] : 비교값1과 일치하는 경우 실행할 구문; break;
    *   case [비교값2] : 비교값2과 일치하는 경우 실행할 구문; break;
    *   default : case에 모두 해당하지 않는 경우 실행할 구문; break;
    * }
    *
    * 여러개의 비교값중 일치하는 조건에 해당하는 로직을 실행하는 것
    * if-else-if와 유사하다. 일부 호환도 가능하다.
    * switcg문으로 비교가능한 값은 정수, 문자, 문자열 형태의 값이다.
    * 정확하게 일치하는 경우만 비교가 가능하다.
    * case절에는 변수를 사용 할 수 없다. (값만 비교 가능)
    *
    * 정수 두개와 연사자 기호 문자를 입력 받아서
    * 두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
    * */

    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.println("두번째 정수 입력 : ");
        int second = sc.nextInt();

        System.out.println("연산 기호 입력 (+,-,*,/,%) : ");
        char op = sc.next().charAt(0); // 문자는 그냥 받을 수 없어 chatAt로 끊어 받는다.

        // 연산 결과를 저장할 변수
        int result = 0;

        switch (op) {
            case '+' :
                result = first + second;
                break;
            case  '-' :
                result = first - second;
                break;
            case '/' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '%' :
                result = first % second;
                break;
            // 산술연산 외에 다른 문자에 대한 처리는 생략하겠음

        }
        System.out.println(first + " " + op + " " + second + " = " + result);
    }
    public  void testSwitchVendingMachine(){

        /*
        * switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트
        * 1. JDK 1.7 이상부터 switch 문을 이용해 문자열 비교 할 수 있다.
        * 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
        * */

        // switch 문을 이용한 간단한 자판기
        System.out.println("=== ohgiraffers vending machine ===");
        System.out.println("    사이다  콜라  환타  박카스  학식스   ");
        System.out.println("===================================");
        System.out.println("음료를 선택해 주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        int price = 0;

        switch (selectedDrink){
            case "사이다":
                System.out.println("사이다를 선택하셨습니다.");
                price = 500;
                break;
            case "콜라":
                System.out.println("콜라를 선택하셨습니다.");
                price = 600;
                break;
            case "환타":
                System.out.println("환타를 선택하셨습니다.");
                price = 700;
                break;
            case "박카스":
                System.out.println("박카스를 선택하셨습니다.");
                price = 800;
                break;
            case "학식스":
                System.out.println("학식스를 선택하셨습니다.");
                price = 900;
                break;
        }
        System.out.println(price + "원을 투입해주세요.");
    }
    public void testDoggy(){

        System.out.println("어느 도끼가 너의 도끼이냐? (1.금도끼 , 2.은도끼 , 3.쇠도끼)");
        Scanner sc = new Scanner(System.in);
        String doGgy = sc.nextLine();


        switch (doGgy){
            case "1", "금도끼":
                System.out.println("욕심쟁이 쉨 나가");
                break;
            case "2", "은도끼":
                System.out.println("소인배 쉨 나가");
                break;
            case "3", "쇠도끼":
                System.out.println("아주 좋았어 너 다가져");
                break;
            default:
                System.out.println("뭐라노");
        }
        System.out.println("신령님은 그렇게 거품이되어 사라졌다.");
    }
}
