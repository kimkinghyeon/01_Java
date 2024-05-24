package com.ohgiraffers.secation04.constructor.dto;

public class Application {
    public static void main(String[] args) {
        //

        /*
        * 1. 생성자를 이용한 초기화
        * 장점 : setter 메서드를 여러번 호출해서 사용하지않고,
        *       단 한번의 호출로 인스턴스 생성 및 초기화 가능
        * 단점 : 필드를 초기화할 매개변수의 갯수를 경우의 수 별로 모두 만들어둬야한다.
        *       호출 시 인자가 많이지는 경우 어떠한 값이 어떤 필드를 의미하는지 한 눈에 보기 힘듬
        *       예시) 아이디, 비밀번호, 이름이 모두 ohgirffers 인경우
        *       new User("ohgirffers","ohgirffers","ohgirffers);
        * 2. 설정자를 이용한 초기화
        * 장점 : 필드를 초기화 하는 가각의 값들이 어떤 필드를 초기화 하는지 명확히 볼 수 있다.
        *       예) 아이디, 비밀번호, 이름이 모두 ohgirffers 인 경우
        *       User user = new User();
        *       User.setId();
        *       User.setPwd();
        *       User.setName();
        *       호출하는 코드만 봐도 어떤 값이 어떤 필드를 초기화 하는 내용인지 쉽게 알 수 있다.
        * 단점 : 하나의 인스턴스를 생성할떄, 하나의 호출로 끝나지 않는다.
        * */

        //
        UserDTO user1 = new UserDTO("ohgirffers","ohgirffers","ohgirffers",new java.util.Date());

        System.out.println(user1.getInfo());

        //
        UserDTO user2 = new UserDTO();
        user2.setId("ohgirffers");
        user2.setPwd("ohgirffers");
        user2.setName("ohgirffers");
        user2.setEnrollDate(new java.util.Date());

        System.out.println(user2.getInfo());
    }
}
