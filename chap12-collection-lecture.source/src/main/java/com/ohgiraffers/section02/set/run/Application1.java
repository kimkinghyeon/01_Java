package com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /* Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허용하지 않는다. (null 값도 중복되지 않게 하나의 null 만 저장)
        *
        * HashSet 클래스
        * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * Hash -> 해서 알고리즘을 사용해서 검색 속도가 빠르다는 장점이 있다.*/

        // 아래 코드를 선호
        HashSet<String> hSet = new HashSet<>();
//        Set hSet2 = new HashSet();
//        Collection hSet3 = new HashSet();

        hSet.add(new String("java"));
        hSet.add("oracle");
        hSet.add("jdbc");
        hSet.add("html");
        hSet.add("css");

        // 저장 순서는 유지 되지 않는다.
        System.out.println("hSet : " + hSet);

        hSet.add("java"); // 출력되지 않음

        // 중복을 허용하지 않는다
        System.out.println("hSet : " + hSet);
        System.out.println("저장된 객체수 : " + hSet.size());
        System.out.println("포함확인 : " + hSet.contains("oracle"));

        /* Set
        * 저장된 객체를 한개씩 꺼내는 기능이 없다.
        * 반복문을 이용해서 연속처리하는 방법
        * 1. toArray() 배열로 바꾸어 for 문 사용*/

        Object[] arr = hSet.toArray();
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + i + " : " + arr[i]);
        }
        Iterator<String> iter = hSet.iterator();

        while (iter.hasNext()){
            System.out.println("Iterator 로 목록을 만들어 출력 = " + iter.next());
        }

        Boolean result = hSet.remove("oracle");
        System.out.println("지운 결과 : " + result);
        System.out.println("hSet : " + hSet);

        hSet.clear();
        System.out.println("isEmpty : " + hSet.isEmpty());
        System.out.println("hSet : " + hSet);



    }
}
