package com.greatlearning.bst.driver;

import java.util.ArrayList;
import java.util.Scanner;

public class BST {
	Node root;
	ArrayList<Integer> data = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of nodes to insert");
		int n = scanner.nextInt();
		BST bst = new BST();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter "+(i+1)+" node to insert");
			bst.createNode(scanner.nextInt());
		}
		Node head = bst.root;
		bst.traverse(head);
		System.out.println("Enter sum to find: ");
		int sum = scanner.nextInt();
		boolean returnvalue = bst.findPair(sum);
		if (returnvalue)
		{
		System.out.println("Found a pair!!!");	
		}
		else
		{
			System.out.println("Could not find a pair");	
		}
		scanner.close();
	}

	public void createNode(int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			insert(root, data);
		}
	}

	private void insert(Node root, int data) {
		// TODO Auto-generated method stub
		if (data < root.data) {
			if (root.left == null)
				root.left = new Node(data);
			else
			insert(root.left, data);
		} else {
			if (root.right == null)
				root.right = new Node(data);
			else
			insert(root.right, data);
		}

	}

	private void traverse(Node head) {
		if (head!=null)
		{
		traverse(head.left);
		data.add(head.data);
		traverse(head.right);
		}
	}
	
	private boolean findPair(int sum) {
		for(int i =0;i<data.size();i++) {
			if(data.contains(sum - data.get(i)))
			{
				return true;
			}
		}
		return false;
	}
}

