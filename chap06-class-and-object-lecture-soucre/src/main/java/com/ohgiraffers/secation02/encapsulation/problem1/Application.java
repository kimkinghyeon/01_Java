package com.ohgiraffers.secation02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {

        Monster monster1 = new Monster();

        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1 name = " + monster1.name);
        System.out.println("monster1 hp = " + monster1.hp);

        Monster monster2 = new Monster();

        monster2.name = "뿌구";
        monster2.hp = -200;

        System.out.println("monster2 name = " + monster2.name);
        System.out.println("monster2 hp = " + monster2.hp);

        Monster monster3 = new Monster();

        monster3.name = "드라큘라";
        monster3.setHp(200); // -> hp 200으로 성절되고,hp가 입력한 값으로 변경됐다는 안내가나옴

        System.out.println("monster3 name = " + monster3.name);
        System.out.println("monster3 hp = " + monster3.hp);


        Monster monster4 = new Monster();

        monster4.name = "뿌랑켄";
        monster4.setHp(-1400);  // -> hp 1로 설정

        System.out.println("monster4 name = " + monster4.name);
        System.out.println("monster4 hp = " + monster4.hp);

    }
}
