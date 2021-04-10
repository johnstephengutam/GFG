package com.day3;

public class FrequencyOfAString {

	public static void main(String[] args) {
		String str = "ewrwe";
		int freq[] = new int[256];
		
		for(int i = 0; i < str.length(); i++){
			freq[str.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < freq.length; i++){
			if(freq[i] > 0)
				System.out.println((char)(i+'a') + " " + freq[i]);
		}
	}

}
