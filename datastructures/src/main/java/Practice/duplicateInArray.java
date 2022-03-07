package Practice;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;

public class duplicateInArray {





	/*
	 * Given a non-empty array of integers nums, every element appears twice except
	 * for one. Find that single one.
	 * 
	 */

	// @Test // +ve
	public void example1() {
		int[] nums = { 2, 2, 1 };
		// Assert.assertEquals(1, findSingleNumber(nums));
	}

	// @Test // edge
	public void example2() {
		int[] nums = { 1 };
		// Assert.assertEquals(1, findSingleNumber(nums));
	}

	@Test // negative
	public void example3() {
		int[] nums = { 4, 1, 2, 1, 2 };
		findSingleNumber(nums);
		// Assert.assertEquals(4, findSingleNumber(nums));
	}

	/*
	 * Brute force !! Psuedo code here:
	 * 
	 * 1) Sort the given input // 1,2,2 2) Compare the next element a) If it is
	 * same, move your index to the next element + 1 b) If it is different, return
	 * that element c) If it is the last element, return that element
	 * 
	 */
	private List<Integer> findSingleNumber(int[] nums) {

		List<Integer> list = new ArrayList<Integer>();

		
		for (int i = 0; i < nums.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					flag = true;
				}
			}
			if (flag == true) {
				list.add(nums[i]);
			}
		}
		System.out.println(list);
		return list;
	}
/*
 * private Object findSingleNumber(int[] nums) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int k=0;
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			if(entry.getValue()==1) k= entry.getKey();
		}
		return k;
		
		
	}
 * 
 * 
 * 
 * 
 */
}

