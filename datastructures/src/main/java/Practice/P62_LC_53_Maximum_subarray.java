package Practice;

import org.junit.Test;

public class P62_LC_53_Maximum_subarray {


	@Test // +ve
	public void example1() {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		//Assert.assertEquals(true, Arrays.equals(squareAndSort(nums), new int[] {4, 9, 16, 16, 25}));
		System.out.println(MaxSubArray(nums));
	}


	private int MaxSubArray(int[] nums) {

		int maxSub =nums[0];
		int curSum=0;
		
		for(int i=0;i<nums.length;i++) {
			if(curSum<0) {
				curSum=0;
			}
			curSum = curSum +nums[i];
			maxSub=Math.max(maxSub,curSum);
		}

		
		return maxSub;
	}

	

}
