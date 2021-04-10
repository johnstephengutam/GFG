package com.day3;

public class SlidingWindowTechnique {
	public static void twoPointersApproach_Sorting(int[] arr,int n, int k){
		int l = 0;
		int r = n-1;
		while(l < r){
			if(arr[l]+arr[r] == k)
				break;
			else if(arr[l]+arr[r] < k)
				l++;
			else
				r--;
		}
		if(l < r)
			System.out.println(l+" "+r);
		else
			System.out.println("-1");
	}
	
	public static void slidingWindowTechnique(int[] arr,int n, int k){
		int start = 0;
		int i = 1;
		int sum = arr[0];
		while(i < n){
			if(sum == k)
				break;
			else if(sum < k){
				sum = sum + arr[i];
				i++;
			}
			else{
				sum = sum - arr[start];
				start++;
			}
		}
		if(i < n)
			System.out.println(start+" "+(i-1));
		else
			System.out.println("-1");
	}
	
	public static void main(String[] args) {
		/*Given array non negative, not sorted
		sum = k
		sub array*/
		/*int arr[] = {1,20,4,3,6,7,5};
		Arrays.sort(arr);
		int k = 23;
		twoPointersApproach_Sorting(arr,arr.length,k);*/
		
		int arr[] = {1,4,20,3,6,7,5};
		int k = 23;
		slidingWindowTechnique(arr,arr.length,k);
	}
}
