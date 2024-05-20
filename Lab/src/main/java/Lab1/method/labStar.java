package Lab1.method;

import java.util.Scanner;

public class labStar {
    public void labstar01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄의 수를 입력하세여.");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void labstar02() {

        Scanner sc = new Scanner(System.in);
        System.out.println("역방향");

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void labstar03() {

        //Scanner sc = new Scanner(System.in);
        System.out.println("거꾸로");
        //int row = sc.nextInt();

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void labstar033(){
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");
        int row = sc.nextInt();

        for (int i = 1; i < row; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void labstar04() {
        System.out.println("거꾸로 역방향");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void labstar05() {
        System.out.println("피라미드");
        for (int i = 1; i < 10; i += 2) {
            for (int j = 9; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void labStar06() {
        System.out.println("피라미드 입력");
        Scanner sc = new Scanner(System.in);
        System.out.println(" 입력 ");
        int row = sc.nextInt();
        for (int i = 1; i < row; i += 2) {
            for (int j = row; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

