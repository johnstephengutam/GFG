package com.day1;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedNumberUsingHasing {
	
	public static int nonRepeatingElement(int[] arr, int n){
		Map<Integer, Integer> map = new HashMap();
		
		for(int i = 0; i < n; i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
				map.put(arr[i], 1);
		}
		
		for(int i = 0; i < n; i++){
			if(map.get(arr[i]) == 1){
				return arr[i];
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,3,4,5,5,5};
		int element = nonRepeatingElement(arr,arr.length);
		
		if(element > 0)
			System.out.println("Element found at "+ element);
		else
			System.out.println("Not found");

	}

}
