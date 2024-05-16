package com.ohgiraffers.section01.method;

public class calculator {

    // 삼항연산자로 두수를 비교해서 작은 값을 return 해주는 메소드

    public int nonStaticNumber0f(int first, int second) {

        //int result = (first > second)? second : first;

        return (first > second)? second : first;

    }

    // 삼항연산자로 두수를 비교해서 큰 값을 return 해주는 메소드
    public static int staticMaxNumber0f(int first, int second) {

        return (first > second)? first : second;
    }

    // 더하기. 뺴기, 곱하기, 나누기, 나머지
    // 이 각각을 수행할 수 있는 메소드를 만들고
    // 더하기 빼기,곱하기,나누기 => non static
    // 나머지 => static

    public int nonStaticNumber0f1(int first, int second){

        return first + second;
    }

    public int nonStaticNumber0f2(int first, int second){

        return first - second;
    }

    public int nonStaticNumber0f3(int first, int second){

        return first * second;
    }

        public int nonStaticNumber0f4(int first, int second){

        return first / second;
    }

    public static int staticNumber0f5(int first, int second){

        return first % second;

    }

}

