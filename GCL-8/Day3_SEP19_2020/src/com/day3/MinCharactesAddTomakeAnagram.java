package com.day3;

public class MinCharactesAddTomakeAnagram {
	public static int toMakeS2AsAnagram(String str1, String str2){
		int[] freq1 = new int[26];
		int l1 = 0, r1 = str1.length(),l2 = 0,r2=str2.length();
		
		while(l1 < r1 ){
			freq1[str1.charAt(l1) - 'a']++;
				l1++;
		}
		while(l2 < r2 ){
			freq1[str2.charAt(l2) - 'a']--;
				l2++;
		}
		
		int ans = 0;
		for(int i = 0; i < freq1.length; i++){
			if(freq1[i] >= 0)
				ans = ans + freq1[i];
			else 
				ans = ans + Math.abs(freq1[i]);
		}
		return ans;
	}
	public static void main(String[] args) {
		String str1 = "abasd";
		String str2 = "abc";
		System.out.println(toMakeS2AsAnagram(str1,str2));
	}

}
