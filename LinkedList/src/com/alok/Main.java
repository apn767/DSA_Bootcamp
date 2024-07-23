package com.alok;


public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(8);
        list.insertFirst(45);
        list.insertFirst(5);
        list.insertFirst(38);
        list.insertLast(99);
        list.insert(123,3);
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(88,1);
        list.display();
//        DLL list = new DLL();
//        list.insertFirst(4);
//        list.insertFirst(8);
//        list.insertFirst(5);
//        list.insertFirst(9);
//        list.insertLast(99);
//        list.insert(8,65);
//        list.display();
//
//        CLL list = new CLL();
//        list.insert(5);
//        list.insert(4);
//        list.insert(23);
//        list.insert(9);
//        list.insert(75);
//
//        list.display();
//        list.delete(23);
//        list.display();
    }
}
