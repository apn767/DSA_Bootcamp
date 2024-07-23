package com.alok.singleton;

import com.alok.access.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(45,"Alok");
        int n = obj.num;
    }
}
