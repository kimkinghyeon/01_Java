package com.ohgiraffer.api.string.string2;

public class StringTest2 {
    public static void main(String[] args) {

        StringProcess2 sp = new StringProcess2();
        String result = sp.preChar("hello world");
        System.out.println(result);
        System.out.println("=========================");

        int num = sp.charSu("application car cable", 'c');
        System.out.println("문자열에 있는 문자 \'c\' 의 갯수");
        System.out.println(num);
    }

}
