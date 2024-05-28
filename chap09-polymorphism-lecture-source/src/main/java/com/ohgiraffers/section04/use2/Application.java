package com.ohgiraffers.section04.use2;

public class Application {
    public static void main(String[] args) {

        SaveProvider saveProvider = new DatabaseSaveProvider();
        SaveProvider saveProvider1 = new FileSaveProvider();
        Person person = new Person(saveProvider);
        Person person1 = new Person(saveProvider1);

        person.doSomething();
        person1.doSomething();
    }
}
