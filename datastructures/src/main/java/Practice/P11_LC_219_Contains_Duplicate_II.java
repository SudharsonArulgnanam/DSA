package Practice;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P11_LC_219_Contains_Duplicate_II {

	/*
	 * Problem Statement:
	 *  https://leetcode.com/problems/contains-duplicate-ii/
	 *
	 *  
	 * 1) Did I understand the problem? Yes or No !! - Yes 
	 * -> If No, Ask the person to provide more detail with example(s) 
	 * -> If yes, go to next step !!
	 * 
	 * What is the input(s)? - int[]
	 * What is the expected output? - double 
	 * Do I have constraints to solve the problem? - Slinding Window
	 *
	 *
	 * 2) Test Data Set
	 *  Minimum of 3 data set !!
	 *   
	 *  Positive : [0,1,2,3,2,5]  k = 3
	 *   
	 *  Edge     : [99,99] , k = 2
	 *  
	 *  Negative : [0,1,2,3,4,5], k = 0
	 *
	 */
	
	
	@Test
	public void test1() {
		int[] nums = {1,0,1,1};
		int k = 1;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
	
	//@Test
	public void test2() {
		int[] nums = {99,99};
		int k = 2;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
	
	//@Test
	public void test3() {
		int[] nums = {0,1,2,3,4,5};
		int k = 0;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
  
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> numbers = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(numbers.containsKey(nums[i]) && i-numbers.get(nums[i]) <= k) return true;
            numbers.put(nums[i],i);
        }
        return false;
    }
    
    /*
     *   public static boolean searchRange(int[] nums, int target) {
        
		// TODO Auto-generated method stub
		int left=0,right=0,start=0,end=0,i=0,j=0,diff=0;
		while(left<nums.length) {
			i++;
		while(right<nums.length) {
			
			if(nums[left]==nums[right] && j<1) {
				start=left;
				j++;
			}else if(j<1) {
				left++;
			}
			if(nums[left]==nums[right]) {
				end=right++;
			}else right++;
			
		}
		
		diff = Math.abs(start-end);
		if(diff<=target) return true;
		left=i;
		right=i;
		}
		
		return false;
        
    }
}
     * 
     * 
     * 
     */
     
}
/*

private boolean containsNearbyDuplicate(int[] nums, int k) {
// TODO Auto-generated method stub

int left=0,right=1;

while(left<nums.length) {
	while(right<nums.length) {
		if(nums[left]==nums[right]) {
			int dif = Math.abs(right-left);
			if(dif<=k) return true;
			}
		right++;
	}left++;
	right=left+1;
}
return false;
}}*/