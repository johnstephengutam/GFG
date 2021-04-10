package com.day9;

class Node{
	int data;
	Node left, right;
	
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}

class BinaryTree {
	static Node root;
	
	static Node getNode(int data){
		Node newNode = new Node(data);
		return newNode;
	}
	
	//O(N)
	public static int heightOfTree(Node root){
		if(root == null)
			return 0;
		else{
			int left_h = heightOfTree(root.left);
			int right_h = heightOfTree(root.right);
			return Math.max(left_h, right_h)+1;
		}
	}
	
	public static void findMin(Node root){
		if(root.left == null){
			System.out.println(root.data);
			return;
		}
		findMin(root.left);
	}
	public static void findMax(Node root){
		if(root.right == null){
			System.out.println(root.data);
			return;
		}
		findMin(root.right);
	}
}

public class FindMin {
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = bt.getNode(10);
		bt.root.left = bt.getNode(5);
		bt.root.left.left = bt.getNode(2);
		bt.root.left.right = bt.getNode(7);
		bt.root.right = bt.getNode(20);
		
		bt.findMax(bt.root);
		//inOrder(bt.root);
	}

	
}
