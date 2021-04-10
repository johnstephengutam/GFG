package com.day2;

import java.util.Arrays;

public class SumPair {
	
	//O(N) + O(Nlog N) =O(Nlog N)
	public static void sumPairToZero(int[] arr, int sum){
		
		Arrays.sort(arr); //O(Nlog N)
		int l = 0; 
		int r = arr.length-1;
		
		while(l < r){
			if(arr[l] + arr[r] == sum){
				System.out.println(l+" "+r);
				break;
			}
			else if(arr[l] + arr[r] > sum)
				r--;
			else
				l++;
		}
		if(l > r)
		 System.out.println("No elements");
	}
	
	public static void subArray(){
		
	}

	public static void main(String[] args) {
		int arr[] = {1,-1,0,2};//{1,4,6,2,3,7};
		int sum = 3;
		sumPairToZero(arr, sum);
	}

}
