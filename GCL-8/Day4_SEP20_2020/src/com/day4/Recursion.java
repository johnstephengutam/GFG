package com.day4;

public class Recursion {
	public static void printNto1(int N){
		if(N < 1)
			return;
		System.out.print(N+" ");
		printNto1(N-1);
	}
	public static void print1toN(int N){
		if(N < 1)
			return;
		print1toN(N-1);
		System.out.print(N+" ");
	}
	public static int fact(int N){
		if(N == 0)
			return 1;
		return N *	fact(N-1);
	}
	public static int fact(int N, int ans){
		if(N == 0)
			return ans;
		return fact(N-1, ans * N);
	}
	public static int fib(int N){
		if(N == 0||N ==1)
			return N;
		return fib(N-1) + fib(N-2);
	}
	public static int sumOfDigits(int N){
		if(N == 0)
			return 0;
		return N%10 + sumOfDigits(N/10);
	}
	public static int sumOfArray(int n){
		/*int sum = 0;
		for(int i=0; i < ar.length; i++){
			sum += ar[i];
		}
		return sum;*/
		if(n == 0)
			return 0;
		return ar[n-1]+ sumOfArray(n-1);
	}
	static int ar[] = {1,2,3,4,5,6};
	public static void main(String[] args) {
		/*printNto1(5);
		System.out.println();
		print1toN(5);*/
		//System.out.println(fact(5));
		//System.out.println(fact(5,1));
		//System.out.println(fib(5));
		//System.out.println(sumOfDigits(193));
		
		System.out.println(sumOfArray(6));
	}
}
