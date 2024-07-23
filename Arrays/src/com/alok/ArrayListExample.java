package com.alok;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(54);
//        list.add(547);
//        list.add(554);
//        list.add(540);
//        list.add(554);
//        list.add(754);
//        System.out.println(list.contains(554));
//        list.set(0,99);
//        list.remove(0);
//        System.out.println(list);
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(4));
        }
        System.out.println(list);
    }
}
