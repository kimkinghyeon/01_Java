package com.ohgiraffer.api.split;

public class SplitTest {
    public static void main(String[] args) {


//1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 분리하 `char[]` 에 저장하여 출력하시오.
//2. 분리전 글자 및 개수 출력
//3. 분리 후 문자배열 갯수 출력 확인
//4. `char[]` 값 출력
//5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력
        //1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 분리하 `char[]` 에 저장하여 출력하시오.
        String str = "J a v a P r o g r a m ";
//        String[] sarr = str.split(" ");

        for (int i = 0; i < str.length(); i++) {
            System.out.println("char[" + i + "]" + str.charAt(i));
        }
        //2. 분리전 글자 및 개수 출력
        System.out.println("분리 전 글자 및 개수 " + str.length());
        //3. 분리 후 문자배열 갯수 출력 확인
        String[] sarr = str.split(" ");
        System.out.println("분리 후 글자 및 개수 " + sarr.length);
        //4. `char[]` 값 출력

        sarr = str.split(" ");

        for (int i = 0; i < sarr.length; i++) {
            System.out.println("char[" + i + "]" + sarr[i]);
        }
        String[] sarr1 = str.split(" ");

        for(String s : sarr1){
            System.out.print("Strin"+s);
        }
    }
}
