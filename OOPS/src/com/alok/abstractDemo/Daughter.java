package com.alok.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love someone for the rest of life");
    }
}
