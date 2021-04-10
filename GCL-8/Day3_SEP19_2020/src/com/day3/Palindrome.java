package com.day3;

public class Palindrome {

	public static boolean palindrome(String str){
		int l = 0;
		int r = str.length();
		while(l < r){
			if(str.charAt(l) == str.charAt(r-1)){
				l++;
				r--;
			}
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "aba";
		boolean x = palindrome(str);
		if (x)
			System.out.println(x);
		else
			System.out.println(x);
	}

}
