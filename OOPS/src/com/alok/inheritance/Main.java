package com.alok.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4,5,6);
        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.w + " "+ box1.h);
//
////   BoxWeight box3 = new BoxWeight();
////        System.out.println( box3.weight + " "+ box3.h);
//        Box box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5.w);
//        BoxPrice box = new BoxPrice(5,8,200);
//            Box.greeting();
            Box box = new BoxWeight();
            box.greeting();
    }
}
