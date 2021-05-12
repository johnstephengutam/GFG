package com.Arrays;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer T = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < T; i++){
	    	int N = Integer.parseInt(sc.nextLine());
	    	
	    	String[] arr = sc.nextLine().split(" ");
	    	int result = missingNumber(arr);
			if(result == -1)
				System.out.println(-1);
			else
				System.out.println(result);
	    	}
	    }
	
	static int missingNumber(String[] arr){
		int lastNumber = Integer.parseInt(arr[arr.length-1]);
		int totalSum = lastNumber*(lastNumber+1)/2;
		int intSum = 0;
		if(arr.length == 1)
			return Integer.parseInt(arr[0])+1;
		for(int i = 0 ; i < arr.length; i++)
			intSum = intSum+ Integer.parseInt(arr[i]);
		if(totalSum-intSum > 0)
			return (totalSum-intSum);
		return -1;
	}
}
