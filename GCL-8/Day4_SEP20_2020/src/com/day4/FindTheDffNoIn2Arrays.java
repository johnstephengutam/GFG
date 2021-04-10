package com.day4;

public class FindTheDffNoIn2Arrays {
	public static int findDiffNo(int[] ar1, int[] ar2){
		int ans = 0;
		for(int i = 0; i < ar1.length; i++){
			ans ^= ar1[i];
		}
		for(int j = 0; j < ar2.length; j++)
			ans ^= ar2[j];
		return ans;
	}
	public static void main(String[] args) {
		int ar1[] = {1,2,3,606};
		int ar2[] = {1,2,3};
		System.out.println(findDiffNo(ar1,ar2));
	}

}
