package com.alok.Backtracking;

import java.util.ArrayList;

public class NoOfPaths {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        System.out.println(pathdiagret("", 3,3));;
   boolean[][] board = {
           {true,true,true},
        {true,false,true},
        {true,true,true}
    };
   pathrestriction("", board, 0, 0);
    }
    static int count(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r,c-1);
        return left + right;
    }
    static void path(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r > 1){
            path(p +'D', r-1,c);
        }
        if (c>1){
            path(p +'R', r,c-1);
        }
    }
    static ArrayList<String> pathret(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathret(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathret(p + 'R', r, c - 1));
        }
        return list;
    }
    static ArrayList<String> pathdiagret(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c >1){
            list.addAll(pathdiagret(p + 'D', r-1,c-1));
        }
        if (r > 1){
           list.addAll(pathdiagret(p +'V', r-1,c));
        }
        if (c>1){
            list.addAll(pathdiagret(p +'H', r,c-1));
        }return list;
    }
    static void pathrestriction(String p,boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if (r < maze.length -1){
            pathrestriction(p +'D',maze, r+1,c);
        }
        if (c < maze[0].length -1){
            pathrestriction(p +'R',maze, r,c+1);
        }
}}
