package com.alok.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son= new Son(13);
        son.career();
        Daughter daughter = new Daughter(15);
        daughter.career();
//        Parent mom = new Parent();
        Parent.hello();
    }
}
