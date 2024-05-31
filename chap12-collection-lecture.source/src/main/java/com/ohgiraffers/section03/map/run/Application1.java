package com.ohgiraffers.section03.map.run;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Application1 {
    // Map
    public static void main(String[] args) {

        /* Map 인터페이스의 특징
        * Collection 인터페잇와는 다른 저장 방식을 가진다.
        * 키(key)와 값(value)을 하나의 쌍으로 저장하는 방식
        *
        * 키(key)
        * 값(value)를 찾기 위한 이름 역할을 하는 객체
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값을 저장 가능하다.
        *
        * HashMap, HashTable , TreeMap 등 대표적인 클래스가 존재한다.
        * HashMap 이 가장 많이 사용되며 HashTable 은 jdk 1.0 부터 존재해,
        * HashMap 과 동일하게 동작함 -> 하위호환을 위해 남겨놓은 것
        * 따라서, 가급적 HashMap 을 사용하는것이 권장*/

        HashMap hMap = new HashMap();
        // Map hmp2 = new HashMap();

        // put()
        // 키와 값 둘다 객체여야한다.
        hMap.put("one", new Date());
        hMap.put(12,"red appple");
        hMap.put(33,123);

        System.out.println("hMap : "+ hMap);

        // 중복확인
        // 같은 키값에 value 를 다르게 하게되면 덮어씌워진다.
        hMap.put(12,"yellow banana");
        System.out.println("hMap : " + hMap);

        // 값 중복 확인
        hMap.put(12,"yellow banana");
        hMap.put(13,"yellow banana");
        hMap.put(14,"yellow banana");

        System.out.println("hMap : " + hMap);

        // remove() -> 삭제
        hMap.remove(13);
        hMap.remove(14);

        System.out.println("hMap : " + hMap);

        // 저장된 객체 수 확인
        System.out.println("hMap 에 저장된 개체수 " + hMap.size());

    }
}
