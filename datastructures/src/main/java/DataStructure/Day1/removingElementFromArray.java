package DataStructure.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class removingElementFromArray {
	
	// Given the integer array and the target
	//Remove the matching target from the array
	
	@Test
	public void testData1()
	{
		int[] arr = {1,2,3,5,6,7};
		int target = 2;
		removeData(arr,target);
			
	}
	
	@Test
	public void testData2()
	{
		int[] arr = {1,2,2,3,5,6,7,2};
		int target = 2;	
		removeData(arr,target);
	}
	
	@Test
	public void testData3()
	{
		int[] arr = {1,3,5,6,7};
		int target = 2;	
		removeData(arr,target);
	}
	
	public void removeData(int arr[],int target)
	{
		int count=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]!=target)
				count++;		
		}	
		int result[] = new int[count];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=target) {
				result[j]=arr[i];
				j++;
			}
		}
		
		
	}
	
	/*
	 * public int[] removeElement(int[] nums, int target) {

		if(nums.length == 0) return nums; // negative cases first !!

		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) { // traverse and add only if the element not matching
			if(nums[i] != target) lst.add(nums[i]);
		}

		int[] output = new int[lst.size()];
		for (int i = 0; i < lst.size(); i++) {
			output[i] = lst.get(i);
		}

	    return output;
	}
	 
	 */

}
