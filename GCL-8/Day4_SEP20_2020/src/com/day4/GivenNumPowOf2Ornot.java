package com.day4;

public class GivenNumPowOf2Ornot {
	public static boolean powOf2OrNot(int num){
		if((num & num-1) == 0 )
			return true;
		return false;
	}
	public static boolean powOf2(int num){
		for(int  i = 1; i <= num; i = i * 2)
			if( i == num)
				return true;
		return false;
	}
	public static void main(String[] args) {
		int num = 9;
		//System.out.println(powOf2OrNot(num));
		System.out.println(powOf2(num));
	}

}
