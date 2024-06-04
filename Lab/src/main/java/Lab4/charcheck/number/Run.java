package Lab4.charcheck.number;

import Lab4.charcheck.CharCheckException;

import java.util.Scanner;

public class Run {

    Scanner sc = new Scanner(System.in);
    CharacterProcess cp = new CharacterProcess();


    public static void main(String[] args) {
        Run r = new Run();
        r.test1();
    }
    public void test1() {

        System.out.println("사용할 문자열을 하나 입력하세요.");
        String txt = sc.nextLine();
        cp.countAlpha(txt);
    }
}

