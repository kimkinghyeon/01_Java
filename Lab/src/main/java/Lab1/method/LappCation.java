package Lab1.method;

import Lab2.LappCationf;

import java.util.Scanner;

public class LappCation {
    private static int x;

    public static void main(String[] args) {

        LappCationf lab = new LappCationf();
        int lab1 = lab.nonStaticLab(10,20);
        int lab2 = lab.nonStaticLab1(20,10);
        int i = 5;
        int i2 = 10;
        System.out.println("두 수의 합" + lab1);
        System.out.println("두 수의 빼기" + lab2);
        int lab3 = LappCationf.staticLab(10,10);
        System.out.println("두 수의 나누기" + lab3);
        int lab4 = lab.nonStaticLab2(i, i2);
        System.out.println("두 수의 곱하기" + (lab4 + lab2));
        int lab5 = LappCationf.staticLab1(x);
        System.out.println("두 수의 합" + (lab5 + lab1 + lab2));

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은" + name + "입니다");

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt(); // 매개변수 : 진법
        System.out.println("입력하신 나이는 " + age + "입니다");

        System.out.print("원하는 월급을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money + "입니다");

        System.out.print("키를 입력해주세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 : " + height + "cm입니다");

        System.out.println("원주율(파이)를 아는 만큼 입력하세요");
        double pi = sc.nextDouble();
        System.out.println("입력한 원주율은 " + pi + "입니다.");

        System.out.println("참과 거짓중에 한가지를 true or false 로 입력해주세요");
        System.out.println("나는 복습을 잘하고 있다.");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");

        sc.nextLine();
        System.out.print("아무 문자나 입력하세요 : ");
        String str = sc.nextLine();
        char ch = str.charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다.");

        LabIf labIf = new LabIf();

        labIf.labif();
    }

    public static void testMonth(){
        System.out.println("어느 요일의 날씨가 궁금하신가요?");
        Scanner sc = new Scanner(System.in);
        String testMonth = sc.nextLine();


        switch (testMonth){
            case "월요일","1":
                System.out.println("월요일은 날씨가 맑습니다.");
                break;
            case "2", "화요일":
                System.out.println("화요일은 날씨가 흐립니다.");
                break;
            case "3", "수요일":
                System.out.println("수요일은 비가 내릴 예정입니다.");
                break;
            case "4", "목요일":
                System.out.println("목요일은 대체로 흐릴 예정입니다.");
                break;
            case "5", "금요일":
                System.out.println("금욜이은 날씨가 맑은 예정입니다.");
                break;
            case "6", "토요일":
                System.out.println("토요일에 비가 내릴 예정입니다.");
            case "7", "일요일":
                System.out.println("일요일도 비가 내릴 예정입니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
        System.out.println("일기예보가 종료됩니다.");


    }
}
