package com.job;

import java.util.Scanner;

public class Compress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		int count = 1;
		for(int i = 0; i < len && i+1 < len; i++){
			if(str.charAt(i) == str.charAt(i+1)){
				count++;
			}
			else{
				System.out.print(str.charAt(i)+""+count);
				count = 1;
			}
		}
		
		System.out.print(str.charAt(len-1)+""+count++);
		count++;
		
		
	}

}
