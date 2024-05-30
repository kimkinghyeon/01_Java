package com.ohgiraffer.api.split;

import java.util.Arrays;

public class SplitMk2 {
    public static void main(String[] args) {

        String str = "J a v a P r o g r a m ";
        // 문자열 분리
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
//        for (String s : strArr){
//            System.out.print(s);
//        }
        // 문자 배열로 바꾸기
        // 1) 문자배열을 문자배열열 크기로 만들기
        char[] chArr = new char[strArr.length];
        // char [] <= strArr 문자열 길이
        // 2) 문자열배열의 값을 문자로 바꿔서, 문자배열에 값넣기
        for (int i = 0; i < strArr.length; i++) {
            chArr[i] = strArr[i].charAt(0);
        }
        System.out.println("문자배열 갯수 출력 = " + chArr.length);
        // 문자배열에 값이 들어갔는지 확인
        System.out.println("문자배열 내용 출력 = " + Arrays.toString(chArr));
        // 문자배열 -> 문자열
        String result = "";
        for(char ch : chArr){
            result = result + ch;
        }
        System.out.println("result " + result);

        String result2 = new String(chArr);
        System.out.println("result2 " + result2);

        // 대문자로 바꾸기
        result = result.toUpperCase();
        System.out.println("모두 대문자로 바꾼 result " + result);
    }

}

