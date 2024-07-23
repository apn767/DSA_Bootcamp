package com.alok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTrees tree =  new BinaryTrees();
//        tree.populate(scanner);
//        tree.prettydisplay();
//        BST tree = new BST();
//        int[] nums = {2,8,3,1,58,5659,6,65,9,25};
//        tree.populate(nums);
//        tree.display();
//        AVL tree = new AVL();
//        for (int i = 0;i< 1000;i++){
//            tree.insert(i);
//        }
//        System.out.println(tree.height());
        int[] arr = {3,8,6,7,-2,-8,4,9};
        Segment tree = new Segment(arr);
//        tree.display();
        System.out.println(tree.query(1,6));
    }
}
