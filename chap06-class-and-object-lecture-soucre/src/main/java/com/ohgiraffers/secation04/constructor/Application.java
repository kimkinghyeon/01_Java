package com.ohgiraffers.secation04.constructor;

public class Application {
    public static void main(String[] args) {
        /*
        * 생성자
        *
        * 인스턴스를 생성할 떄 초기 수행할 명령어 있는 경우 미리 작성해두고,
        * 인스턴스 생성할 떄 (new 키워드를 만날 떄) 호출된다.
        * 생성자 함수에 매개변수가 없는 생성자를 기본 생성자(default constructor) 라고 하며,
        * 기본 생성자는 compiler 에 의해 자동으로 추가되기 떄문에 지금까지 명시적을 작성하지않고
        * 사용할 수 있다.
        * */

        // 기본생성자를 호출해 인스턴스(객체) 생성
        User user1 = new User();
        System.out.println(user1.getInfo());

        // 매개변수 있는 생성자를 호출해 인스턴스(객체) 생성
        User user2 = new User("user01","pass01","홍길동");
        System.out.println(user2.getInfo());

        User user3 = new User("user02", "pass02","홍반장",new java.util.Date());
        System.out.println(user3.getInfo());

        // 복사 생성자를 호출
        User user4 = new User(user3);
        System.out.println(user4.getInfo());
    }


}
