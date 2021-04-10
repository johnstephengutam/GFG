package Contest2;


class XOR {
    public static void spiralMatrix(int[][] arr, int m,int n){
    	int rowStart = 0;
    	int colStart = 0;
    	int rowEnd = m-1;
    	int colEnd = n-1;
    	while(rowStart <= rowEnd && colStart <= colEnd){
    		int i = rowStart; 
    		int j = colStart;
    		for(j = colStart; j <= colEnd; j++){
    			System.out.print(arr[i][j]+" ");
    		}
    		for(i = rowStart+1,j--;i <= rowEnd; i++){
    			System.out.print(arr[i][j]+" ");
    		}
    		for(j = colEnd-1,i--; j >= colStart; j--){
    			System.out.print(arr[i][j]+" ");
    		}
    		for(i = rowEnd-1,j++; i >= rowStart+1; i--){
    			System.out.print(arr[i][j]+" ");
    		}
    		rowStart++;
    		rowEnd--;
    		colStart++;
    		colEnd--;
    	}
    	
    }
    public static void main(String[] args){
    	int[][] arr = {{1,2,3,4},
    				   {5,6,7,8},
    				   {9,10,11,12},
    				   {13,14,15,16}};
    	spiralMatrix(arr,4,4);
    }
}