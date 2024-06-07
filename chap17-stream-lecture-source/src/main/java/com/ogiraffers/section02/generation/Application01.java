package com.ogiraffers.section02.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application01 {

    public static void main(String[] args) {

        // 배열과 켈렉션 캑체의 stream() 메소드를 활용한 스트림생성

        String[] sarr = new String[] {"java", "oracle" , "jdbc"};

        // 배열의 일부분(0번 인덱스 부터 2번 인덱스 이전까지)를 스트림으로 변환
        System.out.println("========== 배열의 일부분만 변환 =========");
        Stream<String> stringStream = Arrays.stream(sarr,0,2);
        stringStream.forEach(System.out::println);
        System.out.println("========== 정상출력 =========");
        Stream<String> stringStream2 = Arrays.stream(sarr);
        stringStream2.forEach(System.out::println);

        //
        System.out.println("========== List<String> ==========");
        List<String> stringList = Arrays.asList("html","css","javascript");

        Stream<String> stringSystem3 = stringList.stream();
        stringSystem3.forEach(System.out::println);

        // 컬렉션의 경우 스트림 생성을 생략하고 사용가능
        System.out.println("========== 컬렉션을 생략한 List<String> =========");
        stringList.forEach(System.out::println);

        // Builder 를 활용한 스트림생성
        System.out.println("========== Builder 를 활용한 스트림 ==========");
Stream<String> builderStream = Stream.<String>builder()
        .add("각주연")
        .add("이득규")
        .add("배하은")
        .add("김강현")
        .build();
builderStream.forEach(System.out::println);

    }
}
