package com.alok;

public class AVL {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public AVL(){

    }
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value, Node node){
        if (node == null){
            node = new Node(value);
            return node;
        }
        if (value < node.value){
            node.left = insert(value,node.left);
        }
        if (value> node.value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }
    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            if (height(node.left.left) - height(node.left.right) > 0){
                return rightrotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                node.left = leftrotate(node.left);
                return rightrotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            if (height(node.right.left) - height(node.right.right) < 0){
                return leftrotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                node.left = rightrotate(node.left);
                return leftrotate(node);
            }
        }
        return node;
    }
    public Node leftrotate(Node c){
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left), height(p.right)+1);
        c.height = Math.max(height(c.left), height(c.right)+1);
        return p;
    }
    public Node rightrotate(Node p){
    Node c = p.left;
    Node t = c.right;
    c.right = p;
    p.left = t;
    p.height = Math.max(height(p.left), height(p.right)+1);
    c.height = Math.max(height(c.left), height(c.right)+1);
    return c;
    }
    public void populate(int[] nums){
        for (int i = 0;i< nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public void populatesorted(int[] nums){
        populatesorted(nums,0,nums.length);
    }
    public boolean balanced(){
        return balanced(root);
    }
    private void populatesorted(int[] nums,int start,int end){
        if (start >= end){
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populatesorted(nums,start,mid);
        populatesorted(nums,mid+1,end);
    }
    private boolean balanced(Node node){
        if (node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right))  <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void display(){
        display(root, "Root Node: ");
    }
    private void display(Node node, String details){
        if (node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }
}
