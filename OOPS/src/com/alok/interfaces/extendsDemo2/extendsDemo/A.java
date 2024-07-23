package com.alok.interfaces.extendsDemo2.extendsDemo;

public interface A {
    static void greeting(){
        System.out.println("Hey I am static in A");
    }
    default void fun(){
        System.out.println("I am in A");
    }
}
