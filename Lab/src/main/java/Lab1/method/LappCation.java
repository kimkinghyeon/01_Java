package Lab1.method;

import Lab2.LappCationf;

public class LappCation {
    public static void main(String[] args) {

        LappCationf lab = new LappCationf();
        int lab1 = lab.nonStaticLab(10,20);
        int lab2 = lab.nonStaticLab1(20,10);
        System.out.println("두 수의 합" + lab1);
        System.out.println("두 수의 빼기" + lab2);
        int lab3 = LappCationf.staticLab(10,10);
        System.out.println("두 수의 나누기" + lab3);
        

    }
}
