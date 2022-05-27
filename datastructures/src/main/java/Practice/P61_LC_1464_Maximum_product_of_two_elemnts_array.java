package Practice;

import java.util.Arrays;

import org.junit.Test;

public class P61_LC_1464_Maximum_product_of_two_elemnts_array {
	@Test
	public void testData() {
		int[] nums = {3,4,5,2};
		System.out.println(maximumProduct(nums));
	}

	private int maximumProduct(int[] nums) {
		// TODO Auto-generated method stub
		
		Arrays.sort(nums);
		
		int len = nums.length;
		
		int maxValue = (nums[len-2]-1) * (nums[len-1]-1);
		
		return maxValue;
		
	}

}
