package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class removeDuplicate {
	@Test // positive
	public void example1() {
		Integer[] nums = {5,3,2,1,2,3};
		
		removeDuplicate(nums);
	}

	private void removeDuplicate(Integer[] nums) {
		// TODO Auto-generated method stub
		
	/*	Arrays.sort(nums);
		
		List<Integer> lst = new ArrayList<Integer>();

		// 1 2 2 3 3 5
		
		int left=0,right=1;
		
		while(right<nums.length)
		{
			if(nums[left]!=nums[right])
			{
				lst.add(nums[left]);
				
			}
			left++;
			right++;
		}
		
		lst.add(nums[nums.length-1]);
		
		
		System.out.println(lst);*/
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.addAll(Arrays.asList(nums));
		
		Integer[] nums1 = new Integer[set.size()];
		
		nums1 = set.toArray(nums1);
		
		System.out.println(Arrays.toString(nums1));
	}
		
	
}
