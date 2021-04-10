package com.day6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueOperations {
	static Deque<Integer> dq = new LinkedList<Integer>();
	
	//Bruteforce - O(N*N)
	public static void maxElement(int[] arr, int k){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			int ans = 0;
			for(int j = i; j < i+k && i+k-1 < n; j++){
				ans = Math.max(ans, arr[j]);
			}
			if(i+k-1 < n)
			System.out.println(ans);
		}
	}
	
	/*//Optimize - O(N) - NOT WORKING
	public static void maxElementOptimize(int[] arr, int k){
		int n = arr.length;
		int l = 0;
		int r = k;
		int i = 0;
		while(i < n && l < r && l < n && r < n){
			while(!dq.isEmpty() && i != r-1){
				int x = dq.peekLast();
				if(arr[i] > arr[x]){
					
					dq.pollLast();
				}
			}
			dq.addLast(i);
			if(i == r-1){
				l++;
				r++;
				i=l-1;
				System.out.println(arr[dq.pollFirst()]);
			}
			i++;
		}
	}*/
	
	//Optimize - O(N) 
	public static void maxElementOptimize(int[] arr, int k,int n)
    {
        // Create a Double Ended Queue, Qi that will store indexes of array elements
        // The queue will store indexes of useful elements in every window and it will
        // maintain decreasing order of values from front to rear in Qi, i.e.,
        // arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<Integer>();
 
        /* Process first k (or first window) elements of array */
        int i;
        for (i = 0; i < k; ++i) {
            // For every element, the previous smaller elements are useless so
            // remove them from Qi
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast(); // Remove from rear
 
            // Add new element at rear of queue
            Qi.addLast(i);
        }
 
        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
        for (; i < n; ++i) {
            // The element at the front of the queue is the largest element of
            // previous window, so print it
            System.out.print(arr[Qi.peek()] + " ");
 
            // Remove the elements which are out of this window
            while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
                Qi.removeFirst();
 
            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
 
            // Add current element at the rear of Qi
            Qi.addLast(i);
        }
 
        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,3,7,4,8};
		int k = 3;
		maxElementOptimize(arr,k,6);
	}

}
