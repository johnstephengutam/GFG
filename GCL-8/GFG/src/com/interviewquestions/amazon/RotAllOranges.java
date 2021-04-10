package com.interviewquestions.amazon;

public class RotAllOranges {
	static int m = 3;
	static int n = 5;
	public static boolean is_safe(int i,int j){
		if(i >= 0 && i < m && j >= 0 && j < n){
			return true;
		}
		return false;
	}
	public static int rotAllOranges(int[][] arr, int m,int n){
		int k = 0;
		int l = 0;
		int sum = 0;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(arr[i][j] == 2 ){
					if(is_safe(i,j+1) && arr[i][j+1] == 1)
						arr[i][j+1] =2;
					if(is_safe(i,j-1) && arr[i][j-1] == 1)
						arr[i][j-1] =2;
					if(is_safe(i-1,j) && arr[i-1][j] == 1)
						arr[i-1][j] =2;
					if(is_safe(i+1,j) && arr[i+1][j] == 1)
						arr[i+1][j] =2;
				}
			}
			
		}
		
		for(k = 0; k < m; k++){
			for(l = 0; l < n; l++){
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
	    }
		
		for(k = 0; k < m; k++){
			for(l = 0; l < n; l++){
				if(arr[k][l] == 1)
					return -1;
			}
	    }
		
		
		return 2;	
	}
	public static void main(String[] args) {
		int arr[][] = {{2,1,0,2,1},
						{0,0,1,2,1},
						{1,0,0,2,1}};
		
		System.out.println(rotAllOranges(arr, 3, 5));

	}

}
