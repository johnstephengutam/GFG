package com.day1;

public class SumOfNIntegers_1 {
    
	//Iterative approach - TC - O(n), SC - O(1)
	public static void sum(int[] arr, int n){
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
	
	//Recursive aaproach - TC - O(n), SC -  O(n) for function calls in stack space
	public static int sumRecursive(int n){
		if(n < 0){
			System.out.println("Please enter positive number");
			return n;
		}
		if(n == 0)
			return 0;
		return n+sumRecursive(n-1); 
	}
	
	public static void main(String[] args) {
	//	int arr[] = {1,2,3,-1,-2, 0};
	//	sum(arr, arr.length);
		
		int n = -1;
		System.out.println(sumRecursive(n));
	}

}
