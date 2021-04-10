package com.day7;

import java.util.LinkedList;
import java.util.Queue;


class BinaryTree2 {
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

public class BFSTraversal {
	
	static void printLevelOrder(Node root){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(queue.isEmpty() == false){
			Node curr = queue.peek();
			queue.poll();
			System.out.println(curr.data);
			if(curr.left != null)
				queue.add(curr.left);
			if(curr.right != null)
				queue.add(curr.right);
		}
	}
	
	static Node getNode(int data){
		Node newNode = new Node(data);
		return newNode;
	}
	
	public static void main(String[] args) {
		BinaryTree1 bt = new BinaryTree1();
		bt.root = getNode(1);
		bt.root.left = getNode(2);
		bt.root.right = getNode(3);
		printLevelOrder(bt.root);
	}

}
