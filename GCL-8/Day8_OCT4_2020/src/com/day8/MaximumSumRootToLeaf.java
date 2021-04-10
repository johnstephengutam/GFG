package com.day8;

class Node { 
    int data; 
    Node left, right; 
  
    public Node(int item) { 
        data = item; 
        left = null; 
        right = null; 
    } 
}

class BinaryTree { 
	  
    Node root; 
    
}

public class MaximumSumRootToLeaf {
	
	static int ans = -1;
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = getNode(1); 
        bt.root.left = new Node(2); 
        bt.root.right = new Node(3); 
        bt.root.left.left = new Node(4); 
        bt.root.left.right = new Node(5);
        maxRootToLeaf(bt.root);
        System.out.println(ans);
	}
	
	static int maxRootToLeaf(Node root){
		//solve(root, root.data); approach 1
		solve2(root, root.data);
		return ans;
	}
	
	static void solve(Node root, int sum){
		if(root.left != null)
			solve(root.left, sum+ root.left.data);
		if(root.right != null)
			solve(root.right, sum+ root.right.data);
		if(root.left ==null && root.right ==null)
			ans = Math.max(ans,sum);
	}
	
	static Node getNode(int data){
		Node newNode = new Node(data);
		return newNode;
	}
	//Approach 2
	static void solve2(Node root, int sum){
		if(root == null){
			ans = Math.max(ans, sum);
			return;
		}
		solve(root.left,sum+ root.left.data);
		solve(root.right,sum+ root.right.data);
	}

}
