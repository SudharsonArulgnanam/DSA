package Practice;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ArraysIntersection {


	@Test
	public void example1() {
		Integer[] nums1 = {1,2,11,12};
		Integer[] nums2 = {2,12};
		intersection(nums1, nums2);
	}
	
	//@Test
	public void example2() {
		Integer[] nums1 = {1,2,11,12};
		Integer[] nums2 = {};
		intersection(nums1, nums2);
	}
	
	//@Test
	public void example3() {
		Integer[] nums1 = {1,2,11,12};
		Integer[] nums2 = {123,123,212};
		intersection(nums1, nums2);
	}

	private void intersection(Integer[] nums1, Integer[] nums2) {
		 HashSet<Integer> set = new HashSet<Integer>(); 
		 
		    set.addAll(Arrays.asList(nums1));
		     
		    set.retainAll(Arrays.asList(nums2));
		     
		  //  System.out.println(set);
		     
		    //convert to array
		    Integer[] intersection = {};
		    intersection = set.toArray(intersection);
		     
		    System.out.println(Arrays.toString(intersection));
		
		
	}
	
	
	/*
	 * private void intersection(int[] nums1, int[] nums2) {
	 * 
	 * int left = 0, right = 0; boolean bIntersection = false;
	 * 
	 * while(left < nums1.length && right < nums2.length) {
	 * 
	 * if(nums1[left] == nums2[right]) { System.out.println(nums1[left]);
	 * bIntersection = true; left++; right++; } else if(nums1[left] < nums2[right])
	 * { left++; } else { right++; }
	 * 
	 * }
	 * 
	 * if(!bIntersection) System.err.println("There is no intersection");
	 * 
	 * }
	 */
	
	
	/*
	 * Integer[] nums1 = Arrays.stream( n1 ).boxed().toArray( Integer[]::new );
	
	Integer[] nums2 = Arrays.stream( n2 ).boxed().toArray( Integer[]::new );
	
	Set<Integer> set =new HashSet<Integer>();
	
	set.addAll(Arrays.asList(nums1));
	
	set.retainAll(Arrays.asList(nums2));
	
	
	Integer[] nums3 =new Integer[set.size()];
	
	nums3 = set.toArray(nums3);
	
	System.out.println(Arrays.toString(nums3));
	 * 
	 */
	 
	
	
}
