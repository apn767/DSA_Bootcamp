package com.alok;

public class DescendingArray {
    public static void main(String[] args) {
        int[] arr = {122,115,79,65,53,48,45,38,24,17,8,2};
        int target = 2;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];
        boolean isDesc = arr[start] > arr[end];
        while (start <= end){
            int mid = start + (end-start)/ 2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }return -1;
    }
}
