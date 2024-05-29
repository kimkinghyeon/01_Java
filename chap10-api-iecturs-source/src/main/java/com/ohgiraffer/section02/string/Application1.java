package com.ohgiraffer.section02.string;

public class Application1 {
    // String 클래스의 자주 사용하는 메소드 숙지
    public static void main(String[] args) {

        /* charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환
        * 인덱스를 벗어나면 IndexOutOfBoundsException 이 발생한다.*/

        String str1 = "apple";
        for(int i = 0; i < str1.length(); i++){
            System.out.println("charAt(" + i + ") = " + str1.charAt(i));
        }

        /* compareTo() : 인자로 전달된 물자열과 사전 순으로 비교하여
        * 두 문자열이 같다면 0을 반환하고 인자로 전달된 문자열보다 작으면 음수를, 크면 양수를 반환
        * 대소문자를 구분하여 비교함.*/

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        // 같으면 0 반환
        System.out.println("compareTo() = " + str2.compareTo(str3));
        // 대문자와 소문자 차이는 32
        System.out.println("compareTo() = " + str3.compareTo(str4));
        System.out.println("compareTo() = " + str2.compareTo(str4));
        // compareToIgnoreCase() : 대소문자 구분하지 않고 비교
        System.out.println("compareToIgnoreCase() = " + str3.compareTo(str4));

        /*
        * concat() : 문자열에 인자로 전달된 물자열을 합치기해서 새로운 문자열을 반환
        * 원본 문자열에는 영향을 주지 않는다. */
        System.out.println("concat() = " + (str2.concat(str5))); // "java" + "oracle"
        System.out.println("str2 = " + str2);

    }
}
