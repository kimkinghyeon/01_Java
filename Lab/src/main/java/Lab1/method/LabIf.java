package Lab1.method;

import java.util.Scanner;

public class LabIf {
    public void labif(){

            // 정수 한 개를 입력 받아 그 수가 짝수이면 " 입력하신 숫자는 짝수 입니다." 출력
            Scanner sc = new Scanner(System.in);
            System.out.print("숫자 한 개를 입력하세요 : ");
            int num = sc.nextInt();
            // 짝수가 아니면 출력하지 않는 코드를 작성한다.
            if(num % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수 입니다.");
            }
            // 단, 조건과 상관없이 프로그램이 종료될때 ' 프로그램을 종료합니다." 라고 출력
            System.out.println("프로그램을 종료합니다.");
        LappCation labMonth = new LappCation();
        labMonth.testMonth();
    }
}
