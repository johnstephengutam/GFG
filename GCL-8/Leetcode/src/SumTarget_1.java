import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumTarget_1 {
	/* public static int[] twoSum(int[] nums, int target) {
	        int ans[] = new int [2];
	        for(int i = 0; i < nums.length; i++){
	            for(int j = i+1; j < nums.length; j++){
	                if(nums[i]+nums[j] == target){
	                    ans[0] = i;
	                    ans[1] = j;
	                }
	            }
	        }
	        
	        //throw new IllegalArgumentException("No two sum solution");
	        return ans;
	    }*/
	 
	 /*public static int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        map.put(nums[i],i);
		    }
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsValue(complement) && map.get(complement) != i) {
		            return new int[] { i, map.get(complement) }; 
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");
	 }*/
	 
	
		 public static int[] twoSum(int[] nums, int target) {
		        int[] result = new int[2];
			         Map<Integer, Integer> map = new HashMap<>();
				    for (int i = 0; i < nums.length; i++) {
				    	int complement = target - nums[i];
				        if (map.containsKey(complement) && map.get(complement) != i) {
				            result[0] = i;
		                    result[1] = map.get(complement);
		                    return result;
				        }
				        map.put(nums[i],i);
				    }
				    return result;
			    }
	 
	 
	public static void main(String[] args) {
		int arr[] ={2,7,11,15};
		int target = 9;
		int[] ans = new int[2];
		ans = twoSum(arr, target);
		System.out.println(ans[0]+" "+ans[1]);
	}

}
