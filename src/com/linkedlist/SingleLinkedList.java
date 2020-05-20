package com.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class SingleLinkedList {
	
	private Node head;
	
	static class Node {
		private int data;
		private Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}
	
	public void deleteAfter(Node after) {
		Node temp = head;
		while(temp.next != null && temp.data == after.data) temp = temp.next;
		if(temp.next != null) temp.next = temp.next.next;
	}
	
	public void insertLast(int data) {
		Node temp = head;
		while(temp.next != null) temp = temp.next;
		Node newNode = new Node(data);
		temp.next = newNode;
	}
	
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public Node reverseLinkedList(Node currentNode) {
		Node previousNode = null;
		Node nextNode = null;
		while(currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
	
	public Node findMiddleNode(Node head) {
		Node slowPointer,fastPointer;
		slowPointer = fastPointer = head;
		while(fastPointer != null) {
			fastPointer = fastPointer.next;
			if(fastPointer != null && fastPointer.next != null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
		}
		return slowPointer;
	}
	
	public Node findStartNodeOfTheLoop(Node head) {
		Node slowPointer,fastPointer;
		slowPointer = fastPointer = head;
		while(fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			if(fastPointer == slowPointer) {
				return slowPointer;
			}
		}
		return null;
	}
	
	public Node NthFromlast(Node head,int n) {
		Node firstPointer = head;
		Node secondPointer = head;
		for(int i=0;i<n;i++) {
			firstPointer = firstPointer.next;
		}
		while(firstPointer != null) {
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next;
		}
		return secondPointer;
	}
}
