package com.job;

public class Reverse {
	
	//Reverse of an Integer array
	static void reverse(long[] arr){
		
		//Two pointer from starting and ending od the given array
		int left = 0;
		int right = arr.length-1;
		
		//Swap the first and last element and move the pointers
		while(left < right){
			long temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		long[] arr = {1,2,3,4}; 
		reverse(arr);
	}
}
