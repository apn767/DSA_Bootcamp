package com.alok.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list2.add(43);
        list2.add(34);
        list2.add(4);
        list2.add(3);
        System.out.println(list2);
        List<Integer> vector = new Vector<>();
        vector.add(4);
        vector.add(45);
        vector.add(454);
        vector.add(41);
        vector.add(14);
        System.out.println(vector);
    }

}
