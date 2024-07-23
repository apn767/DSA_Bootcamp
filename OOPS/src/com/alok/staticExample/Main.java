package com.alok.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human alok = new Human(20,"Alok pandey",652000,false);
//        Human amartya = new Human(25,"Amartya gupta",23621,true);
//        Human abhi = new Human(25,"Abhishek",236021,true);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
        Main fun = new Main();
        fun.fun2();

    }
    static void fun(){
//        greeting();
        Main obj = new Main();
       obj.greeting();
    }
void fun2(){
        greeting();
}
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}
