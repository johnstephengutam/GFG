package com.starwar;

public class TestArray {

	   public static void main(String[] args) {
	      String str = "\"print\"";
	      System.out.println(str);
	   }
	   
	   public static void printArray(int[] array) {
		   for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		   }
		}
	}