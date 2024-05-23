package com.ohgiraffers.secation03.copy;

public class Appcation02 {
    public static void main(String[] args) {

        /*
        * 얕은 복사의 활용
        *
        * 얕은 복사를 할용하는 것은 주로 메소드 호출시 인자로 사용하는 경우
        * 리턴값을 동일한 배열을 리턴해주고 싶은 경우
        * */

        String[] names = {"홍길동","유관순","이순신"};
        // names 배열의 hashcode 출력
        System.out.println("names 배열의 hashcode : " + names.hashCode());

        print(names);
        String[] animals = getAnimals();
        System.out.println("리턴받은 animals 의 hashcode : " + animals.hashCode());
        print(getAnimals());

    }
    public static String[] getAnimals(){
        String[] animals = new String[] {"Bear","Koala","Gorilla"};
        //얕은 복사 확인을 위해 hashcode 출력
        System.out.println("새로 만든 animals 의 hashcode : " + animals.hashCode());

        return animals;
    }

    public static void print(String[] sarr){

        System.out.println("sarr 의 hashcode : " + sarr.hashCode());

        for (int i = 0; i < sarr.length; i++){
            System.out.print(sarr[i] + " ");
        }
        System.out.println();
    }
}
