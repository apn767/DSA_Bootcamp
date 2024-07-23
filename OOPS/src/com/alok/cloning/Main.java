package com.alok.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {
        Human alok = new Human(34,"alok");
//        Human twin = new Human(alok);
            Human twin =(Human) alok.clone();

        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
//        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 23;
        System.out.println(Arrays.toString(alok.arr));
        System.out.println(Arrays.toString(twin.arr));

    }
}
