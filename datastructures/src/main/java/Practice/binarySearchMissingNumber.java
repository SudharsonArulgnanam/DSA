package Practice;

import org.junit.Test;

public class binarySearchMissingNumber {
	@Test

	public void example1() {
		int[] nums = { 1,4,5 };
		int k = 4;
		
		System.out.println(binarySearch(nums, k));
	}

	private int binarySearch(int[] nums, int k) {
		// TODO Auto-generated method stub

		int low = 0, high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] - mid <= k)
				low = mid + 1;
			else
				high = mid - 1 ;
		}

		return low + k;
	/*	int left=0;
		for(int right=1;right<Integer.MAX_VALUE;right++)
		{
			if(nums[left]!=right) 
				k--;
			else {
				left++;
				if(left==nums.length)
					left--;
			}
			if(k==0) System.out.println(right);
		}return left;*/
	}



}
