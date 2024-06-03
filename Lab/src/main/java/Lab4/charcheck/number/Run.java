package Lab4.charcheck.number;

import Lab4.charcheck.CharCheckException;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        CharCheckException ch = new CharCheckException();
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");
        String n = sc.nextLine();
        try {
            ch.processTest(n);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
