package com.day1;

public class BinarySearch_3 {
	
	public static int binarySearch_bruteforce(int[] arr,int x){
		int left = 0;
		int right = arr.length - 1;
		while(left <= right){
			int mid = (left + right)/2;
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				right = mid - 1;
			else 
				left = mid + 1;
		}
		return -1;
	}
	
	//Sorted array with repeared elements get the first occurence of a given integer from left
	public static int firstOccuranceOfRepeatedIntegerFromLeft(int[] arr, int x){
		int left = 0;
		int right = arr.length - 1;
		int ans = -1;
		while(left <= right){
			int mid = (left + right)/2;
			if(arr[mid] == x){
				ans = mid;
				right = mid -1;
			}
			else if(arr[mid] > x)
				right = mid - 1;
			else 
				left = mid + 1;
		}
		return ans;
	}
	
	public static int firstOccuranceOfRepeatedIntegerFromRight(int[] arr, int x){
		int left = 0;
		int right = arr.length - 1;
		int ans = -1;
		while(left <= right){
			int mid = (left + right)/2;
			if(arr[mid] == x){
				ans = mid;
				left = mid +1;
			}
			else if(arr[mid] > x)
				right = mid - 1;
			else 
				left = mid + 1;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		/* Binary search
		 * int[] arr = {1,2,3,4,5,6,7,8};
		int x = 3;
		int index = binarySearch_bruteforce(arr, x);
		
		if(index > 0)
			System.out.println("Element found at "+ index);
		else
			System.out.println("Not found");*/
		
		//First occurence of repeated element
		int[] arr = {1,2,3,3,4,4,4,5,6,6};
		int x = 4;
		int first = firstOccuranceOfRepeatedIntegerFromLeft(arr, x);
		int last = firstOccuranceOfRepeatedIntegerFromRight(arr, x);
		
		System.out.println("Total occurances "+(last-first+1));
		
		
		/*if(index > 0)
			System.out.println("Element found at "+ index);
		else
			System.out.println("Not found");*/
		
	}

}
