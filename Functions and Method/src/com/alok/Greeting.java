package com.alok;

public class Greeting {
    public static void main(String[] args) {
//        greeting();
        String personalised = myGreet(" Hello Word");
        System.out.println(personalised);
    }

    private static String myGreet(String name) {
        String message = "Hello "+ name;
        return message;
    }

    static void greeting(){
        System.out.println("Hello World");
    }
}
