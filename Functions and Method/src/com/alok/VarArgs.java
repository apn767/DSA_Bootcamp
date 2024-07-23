package com.alok;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,6,5,9,6,56);
        multiple(2,5,"66,685,48,53,4", "Hello","Hi");

    }
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
