package labpack.Lab1.method;

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

        Scanner sc = new Scanner(System.in);
        System.out.println("거꾸로");
        int row = sc.nextInt();

        for (int i = row; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void labstar033() {
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

    public void labStar07() {
        System.out.println("다이아");
        Scanner sc = new Scanner(System.in);
        System.out.println("홀수 입력");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i < row / 2) {
                    if (i + j <= row / 2 - 1)
                        System.out.print("*");
                    else if (j - i >= row / 2 + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else if (i >= row / 2) {
                    if (i - j >= row / 2 + 1)
                        System.out.print("*");
                    else if (i + j >= row / 2 * 3 + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public void labStar08() {
        System.out.println("다이아");
        Scanner sc = new Scanner(System.in);
        System.out.println("홀수 입력");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i < row / 2) {
                    if (i + j <= row / 2 - 1)
                        System.out.print(" ");
                    else if (j - i >= row / 2 + 1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                } else if (i >= row / 2) {
                    if (i - j >= row / 2 + 1)
                        System.out.print(" ");
                    else if (i + j >= row / 2 * 3 + 1)
                        System.out.print(" ");
                    else System.out.print("*");
                }

            }
            System.out.println();
        }

    }

    public void labStar09() {
        System.out.println("하트");
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        int row = sc.nextInt();
        int i, j;
        int rowWidth = (row / 2) - 2;
        int bottom = row * 2 + 1;
        for (i = rowWidth; i < row; i += 2) {
            for (j = 0; j <= (row -i) * 2; j +=2) {
                System.out.print(" ");
            }
            for (j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            for (j = 0; j <= (row - i) * 2; j+=2) {
                System.out.print("  ");
            }
            for (j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i = bottom; i >= 0 ;i -= 2){
            for(j = 0; j <= bottom -i; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= i * 2; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("======== I LOVE YOU ========");
    }
}




