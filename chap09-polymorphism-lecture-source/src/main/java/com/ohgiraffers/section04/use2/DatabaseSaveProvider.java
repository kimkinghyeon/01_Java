package com.ohgiraffers.section04.use2;

public class DatabaseSaveProvider implements SaveProvider {
    @Override
    public boolean save(String data) {

        System.out.println("Database 에 저장");
        return true;
    }
}
