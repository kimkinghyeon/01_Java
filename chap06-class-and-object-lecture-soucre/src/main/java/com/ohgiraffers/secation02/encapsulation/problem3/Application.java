package com.ohgiraffers.secation02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.setInfo("르샬라");
        monster1.setHp(200);

        Monster monster2 = new Monster();
        monster2.setInfo("세니타");
        monster2.setHp(300);

        Monster monster3 = new Monster();
        monster3.setInfo("타킬라");
        monster3.setHp(400);

        Monster monster4 = new Monster();
        monster4.setInfo("킬라");
        monster4.setHp(-500);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());

        // 1. 사람이 실수로 hp를 음수로 만드는 문제를 해결
        // 2. 필드명을 수정했을 떄 필드를 직접적으로 사용하는 다른 클래스들에서 compile error 가 나와서
        //    유지보수가 어려워 지는 문제를 해결

        // 하지만 여전히 필드에 직접적으로 접근할 수 있기 떄문에 완벽히 문제가 해결되지 않음
        monster1.kinds = "글루하";
        monster1.hp = - 1000;

        System.out.println(monster1.getInfo());
    }
}
