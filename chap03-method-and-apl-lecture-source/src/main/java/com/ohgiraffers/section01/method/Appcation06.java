package com.ohgiraffers.section01.method;

public class Appcation06 {
    public static void main(String[] args) {

        /*
        * 메소드의 리턴값
        *
        * return 으로 복귀할때 그냥 할 수 도있지만 값을 가지고 복귀도 가능하다.
        * 이떄, 가지고 가는 값을 리턴값이라고 한다.
        *
        * return 값을 받기 위해서는 메소드 선언부에 리턴 타입을 명시해줘야한다.
        * void : 아무 반환값도 가지지 않겠다라는 의미.
        * 반환같이 없을때는 return; 을 컴파일러가 자동으로 생성하지만
        * 반환값이 있을때는 return; 구문을 반드시 명시적으로 작성해야한다.
        * 메소드의 선언부 명시한 리턴 타입과, 반환값 자료형은 반드시 일치해야한다.
        * */

        Appcation06 app6 = new Appcation06();
        String returnTest = app6.testMethod();

        System.out.println(returnTest);

        System.out.println(app6.testMethod()); // 저장하지 않고 바로 출력이 가능하다.
    }

    // String 타입으로 "hello world"를 반환해주는 메소드
    public String testMethod() {

        return "hello world";
    }


}
