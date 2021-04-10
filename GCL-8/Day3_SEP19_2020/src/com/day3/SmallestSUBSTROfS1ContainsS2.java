package com.day3;

//Similar to Sliding window concept
public class SmallestSUBSTROfS1ContainsS2 {
	public static String smallestSubStringOfS1(String str1, String str2){
		
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		int l1 = 0, r1 = str1.length(),l2 = 0,r2=str2.length();
		if(r1 != r2)
			return "";
		while(l1 < r1 && l2 < r2){
			freq2[str2.charAt(l2) - 'a']++;
			l2++;
		}
		
		int ans = 0;
		int start = 0, start_index = -1, min_len = Integer.MAX_VALUE; 
		
		//compare the pattern with s1 and count
		for(int i=0; i < str1.length(); i++){
			
			freq1[str1.charAt(i)]++; 
			
			if(freq1[str1.charAt(i)- 'a'] != 0 && freq1[str1.charAt(i)-'a'] == freq2[str2.charAt(i)-'a']){
				ans++;
			}
			if(ans == str2.length()){
				while ( freq1[str1.charAt(start)] > freq2[str1.charAt(start)] 
	                    || freq2[str1.charAt(start)] == 0) 
	                { 
	      
	                    if (freq2[str1.charAt(start)] > freq2[str1.charAt(start)]) 
	                        freq1[str1.charAt(start)]--; 
	                    start++; 
	                } 
	      
	                // update window size 
	                int len_window = i - start + 1; 
	                if (min_len > len_window) 
	                { 
	                    min_len = len_window; 
	                    start_index = start; 
	                } 
			}
		}
		
		
		// If no window found 
        if (start_index == -1) 
        { 
	        System.out.println("No such window exists"); 
	        return ""; 
        } 
      
        // Return substring starting from start_index 
        // and length min_len 
        return str1.substring(start_index, start_index + min_len);
		
		/*if(ans == str2.length()){
			System.out.println(i+" "+j);
		}*/
		//return ans;
	}

	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String str2 = "esg";
		System.out.println(smallestSubStringOfS1(str1,str2));
	}

}
