package DataStructure.Day1;

import java.util.Arrays;

import org.junit.Test;

public class mergearray {

	@Test
	public void example1() {
		int[] nums = { 4,5,6};
		int[] nums2 = { 2,1,4,2};
		mergeTwoArray(nums, nums2);
	}

	private void mergeTwoArray(int[] nums, int[] nums2) {
		// TODO Auto-generated method stub

		int left = 0;
		int right = 0;
		int[] newArray = new int[nums.length + nums2.length];
		for (int i = 0; i < newArray.length; i++) {
			if (left < nums.length) {
				if (nums[left] <= nums2[right])newArray[i] = nums[left++];
				else newArray[i] = nums2[right++];
			} else newArray[i] = nums2[right++];
		}
		System.out.println(Arrays.toString(newArray));

	}

}
