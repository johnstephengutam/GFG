package com.day6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackOperations {
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();
	
	/*static void implementingStackUsingQueue(int[] arr){
		
		for(int i = 0; i < arr.length; i++){
			q1.add(arr[i]);
		}
		
		while(q1.size() > 0){
			int N = q1.size()-1;
			for(int i = 1; i <= N; i++){
				q2.add(q1.poll());
			}
			System.out.println(q1.poll());
			if(q1.isEmpty())
				swapQueues(q1,q2);
		}
	}*/
	
	//Approach1: Push in O(1) and Pop in  O(N)
	/*static void push2(int x){  // O(1)
		q1.add(x);
	}
	
	static int pop2(){  // O(N)
		if(q1.isEmpty())
			return -1;
		
		while(q1.size() > 1){
			q2.add(q1.poll());
		}
		
		int ret = q1.poll();
		if(q1.isEmpty())
			swapQueues(q1,q2);
		return ret;
	}*/
	
	/*//Approach2: Push in O(N) and Pop in O(1)
	static public int pop2() {
	    int ret = q1.remove();
	    return ret;
	}
	
	static public void push2(int x) { // For every new element we are adding n-1 elements to q2 in worst case
	    q2.add(x);
	    while (!q1.isEmpty()) {                
	        q2.add(q1.remove());
	    }
	    swapQueues(q1, q2);
	}
	
	static void swapQueues(Queue<Integer> x, Queue<Integer> y){
		q1 = y;
		q2 = x;
	}
	
	public static void main(String[] args) {
		int arr [] = {1,2,3,4};
		
		for(int i = 0; i < arr.length; i++){
			push2(arr[i]);
		}
		
		for(int i = 0; i < 4; i++)
			System.out.println(pop2());
		
	}*/
	
	// Implement stack using the one queue
	static void push2(int x){  // O(1)
		q1.add(x);
	}
	
	static int pop2(){ //O(N)
		int N = q1.size();
		while(N > 1){
			q1.add((q1.poll()));
			--N;
		}
		int ret = q1.poll();
		return ret;
	}
	
	public static void main(String[] ags){
		int arr [] = {1,2,3,4}; 
		
		for(int i = 0; i < arr.length; i++){
			push2(arr[i]);
		}
		
		for(int i = 0; i < 4; i++)
			System.out.println(pop2());
	}
}
