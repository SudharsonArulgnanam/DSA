package Practice;

import java.util.Arrays;

import org.junit.Test;

public class leftShift {
	//Moves Zero to Left

	@Test
	public void example1() {
		int[] nums = {1,0,11,0,5,0};
		moveZeroesRight(nums);
	}

//	@Test
	public void example2() {
		int[] nums = {1,20,11,10,5,30};
		moveZeroesRight(nums);
	}

	//@Test
	public void example3() {
		int[] nums = {0,0,0,1};
		moveZeroesRight(nums);
	}

	private void moveZeroesRight(int[] nums) {
		int n=2;
		
		//left shift or left rotation
		  for(int i =0; i<n;i++) { 
		  int temp = nums[0]; 
		  int left=0, right=1;
		  while(right<nums.length) 
		  { 
		  nums[left++] = nums[right++]; 
		  } 
		  nums[left]=temp;
		  
		  }
		  System.out.println(Arrays.toString(nums));
	}
		
		/*for(int i =0; i<n;i++)
		{
			int temp = nums[nums.length-1];
			int left=nums.length-2, right=nums.length-1;
		while(left>=0) {
			nums[right--] = nums[left--];
		}
		nums[right]=temp;
		
	}
		System.out.println(Arrays.toString(nums));
	}*/
}
