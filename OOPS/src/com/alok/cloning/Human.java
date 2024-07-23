package com.alok.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{4,5,81,86,8};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }
//    @Override
//    public Object clone()throws CloneNotSupportedException{
//        return super.clone();
//    }
    @Override
    public Object clone()throws CloneNotSupportedException{
       Human twin = (Human) super.clone();
       twin.arr = new int[twin.arr.length];
       for (int i = 0;i<twin.arr.length;i++){
           twin.arr[i] = this.arr[i];
       }return twin;
    }
}
