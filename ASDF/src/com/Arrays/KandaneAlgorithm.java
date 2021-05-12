package com.Arrays;

import java.util.Scanner;

public class KandaneAlgorithm {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    Integer T = Integer.parseInt(sc.nextLine());
	    for(int i = 0; i < T; i++){
	    	int N = Integer.parseInt(sc.nextLine());
	    	if(N>0){
	    	String[] arr = sc.nextLine().split(" ");
	    	int result = contigiousSubArray(arr);
			if(result == -1)
				System.out.println(-1);
			else
				System.out.println(result);
	    	}else{
	    		System.out.println(N);
	    	}
	    }
		
	}
	static int contigiousSubArray(String[] arr){
		int max = 0;
		for(int i= 0; i < arr.length; i++){
			int sum = Integer.parseInt(arr[i]);
			for(int j = i+1; j < arr.length; j++){
				sum = sum+Integer.parseInt(arr[j]);
				if(max < sum)
					max = sum;
				if(max < Integer.parseInt(arr[j]))
						max = Integer.parseInt(arr[j]);
			}
		}
		//if(max > 0)
			return max;
		//return -1;
	}

}
