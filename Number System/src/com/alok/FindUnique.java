package com.alok;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8,8,5,3,2};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;
        for (int n: arr){
            unique ^= n;
        }
        return unique;
    }
}
