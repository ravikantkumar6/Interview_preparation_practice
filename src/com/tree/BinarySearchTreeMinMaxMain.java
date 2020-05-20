package com.tree;

public class BinarySearchTreeMinMaxMain {

    public static boolean search(TreeNode root, TreeNode nodeToBeSearched) {
        if (root == null) return false;
        if (root.data == nodeToBeSearched.data) return true;
        boolean result = false;
        if (root.data > nodeToBeSearched.data) {
            result = search(root.left, nodeToBeSearched);
        } else {
            result = search(root.right, nodeToBeSearched);
        }
        return result;
    }

    public static TreeNode minimumElement(TreeNode root) {
        if (root.left == null) return root;
        else return minimumElement(root.left);
    }

    public static TreeNode maximumElement(TreeNode root) {
        if (root.right == null) return root;
        else return maximumElement(root.right);
    }

    public static TreeNode insert(TreeNode root, TreeNode nodeToBeInserted) {
        if (root == null) {
            root = nodeToBeInserted;
        } else {
            if (root.data > nodeToBeInserted.data) {
                if (root.left == null) {
                    root.left = nodeToBeInserted;
                } else {
                    insert(root.left, nodeToBeInserted);
                }
            } else if (root.data < nodeToBeInserted.data) {
                if (root.right == null) {
                    root.right = nodeToBeInserted;
                } else {
                    insert(root.right, nodeToBeInserted);
                }
            }
        }
        return root;
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
