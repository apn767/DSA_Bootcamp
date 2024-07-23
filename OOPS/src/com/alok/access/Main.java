package com.alok.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Alok");
//        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY;private access
        obj.getNum();
        obj.setNum(5);
        int n = obj.num;
    }
}
