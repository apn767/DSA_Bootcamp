package com.alok.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student alok = new Student(20,54.01f);
        Student amartya = new Student(16,79.01f);
        Student aditya = new Student(51,56.01f);
        Student abhishek = new Student(21,74.01f);
        Student aman = new Student(6,44.01f);
        Student[] list = {alok,amartya,aditya,abhishek,aman};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

//        if (alok.compareTo(amartya) >0){
//            System.out.println(alok.compareTo(amartya));
//            System.out.println("Amartya");
//        }
    }
}
