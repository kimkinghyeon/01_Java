package com.ohgiraffer.api.string;

//- 메소드 작성 :
//        1. `+preChar(String s)`
//        : String 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
//    2. `+charSu(String s, char ch)`
//        : int 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성
public class StringProcess {
    private String preChar = "helloworld";
    private String charSu = "application car cable";
    private char ch;
    public String preChar(String preChar) {
        preChar = preChar.substring(0, 1).toUpperCase() + preChar.substring(1);
        return preChar;
    }

    public int charSu(String s, char ch) {

        return charSu.length() - charSu.replace(String.valueOf(ch),"").length();
    }

}



