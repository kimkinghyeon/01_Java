package com.ogiraffers.section02.keyword;

import java.util.Date;

public class Product {

    private String code;           // 상품코드
    private String brand;          //제조자
    private String name;           // 상품명
    private int price;             //가격
    private Date ManufacturingDate;//제조일자

    public Product() {
        System.out.println("Product 클래스의 기본생성자 호출...");
    }

    public Product(String code, String brand, String name, int price, Date manufacturingDate) {

        //super();

        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        ManufacturingDate = manufacturingDate;

        System.out.println("Product 클래스의 매개변수 있는 생성자 호출...");
    }
}
