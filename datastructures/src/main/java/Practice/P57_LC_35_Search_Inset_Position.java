package Practice;

import java.util.Arrays;

import org.junit.Test;

public class P57_LC_35_Search_Inset_Position {
	@Test
	public void test1() {
	int[] nums= {1,3,4,6};
	int target=5;
	
	System.out.println(SearchInsertPosition(nums,target));
	
}

private int SearchInsertPosition(int[] nums,int target) {
	// TODO Auto-generated method stub
	
	for(int i=0;i<nums.length;i++) {
	if(nums[i]==target)	return i;
	else if(nums[i]>target) return i;
	}
return nums.length;
}

}
