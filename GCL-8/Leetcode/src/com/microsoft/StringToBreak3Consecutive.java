package com.microsoft;

public class StringToBreak3Consecutive {
	public static int break3(String str){
		int moves = 0;
		for(int i = 0; i < str.length(); i++){
			int consecutivelength = 1;
			for(;i+1 < str.length() && str.charAt(i) == str.charAt(i+1);i++)
				consecutivelength += 1;
			moves += consecutivelength/3;
		}
		return moves;
	}
	public static void main(String[] args) {
		String str = "baaabbaabbba";
		System.out.println(break3(str));
	}

}
