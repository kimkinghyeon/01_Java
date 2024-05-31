package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    // Properties
    public static void main(String[] args) {

        /* Properties
        * HashMap 을 구현하여 사용 용법이 거의 유사하다.
        * key-value 모두 문자열만 사용 할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용을 할 때 사용한다. */

        Properties prop = new Properties();

        // 값을 추가할때
        prop.setProperty("driver","oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url","jdbc:oracle:thin:@127..0.0.1:1521:xe");
        prop.setProperty("user","student");
        prop.setProperty("password","student");

        System.out.println("prop : " + prop);

        try {
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
            prop.store(new FileWriter("driver.txt"),"jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Properties prop2 = new Properties();

        try {
            // 값이 덮어씌어짐
            // prop2.load(new FileInputStream("driver.dat"));

            prop2.load(new FileReader("driver.txt"));

            // prop2.loadFromXML(new FileInputStream("driver.xml"));

            System.out.println("==========================================================================================================================");
            System.out.println("prop2 :" + prop2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
