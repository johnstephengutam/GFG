package com.day8;


public class MaximumSumRootToAnyOtherNode {

	static int ans = -1;
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = getNode(1); 
        bt.root.left = new Node(2); 
        bt.root.right = new Node(3); 
        bt.root.left.left = new Node(4); 
        bt.root.left.right = new Node(5);
        maxSumOneToLeaf(bt.root);
        System.out.println(ans);
	}
	
	static int maxSumOneToLeaf(Node root){
		int x = solve(root, root.data);
		return ans;
	}
	
	static int solve(Node root, int sum){
		if(root == null)
			return 0;
		int left = solve(root.left, ans);
		int right = solve(root.right, ans);
		
		int max_single_path = Math.max(Math.max(left, right)+root.data,root.data);
		
		ans = Math.max(ans, max_single_path);
		ans = Math.max(ans, left + right + root.data);
		
		return max_single_path;
	}
	
	static Node getNode(int data){
		Node newNode = new Node(data);
		return newNode;
	}

}
