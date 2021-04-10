package com.day7;

import java.util.Stack;

public class EvaluationOfPostfix {
	static int evaluation(String str){
		int ans = 0;
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i); 
			if(Character.isLetterOrDigit(c)){
				st.push((int) c -'0');
			}else{
				int val1 = st.pop();
				int val2 = st.pop();
				
				switch(c){
				case '+':
					st.push(val1+val2);
					break;
				case '-':
					st.push(val1-val2);
					break;
				case '*':
					st.push(val1*val2);
					break;
				case '/':
					st.push(val1/val2);
					break;
				}
			}
		}
		return st.pop();
	}
	public static void main(String[] args) {
		String str = "325*+2+";
		System.out.println(evaluation(str));
	}

}
