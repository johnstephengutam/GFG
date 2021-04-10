package com.day3;

import java.util.Arrays;

public class Anagram {
	//Implementation by 2 arrays
	public static boolean isAnagram_sort(String str1, String str2){
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		int l1 = 0, r1 = str1.length(),l2 = 0,r2=str2.length();
		if(r1 != r2)
			return false;
		while(l1 < r1 && l2 < r2){
			freq1[str1.charAt(l1) - 'a']++;
			l1++;
			freq2[str2.charAt(l2) - 'a']++;
			l2++;
		}
		for(int i =0; i < freq1.length; i++){
			if(freq1[i] != freq2[i])
				return false;
		}
		return true;
	}
	//Implementation by 1 array
	public static boolean isAnagram_SingleArray(String str1, String str2){
		int[] freq1 = new int[26];
		
		int l1 = 0, r1 = str1.length(),l2 = 0,r2=str2.length();
		if(r1 != r2)
			return false;
		while(l1 < r1 ){
			freq1[str1.charAt(l1) - 'a']++;
				l1++;
		}
		while(l2 < r2 ){
			freq1[str1.charAt(l2) - 'a']--;
				l2++;
		}
		for(int i =0; i < freq1.length; i++){
			if(freq1[i] != 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(isAnagram_sort(str1,str2));
	}

}
