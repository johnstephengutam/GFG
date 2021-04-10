package com.day3;

import java.util.Arrays;
import java.util.HashMap;

public class FindDistinctElements {

	public static void findDistinct(int[] arr, int n){
		int[] freq = new int[10]; 
		for(int i =0; i < n; i++){
			//freq[arr[i]]++;
			freq[arr[i]]++;
		}		
		int count = 0;
		for(int i = 0; i < 10; i++){
			if(freq[i] > 0)
				count++;
		}
		System.out.println(count);
	}
	
	public static void findDistinct_Optimize(int[] arr, int n){
		Arrays.sort(arr);
		int count = 1;
		for(int i= 1; i < n; i++){
			if(arr[i-1] != arr[i])
				count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,3,2,2,2,2,2,3,3,3,3,7};
		//findDistinct(arr,arr.length);
		findDistinct_Optimize(arr,arr.length);
	}

}
