package com.ohgiraffers.secation03.branching;

public class A_break {

    /*
     * break 문이 반복문 내에서 사용된다.
     *
     * 해당 반복문을 빠져 나올 때 사용하며,
     * 반복문의 조건문 판단 결과와 상관없이 반복문을 빠져나올때 사용함
     * 일반적으로 if(조건식){break;} 처럼 사용됨
     * switch 문은 반복문이 아니지만 예외적으로 사용
     * */
    public void testSimpleBreakStatement() {

        //break 문을 이용하여 무한루프를 활용한 1~100까지 합계 구하기

        int sum = 0;
        int i = 1;

        while (true) {

            sum += i;
            System.out.println(i);
            // break 문으로 조건 반복문 빠져나오기
            if (i == 50) {
                break;
            }

            i++;
        }
        System.out.println("1부터 50까지의 합 : " + sum + " 입니다.");
    }


    public void testJumpBreak() {
        dddking:
        for (; ; ) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 3) {
                    break dddking;
                }
            }


        }
}
    }

