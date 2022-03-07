package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
public class TwoSum {

		/*
		 * Given the input int array, find the sum of any two distinct indices of the matching 
		 * given the target 
		 * 
		 */

		@Test // +ve
		public void example1() {
			int[] nums = {2,7,11,7,15};
			int target = 9;
			twoSum_BruteForce(nums, target);
			// Output --> {0,1}
		}

		

		/* 
		 * Brute force !!
		 * Psuedo code here:
		 * 
		 * 1) Take the input array 
		 * 2) Traverse every element using for loop
		 * 3) Add with the next element with the outer loop
		 * 4) Compare the sum with the target
		 * 		a) If it matches, store them in a list !!
		 * 		b) If it does not match, continue
		 * 5) Finally, return the list !! 
		 * 
		 */

		private List<int[]> twoSum_BruteForce(int[] nums, int target) {
			//adding array to the list implement
			List<int[]> index = new ArrayList<int[]>();
			boolean bMatch = false;
			for (int i = 0; i < nums.length; i++) {
				for (int j = i+1; j < nums.length; j++) {
					if(nums[i] + nums[j] == target) {
					index.add(new int[] {i,j});
						//System.out.println(i+","+j);
						bMatch = true;
					}
				}
			}
			
			if(!bMatch)
		throw new RuntimeException("There is no match");
			
			
			for(int[] eachrow:index)
			{
				System.out.println(Arrays.toString(eachrow));
			}
		
			return index;
		}

		

	}



