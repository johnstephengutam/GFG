package com.day2;

public class ReverseArray {
	//Two pointers approach - O(N)
	public static void reverse(int[] arr){
		int s = 0;
		int l = arr.length - 1;
		while(s < l){
			int tmp = arr[s];
			arr[s] = arr[l];
			arr[l] = tmp;
			s++;
			l--;
		}
		for(int i = 0; i < arr.length; i++)
		System.out.print(arr[i]+" ");
	}
	
	//Rotate array by D positions - TC:O(N), SC:O(N)
	public static void rotateArrayByD(int[] arr,int d){
		int n = arr.length;
		int[] tmp = new int[n];
		
		int k = n-d;
		for(int i = 0; i <= d-1; i++){ //O(N)
				tmp[k] = arr[i];
				k++;
		}
		k = 0;
		for(int i = d; i < n; i++){ //O(N-d)
			tmp[k] = arr[i];
			k++;
		}
		for(int i =0; i < n; i++){ //O(N)
			System.out.print(tmp[i]+" ");
		}
	}
	
	//Rotate array by D positions = O(2N) ~ O(N)
	public static void rotateArrayByD_optimize(int[] arr,int d,int n){
		if(d < n){
			reverse(arr,0, d-1);//O(d)
			reverse(arr,d,n-1);//O(N-d)
			reverse(arr,0,n-1);//O(N)
		}
	}
	
	public static void reverse(int[] arr, int s, int l){
		for(int i = 0; i < arr.length; i++){
			if (s < l){
				int temp = arr[l];
				arr[l] = arr[s];
				arr[s] = temp;
				s++;
				l--;
			}
		}
	}
	
	public static void main(String[] args) {
		int d = 2;
		int arr[] = {1,4,5,2,3,9,8};
		int n = arr.length;
		rotateArrayByD_optimize(arr, d,n);
		
		for(int i =0; i < n; i++){ //O(N)
			System.out.print(arr[i]+" ");
		}
	}

}
