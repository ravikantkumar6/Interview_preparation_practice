package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {
	
	static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data){
			this.data = data;
		}
	}
	
	public static void printReverseLevelOrderTraversal(TreeNode root) {
		if(root == null) return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			if(root.left != null) {
				queue.add(root.left);
			}
			if(root.right != null) {
				queue.add(root.right);
			}
			stack.add(temp);
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().data+",");
		}
	}
	
	public static void main(String...s) {
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
		
		System.out.println("Reverse Level Order traversal of binary tree will be:");
		printReverseLevelOrderTraversal(rootNode);
	}

}
