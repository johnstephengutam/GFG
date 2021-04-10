package com.day7;

class Node{
	int data;
	Node left, right;
	
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}

public class BinaryTree {
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
	/*public static void main(String[] args) {
	root = getNode(10);
	root.left = getNode(5);
	root.right = getNode(20);
	System.out.println(heightOfTree(root));
	}*/
	//Approach2
	static void heightOfTree2(Node root){
		solver(root,0);
	}
	static int ans = 0;
	
	static void solver(Node root, int curr_level){
		ans = Math.max(ans,curr_level);
		if(root == null)
			return;
		else{
			solver(root.left, curr_level+1);
			solver(root.right, curr_level+1);
		}
	}
	
	public static void main(String[] args){
		root = getNode(10);
		root.left = getNode(5);
		root.right = getNode(20);
		heightOfTree2(root);
		System.out.println(ans);
	}
	
}
