package com.alok;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 3);
        System.out.println("Hi" + new ArrayList<>());
        System.out.println("hi" + new Integer(543));
    }
}
