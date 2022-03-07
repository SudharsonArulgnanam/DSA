package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class uniqueElemntInArray {
	

	@Test // positive
	public void example1() {
		int[] nums= {1,2,2,4,3,3,5};
		
		SingleElement(nums);
	}

	private void SingleElement(int[] nums) {
		
		int left=0,right=1;
		
		List<Integer> lst = new ArrayList<Integer>();
		
		while(right<nums.length)
		{
			if(nums[left]!=nums[right]) {
				lst.add(nums[left]);
			}
			left++;
			right++;
		}
		
		System.out.println(lst);
	}


}
