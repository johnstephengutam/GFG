package com.day6;

import java.util.Stack;

public class IndexOfNextGreaterElement {
	static Stack<Integer> st = new Stack<Integer>();
	
	/*//Bruteforce- O(N*N)
	public static int[] greaterElement(int[] arr){
		int ans[] = new int[5];
		int n = arr.length;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(arr[i] < arr[j]){
					ans[i] = j;
					break;
				}
				if(j == n-1)
					ans[i] = -1;
			}
		}
		ans[n-1] = -1;
		return ans;
	}*/
	
	//Using Stack - Efficient solution
	public static int[] greaterElementUsingStack(int[] arr){
		int ans[] = new int[5];
		int n = arr.length;
		st.add(0);
		for(int i = 1; i < n; i++){
			if(arr[i] < arr[st.peek()]){
				st.push(i);
			}
			if(arr[i] > arr[st.peek()]){
				int top = st.peek();
				ans[top] = i;
				st.pop();
				while(!st.isEmpty() && arr[i] > arr[st.peek()]){
					int nxttop = st.peek();
					ans[nxttop] = i;
					st.pop();
				}
				st.push(i);
			}
		}
		while(!st.isEmpty()){
			int peek = st.pop();
			ans[peek] = -1;
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {10, 5, 12, 9, 11};
		int ans[] = greaterElementUsingStack(arr);
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(ans[i]+" ");
		}
	}

}
