package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Test;

import java.util.HashSet;



public class longestConsectiveNumber {
	@Test
	public void example3() {
		Integer[] nums = { 0,2,4,5,6};
		longestConsNumber(nums);
	}
		
		private void longestConsNumber(Integer[] nums)
		{
			HashSet<Integer> values1 = new HashSet<Integer>();

			values1.addAll(Arrays.asList(nums));
			
			List<Integer> values=  new ArrayList<Integer>();
			
			values.addAll(values1);
			//values.addAll(Arrays.asList(nums));
			
			Collections.sort(values);
			
			System.out.println(values);
			
	        int max = 0;
	        
	        int j=0, k=0;
	        
	        for (int i : values) {
	            
	            int length = 0;
	            
	            while (values.contains(i++))
	            {
	                length++;
	            }
	            
	            if(max<length)
	            {
	            	 k=j;
	            	System.out.println("k"+k);
	            }
	            
	            max = Math.max(max, length);
	            
	           j++;
	          
	        }
				
				System.out.println(max);
				
				for(int i=k;i<values.size();i++)
				{
					System.out.println(values.get(i));
					
				}
			}
			
			
}
