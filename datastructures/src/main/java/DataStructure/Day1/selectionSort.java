package DataStructure.Day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class selectionSort {
	@Test
	public void example1() {
		int[] nums = { 1, 8, 11, 6, 5, 3 };

		Assert.assertEquals(true, Arrays.equals(bsort(nums), new int[] { 1, 3, 5, 6, 8, 11 }));
		// bsort(nums);
	}

	@Test
	public void example2() {
		int[] nums = { 1, -20, 11, 10, 5, 30 };
		Assert.assertEquals(true, Arrays.equals(bsort(nums), new int[] { -20, 1, 5, 10, 11, 30 }));
	}

	@Test
	public void example3() {
		int[] nums = { 0, 0, 0, 1 };
		Assert.assertEquals(true, Arrays.equals(bsort(nums), new int[] { 0, 0, 0, 1 }));
	}

	public int[] bsort(int[] nums) {
		int temp = 0;
	int min =nums[0];
		for (int i = 0; i < nums.length-1; i++) {
			for(int j=i+1;j<nums.length;j++)
			{
			 min =Math.min(min,nums[i]);	
		}
		}
		return nums;
	}
}
