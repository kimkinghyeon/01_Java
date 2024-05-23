package com.ohgiraffers.secation02.encapsulation.problem3;

public class Monster {
    String kinds;
    int hp;

    public void setInfo(String info){
        this.kinds = info;
    }
    public void setHp(int hp){

        if(hp > 1) {
            this.hp = hp;
        } else {
            System.out.println("1보다 작거나 같은 값이 입력되어 몬스터의 체력을 1으로 변경합니다.");
            this.hp = 1;
        }
        }
        // 몬스터의 이름과 체력을 String 값으로 return 해주는 기능
        public String getInfo(){
         String text = "몬스터의 이름은 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
         return text;
         }

    }

