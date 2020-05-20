package com.tree;

import java.util.Stack;

public class BinaryTreeInOrder {

    public static void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.printf("%d ", root.data);
            inOrderRec(root.right);
        }
    }

    public static void inOrderIter(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode t = stack.pop();
                System.out.printf("%d ", t.data);
                current = t.right;
            }
        }
    }

    public static void main(String... strings) {
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

        inOrderRec(rootNode);
        inOrderIter(rootNode);
    }

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

}
