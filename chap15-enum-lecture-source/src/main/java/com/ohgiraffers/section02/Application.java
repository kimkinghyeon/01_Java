package com.ohgiraffers.section02;

public class Application {

    public static void main(String[] args) {

        /* Enum 을 이용하여 선언된 인스턴스는 싱글턴으로 관리가 된다. = 인스턴스가 한개임을 보장한다.*/

        Subjects subjects1 = Subjects.JAVA;
        Subjects subjects2 = Subjects.HTML;
        Subjects subjects3 = Subjects.ORACLE;

        // toString 을 이용해 문자열로 관리하기 쉽다.
        System.out.println(Subjects.JAVA.toString());
        System.out.println(Subjects.HTML.toString());
        System.out.println(Subjects.ORACLE.toString());

        // values()를 이용해 상수값 배열을 반환
        Subjects[] subjects = Subjects.values();

        for (Subjects s : subjects){
            System.out.println(s);
        }

        // 타입의 안전을 보장
        //Subjects subjects4 = 0; (X)
        Subjects subjects4 = Subjects.JAVA;
    }
}
