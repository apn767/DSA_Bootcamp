package com.alok;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Questions {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null){
//            return result;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()){
//            int levelsize = queue.size();
//            List<Integer> currentlevel = new ArrayList<>(levelsize);
//            for (int i = 0;i<levelsize; i++){
//                TreeNode currentnode = queue.poll();
//                currentlevel.add(currentnode.val);
//                if (currentnode.left != null){
//                    queue.offer(currentnode.left);
//                }
//                if (currentnode.right!= null){
//                    queue.offer(currentnode.right);
//                }
//            }result.add(currentlevel);
//        }return result;
//    }
//    public TreeNode findSuccessor(TreeNode root, int key){
//        if (root == null){
//            return null;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            TreeNode currentNode = queue.poll();
//            if (currentNode.left != null) {
//                queue.offer(currentNode.left);
//            }
//            if (currentNode.right != null) {
//                queue.offer(currentNode.right);
//            }
//            if (currentNode.val = key) {
//                break;
//            }
//        }
//        return queue.peek();
//    }
//public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//    List<List<Integer>> result = new ArrayList<>();
//        if (root == null){
//            return result;
//        }
//        Deque<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        boolean reverse = false;
//
//        while (!queue.isEmpty()){
//            int levelsize = queue.size();
//            List<Integer> currentlevel = new ArrayList<>(levelsize);
//            for (int i = 0;i<levelsize; i++) {
//                if (!reverse) {
//                    TreeNode currentnode = queue.pollFirst();
//                    currentlevel.add(currentnode.val);
//                    if (currentnode.left != null) {
//                        queue.addLast(currentnode.left);
//                    }
//                    if (currentnode.right != null) {
//                        queue.addLast(currentnode.right);
//                    }
//                } else {
//                    TreeNode currentnode = queue.pollLast();
//                    currentlevel.add(currentnode.val);
//                    if (currentnode.right != null) {
//                        queue.addFirst(currentnode.right);
//                    }
//                    if (currentnode.left != null) {
//                        queue.addFirst(currentnode.left);
//                    }
//                }
//            }
//                reverse = !reverse;
//
//            result.add(currentlevel);
//        }return result;
//    }
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        if (root == null) {
//            return result;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            List<Integer> currentLevel = new ArrayList<>(levelSize);
//            for (int i=0; i < levelSize; i++) {
//                TreeNode currentNode = queue.poll();
//                currentLevel.add(currentNode.val);
//                if (currentNode.left != null) {
//                    queue.offer(currentNode.left);
//                }
//                if (currentNode.right != null) {
//                    queue.offer(currentNode.right);
//                }
//            }
//            result.add(0,currentLevel);
//        }
//        return result;
//    }
}
