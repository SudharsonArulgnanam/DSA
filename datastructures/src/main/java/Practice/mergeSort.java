package Practice;

import java.util.Arrays;

import org.junit.Test;

public class mergeSort {
	@Test // positive
	public void example1() {
	int[] nums1 = {1,2,4};
	int[] nums2 = {2,3,1, 2, 5};
	mergeArray(nums1, nums2);
}


/*
 * Time complexity: O(n+m)
 * Space complexity: O(n+m)
 */
private void mergeArray(int[] nums1, int[] nums2) {

	int m = nums1.length;
	int n = nums2.length;
	int[] output = new int[m+n];
	
	int k=0,j=0,i=0;
	while(i<m || j <n)
	{
	
		if((nums1[i]<nums2[j]))
		{
			output[k++]=nums1[i++];
			
		}else if(i==m)
		{
			output[k++]=nums2[j++];
		}
		{
			output[k++]=nums2[j++];
		}
	
	}
	System.out.println(Arrays.toString(output));
}
}
