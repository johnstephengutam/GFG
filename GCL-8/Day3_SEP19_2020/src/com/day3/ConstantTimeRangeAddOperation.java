package com.day3;

import java.util.Scanner;

public class ConstantTimeRangeAddOperation {
	private static Scanner sc;
	
	//O(r-l)*(q)
	public static int[] constantAddOperation_bruteforce(int[] arr,int l,int r, int x){
		for(int i = l; i <= r; i++)
			arr[i] = arr[i]+x;
		
		return arr;
	}
	
	//O(N) * O(1) = N  for the prefix sum * O(1) for accessing the element
	public static int[] constantAddOperation_Optimized_prefixarray(int[] arr){
		for(int i = 1; i < arr.length; i++){
			arr[i] = arr[i] + arr[i-1];
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,0,0,0,0};
		int q = 2;
		sc = new Scanner(System.in);
		while(q > 0){
			int l = sc.nextInt();
			int r = sc.nextInt();
			int x = sc.nextInt();
			
			//arr = constantAddOperation_bruteforce(arr,l,r,x);
			
			arr[l] = arr[l] + x;
			arr[r+1] = arr[r+1] - x;
			--q;
		}
		arr = constantAddOperation_Optimized_prefixarray(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");

	}

}
