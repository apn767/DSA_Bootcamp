package com.alok;

public class Segment{
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
    }
    private class Node{
        int data;
        int startinterval;
        int endinterval;
        Node left;
        Node right;

        public Node(int startinterval, int endinterval){
            this.startinterval = startinterval;
            this.endinterval = endinterval;
        }
    }
    Node root;
    public Segment(int[] arr){
        this.root = constructTree(arr, 0,arr.length -1);
    }
    public Node constructTree(int[] arr, int start,int end){
        if (start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start,end);
        int mid = (start + end)/2;
        node.left = this.constructTree(arr,start , mid);
        node.right  =this.constructTree(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str  = "";
        if (node.left != null){
            str = str + "Interval=["+ node.left.startinterval + "-" + node.left.endinterval + "] and data: " + node.left.data+ "=>";
        }else{
            str = str + "No left child";
        }
        str = str + "Interval=[" + node.startinterval + "-" + node.endinterval + "] and data: " + node.data + "<=";
        if (node.right != null){
            str = str + "Interval=["+ node.right.startinterval + "-" + node.right.endinterval + "] and data: " + node.right.data;
        }else{
            str = str + "No right child";
        }
        System.out.println(str + "\n");
        if (node.left != null){
            display(node.left);
        }
        if (node.right != null){
            display(node.right);
        }
    }
    public int query(int qsi, int qei){
        return this.query(this.root,qsi,qei);
    }
    private int query(Node node, int qsi,int qei){
        if (node.startinterval>= qsi && node.endinterval <= qei){
            return node.data;
        } else if (node.startinterval > qei || node.endinterval < qsi) {
            return 0;
        }else{
            return this.query(node.left,qsi,qei) + this.query(node.right,qsi,qei);
        }
    }
    public void update(int index,int value){
        this.root.data = update(this.root,index,value);
    }
    private int update(Node node,int index, int value){
        if (index >= node.startinterval && index <= node.endinterval){
            if (index == node.startinterval && index == node.endinterval){
                node.data = value;
                return node.data;
            }else{
                int leftAns  = update(node.left, index,value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
