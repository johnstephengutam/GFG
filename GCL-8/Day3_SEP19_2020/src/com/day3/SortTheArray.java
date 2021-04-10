package com.day3;

import java.util.Arrays;

class SortTheArray {
	//this wont work
	/*public static void sort(String str){
		for(int i = 0; i < str.length(); i++){
			for(int j = i+1; j < str.length();i++){
				if(str.charAt(i) > str.charAt(j)){
					char ch = str.charAt(i);
					str.charAt(i) = str.charAt(j);
					str.charAt(j) = temp;
				}
			}
		}
		
	}*/
	public static void main(String[] args) {
		String str = "ewrwe";
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		System.out.println(temp);
	}
	
	private SortTheArray(){
		
	}

}
