package com.day6;

import java.util.Stack;

//INCOMPLETE ONE - BRUTE FORCE NOT CLEAR - NEED TO CHECK AGAINc

public class LargestRectangleArea {
	//Bruteforce
	public static int rectangleArea(int[] arr){
		int ans = arr[0];
		int n = arr.length;
		for(int i = 0; i < n; i++){ // iterating for each bar T(N) = O(N*N)
			int rightMin = arr[i];
			
			//calculating the first min in the right of bar and right area with it
			int count1 = 1; //own bar
			for(int j = i+1; j < n; j++){
				if(arr[j] < arr[i]){
					rightMin = arr[j];
					break;
				}
			}
			for(int k = i+1; k < n; k++){
				if(arr[k] >= rightMin)
					count1++;
				else 
					break;
			}
			int rightArea = 0;
			if(count1 > 1)
				rightArea = count1 * rightMin;
			
			//calculating the first min left of bar and left area with it
			int count2 = 1; //own bar
			int leftMin = rightMin;
			
			for(int j = i-1; j >= 0; j--){
				if(arr[j] < arr[i]){
					leftMin = arr[j];
					break;
				}
			}
			for(int k = i-1; k >= 0; k--){
				if(arr[k] >= leftMin)
					count2++;
				else 
					break;
			}
			int leftArea = 0;
			if(count2 > 1)
			leftArea = count2 * leftMin;
			
			//calculating the total area
			int totalArea = 0;
			if(leftArea == 0 || rightArea == 0)
				totalArea = Math.abs(rightArea - leftArea);
			else
				totalArea = Math.abs(rightArea + leftArea) - leftMin;
			
			//And taking max
			ans = Math.max(ans, totalArea);
		}
		return ans;
	}
	
	static Stack<Integer> st = new Stack<Integer>();
	
	//Using stack implementation - O(N)
	public static int rectangleAreaOptimize(int[] arr){
		int n=arr.length;
		int[] prev = new int[n];
		int[] next = new int[n];
		int ans = 0;
		for(int i = 0; i < n; i++){
			while(!st.isEmpty() && arr[i] < arr[st.peek()]){
				int x = st.peek();
				st.pop();
				next[x] = i;
			}
			if(!st.isEmpty()){
				prev[i] = st.peek(); 
			}else
				prev[i] = -1;
			st.push(i);
		}
		
		while(!st.isEmpty()){
			int x = st.peek();
			next[x] = n;
			st.pop();
		}
		for(int i =0; i < n; i++){
			ans = Math.max(ans, (next[i]-prev[i]-1)*arr[i]);
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {45,35,25,4,5,1,6};
		//int area = rectangleArea(arr);
		int area = rectangleAreaOptimize(arr);
		System.out.println(area);
	}

}
