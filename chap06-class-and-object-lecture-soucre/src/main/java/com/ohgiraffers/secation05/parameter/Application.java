package com.ohgiraffers.secation05.parameter;

public class Application {
    public static void main(String[] args) {

        // 메소드의 파라미터 (매개변수)

        /*
         * 매개변수로 사용 가능한 자료형
         * 1. 기본자료형
         * 2. 기본자료형 배열
         * 3. 클래스자료형
         * 4. 클래스자료형 배열
         * 5. 가변인자
         * */

        ParameterTest parameterTest = new ParameterTest();

        // 기본자료형 매개변수로 전달받는 메소드 호출확인
        // 기본자료형 8가지 모두 가능()
        int num = 20;
        parameterTest.testPrimaryTypeParameter(num);

        // 기본자료형 배열 매개변수로 전달 받는 메소드 호출확인
        int[] iarr = new int[]{1, 2, 3, 4, 5};
        System.out.println("인자로 전달하는 값 :" + iarr);
        parameterTest.testPrimaryTypeArrayParameter(iarr);

        System.out.println("변경후 원본 배열의 갑 출력");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        // 클래스 자료형
        Rectangle r1 = new Rectangle(12, 22.5);
        System.out.println("인자로 전달하는 값 : " + r1);
        parameterTest.testPrimaryTypeParameter(r1);

        System.out.println("========변경 후 사각형의 넓이와 둘레========");
        r1.calcArea();
        r1.calcRound();

        // 가변인자
        //parameterTest.testVariableLengthArrayParameter("이름");
        parameterTest.testVariableLengthArrayParameter("홍반장");// 가변인자가 전달되지 않아도 괜찮누
        parameterTest.testVariableLengthArrayParameter("홍반장","볼링"); // 1개 가능
        parameterTest.testVariableLengthArrayParameter("홍반장","볼링","당구");
        parameterTest.testVariableLengthArrayParameter("고종",new String[] {"서예","탕평책"});


    }
}
