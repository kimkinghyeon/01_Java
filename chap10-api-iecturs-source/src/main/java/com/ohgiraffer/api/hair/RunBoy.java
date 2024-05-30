package com.ohgiraffer.api.hair;

import com.ohgiraffer.api.member.Member;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.time.LocalDateTime;

public class RunBoy {
    public static void main(String[] args) {

        String str = "id,first_name,last_name,email,gender,birthday,reservation_date,reservation_time,created_at\n" +
                "1,Devin,Rossey,drossey0@state.tx.us,Male,,2024-09-04,20:22,2012-10-10T07:55:50\n" +
                "2,Alice,Krause,akrause1@about.com,Female,1983/04/04,2024-06-01,16:16,2011-09-08T17:09:39\n" +
                "3,Elinore,Girauld,egirauld2@sciencedaily.com,Female,1989/01/19,2024-01-13,16:21,2012-12-04T19:37:08\n";

        String[] firstSplitArr = str.split(" ");
        System.out.println("firstSplitArr : " + Arrays.toString(firstSplitArr));
        RunBoy[] members = new RunBoy[firstSplitArr.length];
        for (int i = 0; i < firstSplitArr.length; i++) {
            String[] secondSplitArr = firstSplitArr[i].split(",");
            // 분리해서 나온 데이터들을 Member 라는 클래스의 필드값으로 저장
            MemberMk2 member = new MemberMk2();
            // 번호
            member.setId(Integer.parseInt(secondSplitArr[0]));
            // 이름
            member.setFirst_name(String.valueOf(Integer.parseInt(secondSplitArr[1])));
            // 뒤이름
            member.setLast_name(String.valueOf(Integer.parseInt(secondSplitArr[2])));
            // 이메일
            member.setEmail(String.valueOf(Integer.parseInt(secondSplitArr[3])));
            // 성별
            member.setGender(String.valueOf(Integer.parseInt(secondSplitArr[4])));
            // 생년
            LocalDate birthday = LocalDate.parse(secondSplitArr[5], DateTimeFormatter.ofPattern("yyyyMMdd"));
            member.setBirthday(birthday);

            LocalDate reservation_date = LocalDate.parse(secondSplitArr[6]);
            member.setReservation_date(reservation_date);

            LocalTime reservation_time = LocalTime.parse(secondSplitArr[7]);
            member.setReservation_time(reservation_time);

            LocalDateTime.from(LocalDateTime.parse(secondSplitArr[8]));
        }

        System.out.println(Arrays.toString(firstSplitArr));
    }
}

