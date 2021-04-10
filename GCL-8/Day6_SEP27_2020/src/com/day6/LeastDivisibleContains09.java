package com.day6;

import java.util.Deque;
import java.util.LinkedList;

public class LeastDivisibleContains09 {
	static Deque<Integer> dq = new LinkedList<Integer>();
	
	//Bruteforce
	static void leastDivisibleContains09(int N){
		int i;
		for(i = N;; i += N){
			int tp = i;
			while(tp > 0){
				if(tp%10 != 0 && tp%10 != 9)
					break;
				tp = tp/10;
			}
			if(tp == 0)
				break;
		}
		System.out.println(i);
	}
	
	//Efficient 
	static void leastDivisibleContains09_efficient(int N){
		int x = 0;
		dq.add(9);
		
		while(! dq.isEmpty()){
			x = dq.peek();
			dq.remove();
			if(x%N == 0)
				break;
			dq.add(x*10);
			dq.add(x*10 + 9);
		}
		System.out.println(x);
	}

	public static void main(String[] args) {
		int N = 7;
		//leastDivisibleContains09(N);
		leastDivisibleContains09_efficient(N);
	}
}
