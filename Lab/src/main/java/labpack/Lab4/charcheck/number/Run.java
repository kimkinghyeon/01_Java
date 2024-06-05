package labpack.Lab4.charcheck.number;

import labpack.Lab4.charcheck.CharacterProcess;

import java.util.Scanner;

public class Run {

    Scanner sc = new Scanner(System.in);
    CharacterProcess cp = new CharacterProcess();

    public static void main(String[] args) {
        Run r = new Run();
        r.test1();
    }
    public void test1() {

        System.out.println("문자열 입력");
        String txt = sc.nextLine();
        cp.countAlpha(txt);
    }
}

