package com.ohgiraffers.secation06.statickkeyword;

public class StaticFiledTest {
    private int nonStaticCount;
    private static int staticCount;


    public StaticFiledTest(){
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {

        /*
        * static 필드에 접근하기 위해서는 클래스명.필드명 으로 접근한다.
        * this. 로 접근이 가능하지만, this 를 사용하지않는 것이 좋다
        * */

        return StaticFiledTest.staticCount;
    }
    // 두개의 필드 값을 1씩 증가시키기 위한 메소드
    public void increaseNonStaticCount(){
        this.nonStaticCount++;
    }
    public void increaseStaticCount(){
        this.staticCount++;
    }
}
