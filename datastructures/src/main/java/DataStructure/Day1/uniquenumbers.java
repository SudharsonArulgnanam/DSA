package DataStructure.Day1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class uniquenumbers {

	
	@Test // edge
	public void example2() {
		
		int[] nums={4,4,2,5,5,0,5};
		
		
		int k = 3;
		
		uniqueNumber(nums,k);
	}

	private void uniqueNumber(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int maxSize=0,max=0;
		Set<Integer> unique = new HashSet<Integer>();
		
		for(int i=0;i<k;i++)
		{
			unique.add(nums[i]);
			
		}
		
		maxSize=unique.size();
		
		for(int i=k;i<nums.length;i++)
		{
			
			if(unique.add(nums[k]))
				max= Math.max(maxSize, unique.size());
				else {
				unique.remove(nums[i-k]);
				
			}
		}
		
		System.out.println(max);
		
}
	
	/*
	 * private void uniqueNumber(int[] nums, int k) {
	 * 
	 * Map<Integer,Integer> uniqueNo = new HashMap<Integer,Integer>();
	 * 
	 * int max=0; for(int i=0;i<k;i++) { uniqueNo.put(nums[i],
	 * uniqueNo.getOrDefault(nums[i], 0)+1); }
	 * 
	 * max=uniqueNo.size();
	 * 
	 * for(int i=k;i<nums.length;i++) { uniqueNo.put(nums[i],
	 * uniqueNo.getOrDefault(nums[i], 0)+1);
	 * 
	 * if(uniqueNo.get(nums[i-k])==1) { uniqueNo.remove(nums[i-k]); }else {
	 * uniqueNo.put(nums[i-k], uniqueNo.get(nums[i-k])-1); }
	 * 
	 * max=Math.max(max, uniqueNo.size());
	 * 
	 * }
	 * 
	 * System.out.println(max);
	 * 
	 * 
	 * }
	 */
	
	
	
}
