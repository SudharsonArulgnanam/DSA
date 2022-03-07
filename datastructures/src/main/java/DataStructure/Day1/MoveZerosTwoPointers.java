package DataStructure.Day1;
import java.util.Arrays;

import org.junit.Test;



public class MoveZerosTwoPointers {
	
	//Moves Zero to Left

	@Test
	public void example1() {
		int[] nums = {1,0,11,0,5,0};
		moveZeroesRight(nums);
	}

	@Test
	public void example2() {
		int[] nums = {1,20,11,10,5,30};
		moveZeroesRight(nums);
	}

	@Test
	public void example3() {
		int[] nums = {0,0,0,1};
		moveZeroesRight(nums);
	}

	private void moveZeroesRight(int[] nums) {
		int left = nums.length-1, right = nums.length-1;
		while(left >= 0) {
			if(nums[left] != 0 ) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right--] = temp;
			}
			left--;
		}
		System.out.println(Arrays.toString(nums));		
	}


}
