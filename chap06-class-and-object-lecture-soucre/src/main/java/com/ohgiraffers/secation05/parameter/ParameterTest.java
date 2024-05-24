package com.ohgiraffers.secation05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num) {

        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr) {

        // 배열 값의 출력
        System.out.println("배열의 값 출력");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;
        System.out.println("변경후 배열의 갑 출력");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

    }

    public void testPrimaryTypeParameter(Rectangle rectangle) {
        System.out.println("매개 변수로 전달받은 값 " + rectangle);

        //사각형의 넓이와 둘레 출력
        System.out.println("========변경 전 사각형으 넓이와 둘레========");
        rectangle.calcArea();
        rectangle.calcRound();

        rectangle.setWidth(100);
        rectangle.setHeight(100);

        System.out.println("========변경 후 사각형으 넓이와 둘레========");
        rectangle.calcArea();
        rectangle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name,String...hobby) {
        /*
        * 가변길이의 배열은 몇 개가 매개변수로 전달될지 모르느 상황이기에 이름과 구분하기 위해
        * 뒤쪽에 작성해야한다.
        *
        * 앞쪽에 작성하는 경우 에러 발생*/

        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for (int i = 0; i < hobby.length; i++){
            System.out.println(hobby[i] + " ");
        }
        System.out.println();
    }
}
