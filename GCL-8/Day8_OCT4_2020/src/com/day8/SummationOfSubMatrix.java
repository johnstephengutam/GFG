package com.day8;

public class SummationOfSubMatrix {
	static  int x1 = 1, y1 = 1, x2 = 2, y2 = 4;
			
	//Bruteforce
	static void summation(int mat[][]){
		int sum = 0;
		for(int i = x1; i <= x2; i++){
			for(int j = y1; j <= y2; j++){
				sum += mat[i][j];
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int arr[][] = {{5,2,6,1,9},
						{3,1,9,2,3},
						{1,2,7,9,3},
						{9,5,2,11,2}};
		summation(arr);
	}

}
