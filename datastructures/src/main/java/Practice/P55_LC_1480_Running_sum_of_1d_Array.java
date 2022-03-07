package Practice;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P55_LC_1480_Running_sum_of_1d_Array {
	@Test
	public void test1() {
	int[] nums= {1,2,3,4};
	
	System.out.println(Arrays.toString(SumOf1dArray(nums)));
	
}

private int[] SumOf1dArray(int[] nums) {
	// TODO Auto-generated method stub

for(int i=1;i<nums.length;i++) {
	nums[i] = nums[i] + nums[i-1];
}

return nums;
}}
