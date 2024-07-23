package com.alok;

public class RBSWithDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2};
        System.out.println(findpivotwithDuplicates(arr));
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        start = 0;
        end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) /2;
            if (target < arr[mid]){
                    end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }return -1;
    }
    static int findpivotwithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) /2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }if (mid > start && arr[mid] < arr[mid -1]){
                return mid-1;
            }if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start ++;
                if (arr[end] < arr[end -1]){
                    return end -1;
                }
                end--;
        } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid +1;
            }else {
                end = mid -1;
            }
        }return -1;
    }
}
