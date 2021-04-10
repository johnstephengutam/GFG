package com.day4;

public class ConvertBinaryToDecimal {
	public static int converbToD(int bits){
		int i = 0;
		int sum = 0;
		while(bits > 0){
			int bit = bits %10;
			sum += bit * Math.pow(2, i);
			bits = bits/10;
			i++;
		}
		return sum;
	}
	public static void main(String[] args) {
		int bits = 111;
		System.out.println(converbToD(bits));
	}

}
