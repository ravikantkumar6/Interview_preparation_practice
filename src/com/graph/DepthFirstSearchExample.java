package com.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchExample {
    public static void main(String... s) {
        Node node40 = new Node(40);
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node60 = new Node(60);
        Node node50 = new Node(50);
        Node node70 = new Node(70);

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

        DepthFirstSearchExample dfsExample = new DepthFirstSearchExample();

        System.out.println("The DFS traversal of the graph using stack ");
        dfsExample.dfsUsingStack(node40);

        System.out.println();

        // Resetting the visited flag for nodes
        node40.visited = false;
        node10.visited = false;
        node20.visited = false;
        node30.visited = false;
        node60.visited = false;
        node50.visited = false;
        node70.visited = false;


        System.out.println("The DFS traversal of the graph using recursion ");
        dfsExample.dfsRec(node40);
    }

    public void dfsRec(Node node) {
        if (node == null) return;
        System.out.print(node.data + ",");
        List<Node> neighbourList = node.getNeighbours();
        node.visited = true;
        for (Node n : neighbourList) {
            if (n != null && !n.visited) dfsRec(n);
        }
    }

    public void dfsUsingStack(Node node) {
        if (node == null) return;
        Stack<Node> stack = new Stack<Node>();
        stack.add(node);
        while (!stack.isEmpty()) {
            Node element = stack.pop();
            System.out.print(element.data + ",");
            List<Node> nodeList = element.getNeighbours();
            element.visited = true;
            for (Node neighbourElement : nodeList) {
                if (neighbourElement != null && !neighbourElement.visited) stack.add(neighbourElement);
            }
        }
    }

    static class Node {
        int data;
        boolean visited;
        List<Node> neighbours;

        Node(int data) {
            this.data = data;
            this.neighbours = new ArrayList<Node>();
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
}
