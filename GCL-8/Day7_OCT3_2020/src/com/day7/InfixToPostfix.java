package com.day7;

import java.util.Stack;

public class InfixToPostfix {
	static Stack<Character> st = new Stack<Character>();
	
	 static int Prec(char ch) 
	    { 
	        switch (ch) 
	        { 
	        case '+': 
	        case '-': 
	            return 1; 
	       
	        case '*': 
	        case '/': 
	            return 2; 
	       
	        case '^': 
	            return 3; 
	        } 
	        return -1; 
	    } 
	/*public static void postfix(String str){
		int n = str.length();
		int i = 0;
		while(i < n){
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'b'||str.charAt(i) == 'c'||str.charAt(i) == 'd'){
				System.out.print(str.charAt(i));
			}
			else{
				if(str.charAt(i) == '(')
					st.add(str.charAt(i));
				else if((str.charAt(i) == '+' || str.charAt(i) == '-') && !st.isEmpty()){
					while(Precedence((char)st.peek()) <= Precedence(str.charAt(i))){
						char ch = (char) st.pop();
						if(ch != '(' || ch != ')')
							System.out.println(ch);
					}
				}
				else if((str.charAt(i) == '*' || str.charAt(i) == '/') && !st.isEmpty()){
					while(Precedence((char)st.peek()) <= Precedence(str.charAt(i))){
						char ch = (char) st.pop();
						if(ch != '(' || ch != ')')
							System.out.println(ch);
					}
				}
				else{
					while(st.peek() != '('){
						System.out.println(st.pop());
					}
					st.pop();
				}
			}
			i++;
		}
		while(!st.isEmpty())
			System.out.println(st.pop());
	}*/
	 static String infixToPostfix(String exp) 
	    { 
	        // initializing empty String for result 
	        String result = new String(""); 
	          
	        // initializing empty stack 
	        Stack<Character> stack = new Stack<>(); 
	          
	        for (int i = 0; i<exp.length(); ++i) 
	        { 
	            char c = exp.charAt(i); 
	              
	             // If the scanned character is an operand, add it to output. 
	            if (Character.isLetterOrDigit(c)) 
	                result += c; 
	               
	            // If the scanned character is an '(', push it to the stack. 
	            else if (c == '(') 
	                stack.push(c); 
	              
	            //  If the scanned character is an ')', pop and output from the stack  
	            // until an '(' is encountered. 
	            else if (c == ')') 
	            { 
	                while (!stack.isEmpty() && stack.peek() != '(') 
	                    result += stack.pop(); 
	                  
	                if (!stack.isEmpty() && stack.peek() != '(') 
	                    return "Invalid Expression"; // invalid expression                 
	                else
	                    stack.pop(); 
	            } 
	            else // an operator is encountered 
	            { 
	                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
	                    if(stack.peek() == '(') 
	                        return "Invalid Expression"; 
	                    result += stack.pop(); 
	             } 
	                stack.push(c); 
	            } 
	       
	        } 
	       
	        // pop all the operators from the stack 
	        while (!stack.isEmpty()){ 
	            if(stack.peek() == '(') 
	                return "Invalid Expression"; 
	            result += stack.pop(); 
	         } 
	        return result; 
	    } 
	
	public static void main(String[] args) {
		String str = "a+(b*c)+d";
		System.out.println(infixToPostfix(str));
	}
}
