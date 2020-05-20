package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeGetMaxElement {

    public static int getMaximumRec(TreeNode root) {
        if (root == null) return 0;
        int maxElement = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (maxElement < temp.data) {
                maxElement = temp.data;
            }
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("Max node using recursion :" + getMaximumRec(rootNode));
    }

    public static TreeNode createBinaryTree() {

        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        rootNode.left = node20;
        rootNode.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node50;
        node60.right = node70;

        return rootNode;
    }

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
