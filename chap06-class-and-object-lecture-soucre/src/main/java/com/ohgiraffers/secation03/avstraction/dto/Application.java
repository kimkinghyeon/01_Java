package com.ohgiraffers.secation03.avstraction.dto;

public class Application {
    public static void main(String[] args) {
        /*
         * 캡슐화의 원칙에는 일부 어긋나긴 하지만, 다른 목적을 가진 클래승화 객체를 추상화하는 기법
         *   -> DTO (Data Transfer Object)
         * 이러한 객체를 설계할 떄는 행위가 아닌 데이터가 위주이며, 캡슐화의 원칙을 준수하여
         * 모든필드를 private 으로 직접 접근을 막고, 각 필드값을 변경하거나 반환하는 메소드를
         * 세트로 미리 작성해둔다.
         * private 필드와 필드값을 수정하는 설정자(setter) 필드에 접근하는 접근자(getter)
         * 주로 계층간 데이터를 주고 받을 목적으로 사용한다. */

        // 설정자를 이용해서 사용해보기
        MemberDTO member = new MemberDTO();
        member.setNumber(1);
        member.setName("킬라");
        member.setAge(76);
        member.setGender('남');
        member.setHeight(180.5);
        member.setWeight(99.5);
        member.setActivated(true);

        // 접근자를 이용해서 출력해보기
        System.out.println("회원 번호 : " + member.getNumber());
        System.out.println("회원 이름 : " + member.getName());
        System.out.println("회원 나이 : " + member.getAge());
        System.out.println("회원 성별 : " + member.getGender());
        System.out.println("회원 키 : " + member.getHeight());
        System.out.println("회원 무게 : " + member.getWeight());
        System.out.println("회원 활성화 상태 : " + member.isActivated());


    }
}
