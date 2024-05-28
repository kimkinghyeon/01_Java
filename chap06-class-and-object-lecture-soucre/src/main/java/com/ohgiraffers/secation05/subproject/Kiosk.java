package com.ohgiraffers.secation05.subproject;

import java.util.Arrays;
import java.util.Scanner;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);
    private Barista barista = new Barista();

    // 메뉴
    public void menu() {

        // 쌍 따옴표가 3개가 되면 여러줄을 포함 할 수 있게된다.

        String menu = """
                =====================
                   커피 주문 프로그램
                =====================
                1. 아케리카노
                2. 라뗴
                3. 종료
                =====================
                선택 : """;

        // 메뉴를 보여주고, 주문을 받고, 확인까지 받는기능
        while (true) {
            System.out.print(menu);

            Order order = null;
            String choice = sc.next();
            switch (choice) {
                case "1":
                    order = createOrder("아메리카노");
                    break;
                case "2":
                    order = createOrder("라떼");
                    break;
                case "3": return; // 메소드를 호출한곳으로 돌아감 => 프로그램 종료
                default:
                    System.out.println("> 잘못 입력하였습니다. ");

            }

            if (order != null){
                sendCoffeeRequest(order);
            } else {
                System.out.println("> 주문을 취소했습니다. ");
            }

        }

    }

    private void sendCoffeeRequest(Order order) {

        // Coffee 객체 배열
        Coffee[] coffees = barista.makeCoffee(order);
        // Arrays : 배열에 관련된 기능을 미리 만들어놓은 패키지
        // toString : 객체 안에 있는 값을 꺼내서 보여줌
        if (coffees != null) {
            System.out.println("> 주문하신 커피" + Arrays.toString(coffees));
        } else {
            System.out.println(" 커피가루가 모자랍니다. ");
        }
    }

    private Order createOrder(String menuName) {

        // 옵션
        String option = inputOption();
        // 수량
        int count = inputCount();

        Order order = new Order(menuName, option, count);

        // 주문 확인
        boolean confirmed = confirmedOrder(order);

        return confirmed ? order : null;
    }

    private boolean confirmedOrder(Order order) {

        System.out.println("""
                > 주문 내역을 확인해주세요.
                -----------------------
                메뉴명 : %s
                옵션  : %s
                수량  : %d
                -----------------------
                > 주문처리 1.승인 2.취소
                입력:""".formatted(order.getMenuName(), order.getOption(), order.getCount()));

        return  sc.next().equals("1"); // true or false
    }

    private int inputCount() {
        System.out.print("> 수량을 입력하세요.");
        return sc.nextInt();
    }

    // 사용자한테 입력받아 Hot,Ice 를 return 해주는 기능

    private String inputOption() {
        System.out.print("> 옵션을 선택하세요. 1. Hot , 2. Ice");

        //if
//        String input = sc.next();
//        String result = "";
//        if (input.equals("1")){
//            result = " Hot";
//        }else {
//            result  = "Ice";
//        }
//        return result;
        return sc.next().equals("1") ? "Hot" : "Ice";
    }
}
