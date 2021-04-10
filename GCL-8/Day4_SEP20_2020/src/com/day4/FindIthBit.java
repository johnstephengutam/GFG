package com.day4;

public class FindIthBit {

	public static void main(String[] args) {
		int num = 8;
		int i = 4;
		//System.out.println((num >> i-1)%2);
		System.out.println(num & (1 << i));
	}

}
