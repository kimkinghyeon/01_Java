package com.ohgiraffer.section5.calender;

import java.util.Date;

public class Application1 {

    public static void main(String[] args) {

        /* Date 클래스
        * JDK 1.0 부터 날짜를 취급하기 위해 사용되던 클래스
        * => 생성자를 비롯해 대부분의 메소드가 Deprecated(사용 못 한다고) 되어 있다.
        *
        * Date 는 java.sql.Date 와 java.util.Date 가 존재한다.
        * 한 클래스에서 두개의 타입을 전부 사용하게되면 import 를 하더라도
        * 사용하는 타입이 어느 패키지에 있는 Date 클래스인지 모호하기 때문에
        * import 해도 풀 클래스 네임을 작성해줘여함
        *
        * Deprecated
        * 향후 버전이 업데이트 되면서 사라지게될 기능이니 가급적 사용하지 말라는 의미
        * => 하위 버전 호환성 때문에 한번에 제거된 것은 아니고, 남겨둠 */

        // 1. 기본생성자 사용하는 방법
        // 기본생성자로 인스턴스를 생성하면 운영체제의 날짜/ 시간 정보를 이용해서
        // 인스턴스를 만들게 된다.
        Date today = new Date();

        System.out.println(today);

        // 2. Date(Long date) 사용하는 방법
        // getTime() : 1970년 1월 1일 0시 0분 0초 이후 지난시간을
        //             millisecond 로 계산해서 long 타입으로 반환한다.
        System.out.println(today.getTime());

        Date time = new Date(1716962137734L);
        System.out.println(time);

    }
}
