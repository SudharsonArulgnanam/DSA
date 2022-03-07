package Practice;

import org.junit.Test;

public class Longesttones {
	@Test
	public void example1() {
		int[] nums = {1,1,1,0,0,0,1,0,1,0,1,1,1,1,1,1};
		longestOnes(nums);
	}
		
		//Finding Largest ones
	/*	private void longestOnes(int[] nums) {
			int length=0,max=0;
		for(int i=0;i<nums.length;i++)
		{
			
			if(nums[i]==1)
			{
				length++;
			}else length=0;
			
			max = Math.max(max, length);
			
		}
		
		System.out.println(max);
		}*/
	//find the Smallest one sequences  		int[] nums = {1,1,1,0,0,0,1,1,1,0,1,1,1,1,1,1};
	private void longestOnes(int[] nums) {
		int length=0,min=nums.length,minLength=nums.length;
	for(int i=0;i<nums.length;i++)
	{
		
		if(nums[i]==1)
		{
			length++;
		}else if(nums[i-1]==1 && nums[i]==0) {
			minLength = length;
			length=0;
		}
			
		min = Math.min(min, minLength);
	}
	
	System.out.println(min);
	}

}
