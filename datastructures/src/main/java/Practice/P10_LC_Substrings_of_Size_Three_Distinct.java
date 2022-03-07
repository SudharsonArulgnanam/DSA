package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class P10_LC_Substrings_of_Size_Three_Distinct {

	/*
	 * Problem Statement:
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
	 *  
	 * 1) Did I understand the problem? Yes or No !! - Yes 
	 * -> If No, Ask the person to provide more detail with example(s) 
	 * -> If yes, go to next step !!
	 * 
	 * What is the input(s)? - String
	 * What is the expected output? - int 
	 * Do I have constraints to solve the problem? - Slinding Window
	 *
	 *
	 * 2) Test Data Set
	 *  Minimum of 3 data set !!
	 *   
	 *  Positive : xyzzaz
	 *   
	 *  Edge     : 
	 *  
	 *  Negative : aaa
	 *
	 */
	
	
	@Test
	public void test1() {
		System.out.println(countGoodSubstrings("xyzzaz"));
	}
	
	@Test
	public void test2() {
		System.out.println(countGoodSubstrings("aababcabc"));
	}
	
	@Test
	public void test3() {
		System.out.println(countGoodSubstrings("aaa"));
	}
	
    public int countGoodSubstrings(String s) {
    	int count = 0;
    	for(int i = 0; i <=s.length()-3;i++) {
    		String subStr = s.substring(i,i+3);
    		if(subStr.charAt(0)!=subStr.charAt(1) &&
    				subStr.charAt(1) != subStr.charAt(2) &&
    				subStr.charAt(0) != subStr.charAt(2)) {
    			count++;
    		}
    	}	
    	return count;
    }
    
    public int countGoodSubstringsAlt(String subStr) {
        int count = 0;
    	for(int i = 0; i <=subStr.length()-3;i++) {
    		if(subStr.charAt(i)!=subStr.charAt(i+1) && subStr.charAt(i+1) != subStr.charAt(i+2) && subStr.charAt(i)!=subStr.charAt(i+2)) {
    			count++;
    		}
    	}
    	return count;
    }
    
 /*   private int countGoodSubstrings(String string) {
    	// TODO Auto-generated method stub
    	
    	int left=0,right=0,count=0;
    	
    	Map<Character,Integer>  map = new HashMap<Character,Integer>();
    	
    	char[] ch = string.toCharArray();
    	
    	for(int i=0;i<3;i++) {
    		map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
    	}
    	if(map.size()==3) count++;
    	
    	for(int i=3;i<ch.length;i++) {
    		
    		if(map.get(ch[i-3])==1) {
    			map.remove(ch[i-3]);
    		}else {
    			map.put(ch[i-3], map.get(ch[i-3])-1);
    		}
    	//	System.out.println(map.size());
    		map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
    		if(map.size()==3) count++;
    	}
    	return count;
    	}*/

}







