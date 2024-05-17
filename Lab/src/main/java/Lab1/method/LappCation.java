package Lab1.method;

import Lab2.LappCationf;

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

    }
}
