package com.alok.abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 253255;
    }
    static void hello(){
        System.out.println("hey");
    }
    void normal(){
        System.out.println("this is a normal method in parent abstract class");
    }
//    abstract Parent();
    abstract void career();
    abstract void partner();
}
