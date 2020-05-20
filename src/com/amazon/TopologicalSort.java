package com.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {
	
	Stack<Node> stack = null;
	
	static class Node{
		int data;
		boolean visited;
		List<Node> neighbours;
		
		public Node(int data) {
			this.data = data;
			neighbours = new ArrayList<>();
		}
		
		public void addNeighbours(Node neighbour) {
			this.neighbours.add(neighbour);
		}

		public List<Node> getNeighbours() {
			return neighbours;
		}

		public void setNeighbours(List<Node> neighbours) {
			this.neighbours = neighbours;
		}
		
	}
	
	public void topologicalSort(Node node) {
		List<Node> neighbours = node.getNeighbours();
		for(int i =0;i<neighbours.size();i++) {
			Node n = neighbours.get(i);
			if(n != null && !n.visited) {
				topologicalSort(n);
				n.visited = true;
			}
		}
		stack.push(node);
	}
	
	public static void main(String arg[])
	{
 
		TopologicalSort topological = new TopologicalSort();
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
 
		node40.addNeighbours(node10);
		node40.addNeighbours(node20);
		node10.addNeighbours(node30);
		node20.addNeighbours(node10);
		node20.addNeighbours(node30);
		node20.addNeighbours(node60);
		node20.addNeighbours(node50);
		node30.addNeighbours(node60);
		node60.addNeighbours(node70);
		node50.addNeighbours(node70);
 
		System.out.println("Topological Sorting Order:");
		topological.topologicalSort(node40);
		
		// Print contents of stack
		Stack<Node> resultStack=topological.stack;
		while (resultStack.empty()==false)
			System.out.print(resultStack.pop() + " ");
	}
}
