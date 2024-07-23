package com.alok.strings;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        System.out.println(subsequencasciiret("", "abc"));
    }
    static void subsequence(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequence(p,up.substring(1));
        subsequence(p + ch,up.substring(1));
    }
    static ArrayList<String> subsequenc(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left =  subsequenc(p,up.substring(1));
        ArrayList<String> right = subsequenc(p + ch,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subsequencascii(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequencascii(p,up.substring(1));
        subsequencascii(p + ch,up.substring(1));
        subsequencascii(p + (ch + 0), up.substring(1));
    }
    static ArrayList<String> subsequencasciiret(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
       ArrayList<String> first =  subsequencasciiret(p,up.substring(1));
        ArrayList<String> second = subsequencasciiret(p + ch,up.substring(1));
        ArrayList<String> third = subsequencasciiret(p + (ch + 0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
