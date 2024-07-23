package com.alok;

public class Overloading {
    public static void main(String[] args) {
        fun("Hi");
        fun(5);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
