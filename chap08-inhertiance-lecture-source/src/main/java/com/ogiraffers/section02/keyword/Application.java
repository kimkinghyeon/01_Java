package com.ogiraffers.section02.keyword;

public class Application {

    public static void main(String[] args) {

        /*
        * super :
        * 자식클래스를 이용해서 객체 를 생성할 때 부모 생성자를 호출하며 부모클래스의
        * 인스턴스도 생성하게 된다. 이때 생성한 부모의 인스턴스 주소를 보관하는
        * 레퍼런스 변수
        * super() :
        * 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는
        * 부모의 생성자를 호출하게된다.
        * thi()가 해당 클래스 내의 다른 생성자를 호춯하는 구문이라면
        * super()는 부모클래스가 가지는 private 생성자를 제외한 나머지 생성자를
        * 호출할 수 있도록 한 구문이다.
        * */

        // Product 기본 생성자로 인스턴스 생성
        Product product = new Product();
    }
}
