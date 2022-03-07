package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class rotateArrayParatially {
	@Test
	public void example1() {
	int[] nums = {4,6,8,11,10,18};
	int k = 3;
	// 8,6,4,11,10,18
	rotateKElements(nums, k);
}

private void rotateKElements(int[] nums, int k) {
	// TODO Auto-generated method stub
	
	Set<Integer>  set = new HashSet<Integer>();
	int n=1;
	
	for(int i =0; i<n;i++) { 
	int left=0, right=1;
	
	int temp = nums[0];
	
	while(right<k) {
			nums[left++]=nums[right++];
		}
	
	nums[left]=temp;
	
}
	System.out.println(Arrays.toString(nums));
}
}
