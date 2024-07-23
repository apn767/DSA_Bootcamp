package com.alok.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;
    static {
        System.out.println("Inside static block");
        b = a*7;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
