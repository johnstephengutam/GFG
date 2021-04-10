package com.day3;

public class CheckIfS2isSubsequenceOfS1 {
	public static boolean subSequence_bruteforce(String str1, String str2){
		int r1 = str1.length()-1, r2 = str2.length()-1; 
		int l1 = 0, l2 = 0;
		if(str2.length() > str1.length())
			return false;
		while(l1 < r1 && l2 < r2){
			if(str2.charAt(l2) == str1.charAt(l1))
				l2++;
			l1++;
		}
		if(l2 == str2.length()-1)
			return true;
		return false;
	}
	public static void main(String[] args) {
		String str1 = "dhoni";
		String str2 = "doi";
		
		System.out.println(subSequence_bruteforce(str1,str2));
	}

}