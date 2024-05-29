package com.ohgiraffer.section6.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Application1 {

    // time 패키지 => Date, Calendar 가 가지고 있는 단점을 해소하기위해 탄생
    public static void main(String[] args) {

        /* time 패키지
        * LocalTime, LocalDate, LocalDateTime, ZonedDateTime 클래스들이 있다.
        *
        * LocalTime
        * 시간을 표현하는 클래스
        * - 시 , 분 , 초 , 나노초
        * - 날짜 정보를 포함하지 않는다.
        * - 14:30:15.123 예) */

        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);
        LocalTime timeOf = LocalTime.of(15,25,1);
        System.out.println("timeOf = " + timeOf);

        /* LocalDate
        * 날짜를 표현하는 클래스
        * - 연도, 월, 일
        * - 시간 정보를 포함하지 않는다.
        * - 2024-05-29 예)*/
        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow" + dateNow);
        LocalDate dateOf = LocalDate.of(2024,5,29);
        System.out.println("dateOf = " + dateOf);


    }
}
