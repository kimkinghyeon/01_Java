package labpack.Lab3;

import java.util.Scanner;
//Joshua Bloch가 쓴 "Effective Java" 책을 만들고,
//416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.
public class Joshua_Bloch {
    public void Book() {

        String author = "Joshua Bloch";
        String name = "Effective Java";
        int page = 416;
        String cover = "하드커버";

        Scanner sc = new Scanner(System.in);
        System.out.println("책의 저자를 알고 계시다면 말씀해주세요");

        String author1 = sc.nextLine();

        if (author1.equals("Joshua Bloch")) {

            System.out.println("네 맞습니다");
        } else {

            System.out.println("책의 저자는 Joshua Bloch입니다.");
        }

        System.out.println("책의 이름을 말씀해주세요");
        String name1 = sc.nextLine();

        if (name1.equals("Effective Java")) {

            System.out.println("네 맞습니다");
        } else {

            System.out.println("책의 이름은 Effective Java입니다.");
        }

        System.out.println("책이 몇 페이지인지 알고 계시다면 말씀해주세요");
        int page1 = sc.nextInt();

        if (page1 == 416) {

            System.out.println("정확히 알고 계십니다. 책은 안 읽고 페이지만 세셨군요");

        } else if (page1 > 416) {

            System.out.println("이 책은 그렇게까지 두껍지는 않습니다. 416 페이지입니다");

        } else if  (page1 < 416) {

            System.out.println("이 책은 그보다 두껍습니다 416 페이지입니다");
        }
        System.out.println("이 책이 하드커버인지 소프트커버인지 알고 계신가요");
        String cover1 = sc.next();

        if (cover1.equals("하드커버")) {

            System.out.println("정확히 알고 계시는군요");

        } else if (cover1.equals("소프트커버")) {

            System.out.println("딱 봐도 딱딱해보이지 않나요 하드커버입니다");

        } else {

            System.out.println("둘 중에 하나 고르라고 하면 꼭 이렇게 다른 거 고르는 애들이 있어요");

        }
        System.out.println();
    }
}




