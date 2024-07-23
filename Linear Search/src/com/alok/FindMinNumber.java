package com.alok;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,8,65,4};
        System.out.println(min(arr));
    }

     static int min(int[] arr) {
        int minVal = arr[0];
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i< arr.length; i++){
            if (arr[i] < minVal){
                minVal = arr[i];

            }
        }
         return minVal;
    }
}
