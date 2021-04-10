package com.day4;

public class ConvertDecimalToBinay {
	static int N = 10;
	static int[] ar = new int[N];
	static int top = -1;
	public static void display(){
		System.out.print("Stack ");
		for(int i = 0; i <= top; i++){
			System.out.print(ar[i]+" ");
		}
	}
	public static void push(int i){
		++top;
		ar[top] = i;
		//display();
	}
	
	public static int pop(){
		int topElement = ar[top];
		top--;
		//display();
		return topElement;
	}
	public static void converDtoB(int num){	
		while(num > 0){
			push(num%2);
			num = num/2;
		}
	}
	public static void main(String[] args) {
		int num = 8;
		converDtoB(num);
		
		for(int i = top; i >= 0; i--){
			System.out.print(pop());
		}
	}
}
