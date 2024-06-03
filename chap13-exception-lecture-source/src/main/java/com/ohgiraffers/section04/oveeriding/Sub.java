package com.ohgiraffers.section04.oveeriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Sub extends Super {

    // Exception 상위(1)
    // => IOException (2)
    // => FileNotFoundException (3)


    // 예외 없이 오버라이딩 가능
//    @Override
//    public void method(){}



    // 같은 예외를 던지는 구문으로 오버라이딩 가능
//    @Override
//    public void method() throws IOException {}


    // 부모의 예외처리 클래스보다 상위의 예외로는 후손클래스에서 오버라이딩 할 수 없다.
//    @Override
//    public void method() throws Exception {}

    // 부모의 예외처리 클래스보다 더 하위에 있는 구체적인 예외사항의 경우 오버라이딩 가능
    @Override
    public void method() throws FileNotFoundException {}

    // Exception 에서 자식크랠스는 부모 클래스보다 더 많은 예외를 가질 수 없다.


}
