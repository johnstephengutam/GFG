package com.starwar;

import java.util.ArrayList;

public  class Star {
	int shape;
	int lighting;
	static int all = 10;
	final int MAX = 100;
	int arr1[] = new int[100];
	

	
	
	Star(int val){
		shape = 10;
	}
	
	//OVerloading
	void rocket(){
		
		System.out.println("Will go by Rocket");
	}
	
	void rocket(int ht, int brth){
		System.out.println("Will go by Rocket");
	}
	
	void gym(){
		System.out.println("Will go by dumbell");
	}
}

interface Moon {
	int x = 1;
	
	void method1();
}

interface Satellite {
int y = 1;
	
	void method2();
}


 class Sun implements Satellite, Moon {

	Sun(int val) {
		//super(val);
		// TODO Auto-generated constructor stub
	}
	//Overriding
	void gym(int a){
		System.out.println("Will go by Speed boat");
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}


class StarUsage{
	public static void main(String[] args){
		Star str1 = new Star(10);
		str1.rocket();
		Star str2 = new Star(20);
		str2.rocket();
		Star str3 = new Star(30);
		str3.rocket();
		
		System.out.println(Star.all++);
		
		Sun sun = new Sun(10);
		sun.rocket();
		
		
		ArrayList arr2 = new ArrayList();
		arr2.add(20);
		arr2.add(10);
	}
}