package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application02 {
    public static void main(String[] args) {
        // FileReader

        /* FileReader
        * FileInputStream 과 사용하는 방법이 거의 동일하다.
        * 단 , byte 단위가 아닌 character 단위로 읽어들이는 부분이 차이점
        * => 2byte , 3byte 이던 글자 단위로 읽어오기 때문에 한글도 정상적으로 읽을 수 있다.*/

        FileReader fr = null;

        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");

//            int value;
//            while ((value = fr.read()) != -1){
//                System.out.print((char) value);
//            }

            int size = (int) new File("src/main/java/com/ohgiraffers/section02/stream/testReader.txt").length();
            System.out.println(size);
            char[] carr = new char[size];

            fr.read(carr);

            for (int i = 0; i < carr.length; i++){
                System.out.print(carr[i]);
            }

        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 자원 반납
            if (fr != null){
                try {

                    fr.close();

                } catch (IOException e) {

                    throw new RuntimeException(e);

                }
            }
        }
    }
}
