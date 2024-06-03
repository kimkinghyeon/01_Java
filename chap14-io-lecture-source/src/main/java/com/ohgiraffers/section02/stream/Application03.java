package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application03 {

    // FileOutputStream
    public static void main(String[] args) {

        /* FileOutputStream
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림 바이트 단위로 데이터를 처리한다.*/

        FileOutputStream fout = null;

        try {
            // OutputStream 의 경우 대상 파일이 존재하지 않으면, 파일을 자동으로 생성
            // 두번째 인자로 true 를 전달하면 이어쓰기가 된다.
            // 기본값으로는 false 이다.
            //fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt",true);

            fout.write(97);
            // 10 : 개행문자(띄어쓰기)
            byte[] barr = {98,99,100,101,102,10,103,10};

            fout.write(barr);
           // 1번 인덱스에서 3의 길이만큼 파일에 작성됨.
            fout.write(barr,1,3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
