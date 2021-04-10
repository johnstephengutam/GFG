package com.day2;

public class SquareRootOfX {
	//X is an integer
	public static int squareRoot(int x){
		int left = 0;
		int right = x;
		while(left <= right){
			int mid = (left + right)/2;
			if(mid*mid == x){
				return mid;
			}
			else if(mid * mid > x)
				right = mid - 1;
			else 
				left = mid + 1;
		}
		return -1;
	}
	
	//X is an real number
	public static double squareRoot_real(double x){
		double left = 0;
		double right = x;
		while(left <= right){
			double mid = (left + right)/2;
			if(Math.abs(mid*mid - x) < 0.01){
				return mid;
			}
			else if(mid * mid > x)
				right = mid - 0.001;
			else 
				left = mid + 0.001;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		/*int x = 25;
		System.out.println(squareRoot(x));*/
		
		
		System.out.println(squareRoot_real(0.09));
	}
}
