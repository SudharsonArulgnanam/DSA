package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class duplicateNumber {@Test
	public void example1() {
	int[] nums = {1,7,4,3,1,2,1,2,1}; // 1 1 1 1 2 3 4 5 7
	duplicatenumber(nums, k);
}

private void duplicatenumber(int[] nums) {
	// TODO Auto-generated method stub
	
	Set<Integer>  set = new HashSet<Integer>();
	
	Arrays.sort(nums);
	int left=0, right=1;
	
	while(right<nums.length) {
		
		if(nums[left]==nums[right]) {
			set.add(nums[left++]);
			right++;
		}else {
			left++;
			right++;
		}
	}
	
	System.out.println(set);
}}
