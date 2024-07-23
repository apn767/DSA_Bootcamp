package com.alok;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,5,8,65,4};
        int target = 45;
        int ans = linearSearch(nums, target);
        int a = linearSearch2(nums, target);
        boolean an = linearSearch3(nums, target);
        System.out.println(ans);
        System.out.println(a);
        System.out.println(an);
    }
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        for (int index = 0; index < arr.length; index++ ){
            int element = arr[index];
            if (element == target){
                return true;
            }
        }return false;
    }
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for (int index = 0; index < arr.length; index++ ){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }return Integer.MIN_VALUE;
    }
}
