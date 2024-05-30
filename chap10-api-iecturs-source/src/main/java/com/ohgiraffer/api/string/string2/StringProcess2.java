package com.ohgiraffer.api.string.string2;

public class StringProcess2 {
    //    (반환타입)
    public String preChar(String str) {

        // 1. 매개변수 전달이 잘 되는지 확인.
        System.out.println("hello world = " + str);

        // str = (h)ello world
        char firstChar = str.charAt(0);
        System.out.println("firstChar = " + firstChar);

        // 첫 글자 대문자로 바꾸기
        // 1) 문자 -> 문자열
        String firstStr = Character.valueOf(firstChar).toString();
        // String firstStr = Character.toString(firstChar);
        // 2) UpperCase 로 대문자로 바꾸기
        firstStr = firstStr.toUpperCase();
        System.out.println("대문자로 바뀐 = " + firstStr);
        // 첫글자를 뺀 나머지 부분
        // subString 사용
        String remainStr = str.substring(1); // index 1 부터 : h/ello world
        System.out.println("remainStr = " + remainStr); // ello world
        //    (H)   (ello world)
        // firstStr + remainStr 저장된 H + ello world
        return firstStr + remainStr;

    }

    public int charSu(String str, char ch) {

//        System.out.println("매개변수로 넘어온 문자열 " + str);
//        System.out.println("매개변수로 넘어온 문자 " + ch);
        // str = application car cable
        // ch = c
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char findChar = str.charAt(i);

            if(ch == findChar) {
                count ++;
            }
        }

        return count;

    }
}
