package Practice;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P69_LC_5_Longest_Palindromic_Substring {
	

	
	// not the best solutions failing 50% testcase in leetcode
	@Test
	public void example1() {
		String s = "cbbd";
		longestSubString(s);
		
	}
	
		
	
	private void longestSubString(String s) {
		
		int left=0,right=0,max=0;
		
		Map<Integer,String>  map = new HashMap<Integer,String>();
		
		
		while(left<s.length()) {
			String str="";
			String str1="";
		while(right<s.length()) {
			str = str + s.charAt(right);
			str1= s.charAt(right) +str1;
			if(str.equals(str1)) {
				System.out.println(str);
				max=Math.max(max,str.length());
				map.put(str.length(),str);
			}
			right++;
		}left++;
		right=left;
		}
		
		System.out.println(map.get(max));
	
	}
	
	/*
	 * 
	 * 
	 * 	int left = 0, right = 0, maxCount = 0;
		String str="";
		Set<Character> set = new LinkedHashSet<Character>();
		Map<Integer,String>  map = new HashMap<Integer,String>(); //p w w k e w  abcabcbb
		
		while(right < s.length()) {
			if(set.add(s.charAt(right++))) {
				maxCount = Math.max(maxCount, set.size());
				//System.out.println(set);
				 for(char c: set) {
                	 str= str+c;
                 }
				map.put(set.size(), str);
				//System.out.println(map);
			} else {
				right = ++left;
				set.clear();
			}
			str="";
		}
		//System.out.println(map.get(maxCount));
		System.out.println(maxCount);
		return map.get(maxCount);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	




}
