package com.alok;

public class Max {
    public static void main(String[] args) {
        int[] arr = {5,8,6,7,9};
        System.out.println(maxRange(arr, 0,3));
    }
    static int maxRange(int[] arr, int start, int end) {
        if (end > start){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int maxVal = arr[start];
        for (int i = 0; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }return maxVal;
    }
    static int max(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
            for (int i = 0; i < arr.length;i ++){
                if (arr[i] > maxVal){
                    maxVal = arr[i];
                }
            }return maxVal;
    }
}
