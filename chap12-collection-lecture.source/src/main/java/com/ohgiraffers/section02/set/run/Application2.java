package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    // LinkedHashSet
    public static void main(String[] args) {

        /* LinkedHashSet 클래스
        * HashSet 이 가지는 기능을 모두 가지고 있고
        * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다. */

        LinkedHashSet<String> lhSet = new LinkedHashSet<>();

        lhSet.add("java");
        lhSet.add("oracle");
        lhSet.add("jdbc");
        lhSet.add("html");
        lhSet.add("css");

        System.out.println("lhSet : " + lhSet);

        /* 오름차순
        * TreeSet 으로 객체를 생성하면 같은 타입의 객체를 자동적으로
        * 비교하여 오름차순으로 정렬 */

        TreeSet<String> tSet = new TreeSet<>(lhSet);
        System.out.println("tSet" + tSet);



    }
}
