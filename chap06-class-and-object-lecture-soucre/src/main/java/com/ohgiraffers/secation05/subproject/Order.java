package com.ohgiraffers.secation05.subproject;

public class Order {

    private final String menuName; // 커피종류
    private final String option; // Hot or ICE
    private final int count; // 수량

    public Order(String menuName, String option, int count){
        this.menuName = menuName;
        this.option = option;
        this.count = count;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getOption() {
        return option;
    }

    public int getCount() {
        return count;
    }
}
