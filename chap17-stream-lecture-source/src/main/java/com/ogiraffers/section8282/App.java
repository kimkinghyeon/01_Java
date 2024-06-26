package com.ogiraffers.section8282;

import com.ogiraffers.section02.terminal.Member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Product> list = List.of(
                new Product("아이폰X", "apple", "전자기기류", 1000000),
                new Product("맥프로", "apple", "전자기기류", 6300000),
                new Product("베지밀", "정식품", "음료류", 1000000),
                new Product("파스타면", "de cecco", "식품류", 10000),
                new Product("LG G7", "LG", "전자기기", 700000),
                new Product("기계식키보드", "LEOPOLD", "전자기기류", 100000),
                new Product("고양이", "베르나르베르베르", "도서", 15000),
                new Product("간다, 봐라", "법정스님", "도서", 8900),
                new Product("까페라떼", "디초코", "음료류", 4000),
                new Product("아포가토", "디초코", "디저트류", 4500)
        );
        System.out.println("===== ===== 문제1 ===== =====");
        // 문제별 메소드를 만들어서 작성하세요.
        List<Product> stringStream = list;
        stringStream.stream()
//                .map(Product::getCategory)
//                .filter(getCategory -> getCategory == "전자기기류")
                .filter(str -> str.getCategory().contains("전자기기"))
                .forEach(System.out::println);

        System.out.println("===== ===== 문제2 ===== =====");

        List<Product> appleStream = list;
        appleStream.stream()
                .filter(str -> str.getBrand().contains("apple"))
                .map(p -> new Product(p.getProductName(), p.getBrand(), p.getCategory(), (int)(p.getPrice() * 0.9)))
                .forEach(System.out::println);

        System.out.println("===== ===== 문제3 ===== =====");

        List<Product> diepchocoStream = list;
        diepchocoStream.stream()
                .filter(str -> str.getBrand().contains("디초코"))
                .map(p -> {new Product(p.getProductName(), p.getBrand(), p.getCategory(), p.getPrice());
                    if ("디초코".equals(p.getBrand())){
                   p.setBrand("dechocolatecoffee");
               }
                    return p;
                })
                .forEach(System.out::println);

        System.out.println("===== ===== 문제4 ===== =====");

        List<Product> sumStream = list;
        sumStream.stream()
                .filter(p -> p.getPrice() >= 100000)
//                .toList()
        .forEach(System.out::println);



    }
}

