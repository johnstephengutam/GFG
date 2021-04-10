package com.day2;

public class PrefixSumArray {
	//Prefix array TC: O(N), SC:O(N)
	static void prefixSum_bruteforce(int[] arr){
		int n = arr.length;
		int sum[] = new int[n];
		//O(N)
		sum[0] = arr[0];
		for(int i = 1; i < n; i++ ){
			sum[i] = arr[i] + sum[i-1];
		}
		for(int i =0; i < n; i++){ //O(N)
			System.out.print(sum[i]+" ");
		}
	}
	//It seems we can use single varibale and sun
	static void prefixSum_SingleVariable(int[] arr){
		
	}
	
	static void sum_Of_SubArray(int[] arr, int i, int j){
		int l = prefixSum(arr,i-1);
		int r = prefixSum(arr,j);
		
		System.out.println(r-l);
	}
	
	static int prefixSum(int[] arr, int i){
		int sum = arr[0];
		for(int j = 1; j <= i; j++ ){
			sum = sum + arr[j];
		}
		return sum;
	}
	
	//IF we maintain a predix array SC O(N) -  we can do the million operations in O(1)
	
	public static void main(String[] args) {
		int arr[] = {1,4,6,2,3};
		sum_Of_SubArray(arr,2,3);
	}

}
