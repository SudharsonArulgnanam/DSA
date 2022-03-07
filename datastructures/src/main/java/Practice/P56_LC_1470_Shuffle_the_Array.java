package Practice;

import java.util.Arrays;

import org.junit.Test;

public class P56_LC_1470_Shuffle_the_Array {
	@Test
	public void test1() {
	int[] nums= {2,5,1,3,4,7};
	int n=3;
	
	System.out.println(Arrays.toString(SumOf1dArray(nums,n)));
	
}

private int[] SumOf1dArray(int[] nums,int n) {
	// TODO Auto-generated method stub
	
	int[] newNums = new int[nums.length];

	for(int i=0,j=n,k=0;i<n;i++,j++) {
		
		newNums[k++] = nums[i];
		newNums[k++] = nums[j];
		
	}



return newNums;
}

}
