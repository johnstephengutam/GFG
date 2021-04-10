package Contest1;

import java.util.Scanner;

public class Problem_1 {
	public static long FindMaxSum(long[] arr, int n)
    {
		long incl_prev;
		long excl_pre;
		long incl_curr;
		long excl_curr;
		
		long max_sum = 0;
		long curr_max = arr[0];
       for(int i = 0; i < n; i++){
    	   curr_max = Math.max(arr[i], curr_max);
    	   max_sum = curr_max;
	    	   for(int j = i+2; j< n; j++){
	    		   curr_max = Math.max(arr[i], arr[i]+arr[j]);
	    		   max_sum = Math.max(curr_max, max_sum);
	    	   }
    	   
       }
       return max_sum;
       
      /* The complete Approach is as follows

       Store, arr[0] in incl_prev , and keep excl_prev = 0, and start iterating from index 1.
       (The current element maximum sums will be processed in the loop)
       Equate excl_curr to maximum of incl_prev and excl_prev.
       This is because as we are not using curr element for maximum sum, then we can add the previous element in the sum. But as the sum excluding the previous element may be larger than the sum including previous element, that is why we will take max of both.
       Now Equate incl_curr to sum of curr element and excl_prev, as we cannot include previous element in incl_curr.
       Use and update these values accordingly, and loop through complete array.
       Finally, after exiting the loop return the max of incl_curr and excl_curr.
       This is the Solution.*/
    }

	public static void main(String[] args) {
		/*long[] arr = {1,20,3};
		System.out.println(FindMaxSum(arr,arr.length));*/
		System.out.println(toggleTheMiddle(4));
	}
	
	public static int toggleTheMiddle(int n)
    {
		int k = countBits(n);
		//n is of bits
		if(k%2 == 0){ //even - toggle 2 bits
			n = n ^ (1<<((k/2)-1)) ^ (1<<((k/2)));
		}
			
		else {// odd
			n = n ^ (1<<(k/2));
			
		}
        return n;
    }
	static int countBits(int n) 
    { 
        int count = 0; 
        while (n != 0) 
        { 
            count++; 
            n >>= 1; 
        } 
          
        return count; 
    } 
	/*We need to to maintain 2 variables naming, incl_prev and excl_prev, where

	incl_prev = Maximum sum including prev element
	excl_prev = Maximum sum excluding prev element
	Also, we will keep variables incl_curr and excl_curr to store the maximum sum , either including or excluding
	the current element.

	The complete approach is in next hint.
	*/
	public static void booleanMatrix(int mat[][],int m,int n)
    {
		
		/*int mat[][] = {
			      {0, 0, 0}, 
			       
			};*/
		booleanMatrix(mat,1,3);
        
       for(int i = 0; i < m;i++){
           for(int j = 0; j < n; j++){
               if(mat[i][j] == 1){
                   for(int k = 0; k < n; k++){
                        mat[i][k] = 1;   
                   }
               }
           }
       }
       
       for(int i = 0; i < m;i++){
           for(int j = 0; j < n; j++){
        	   System.out.print(mat[i][j]+" ");
           }
           System.out.println();
       }
    }
}
