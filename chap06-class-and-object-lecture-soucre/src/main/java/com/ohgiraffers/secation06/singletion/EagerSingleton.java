package com.ohgiraffers.secation06.singletion;

public class EagerSingleton {
    // 클래스가 초기화 되는 시점에서 인스턴스를 생성
    private static EagerSingleton eager = new EagerSingleton();

    // 싱클톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성을 제한한다.
    private EagerSingleton(){

    }
    // public 메소드로 인스턴스를 반환
    public static EagerSingleton getInstance(){
        return eager;
    }
}
