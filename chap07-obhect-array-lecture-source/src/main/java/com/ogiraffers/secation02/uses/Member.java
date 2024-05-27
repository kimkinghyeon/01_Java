package com.ogiraffers.secation02.uses;

public class Member {
    private int num;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;

    public Member(int num, String id, String pwd, String name, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    // 필드값 조회용 메서드

    public String getInformation() {
        return "Member [ num = " + num + ", id = " + id +
                    " , pwd = " + pwd + " , name + " + name
                    + " , age = " + age + " , gender = " + gender + "]";

    }
}


