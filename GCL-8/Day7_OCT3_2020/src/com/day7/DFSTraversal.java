package com.day7;


class BinaryTree1 {
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
}

public class DFSTraversal {
	static void inOrder(Node root){
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	static void preOrder(Node root){
		if(root == null)
			return;
		System.out.print(root.data+" ");
		inOrder(root.left);
		inOrder(root.right);
	}
	static void postOrder(Node root){
		if(root == null)
			return;
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data+" ");
	}
	static Node getNode(int data){
		Node newNode = new Node(data);
		return newNode;
	}
	public static void main(String[] args) {
		BinaryTree1 bt = new BinaryTree1();
		bt.root = getNode(10);
		bt.root.left = getNode(5);
		bt.root.right = getNode(20);
		inOrder(bt.root);
	}
}
