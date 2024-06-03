package com.ohgiraffers.section03.use;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application01 {
    // io 패키지에서 예외처리
    public static void main(String[] args) {

        BufferedReader in = null;

        try {
            // FileReader라는 클래스에 FileNotFoundExcepiton을
            in = new BufferedReader(new FileReader("test.dat"));

            // 파일을 읽어서 저장할 문자열
            String s;

            // 파일을 한줄씩 읽어서 출력하는 기능
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        } catch (IOException e) {

            // IOException
            // In - Out 예외클래스
            throw new RuntimeException(e);
        } finally {
            /*
             * finally
             *

            try {

                // BufferReader 객체가 없을 때를 대비해서 조건문으로 작성
                if (in != null) {

                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
