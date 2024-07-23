package com.alok.arrays;

import java.util.ArrayList;

public class FindNum {
    public static void main(String[] args) {
        int[] arr = {1,26,5,5,5,6};
        System.out.println(findall2(arr,0,5));
    }
    static int find1(int[] arr,int index, int target){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }return find1(arr,index+1,target);
    }
    static int findlast(int[] arr,int index, int target){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }return findlast(arr,index-1,target);
    }
    static boolean find(int[] arr, int target,int index){
        if (index == arr.length){
            return false;
        }return arr[index] == target || find(arr,target,index+1);
    }
   static ArrayList<Integer> list = new ArrayList<>();
    static void findallIndex(int[] arr,int index, int target){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findallIndex(arr,index+1,target);
    }
    static ArrayList<Integer> findall(int[] arr, int index,int target,ArrayList<Integer>list2){
        if (index == arr.length){
            return list2;
        }if (arr[index] == target){
            list2.add(index);
        }
        return findall(arr,index+1,target,list2);
    }
    static ArrayList<Integer> findall2(int[] arr, int index,int target){
        ArrayList<Integer> list2 = new ArrayList<>();
        if (index == arr.length){
            return list2;
        }if (arr[index] == target){
            list2.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findall2(arr,index+1,target);
        list2.addAll(ansFromBelowCalls);
        return list2;
    }
}
