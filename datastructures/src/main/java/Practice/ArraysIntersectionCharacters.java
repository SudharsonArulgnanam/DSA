package Practice;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class ArraysIntersectionCharacters {

	@Test
	public void example1() {
		Character[] nums1 = { 'a', 'k', 'd', 'e', 'd' };
		Character[] nums2 = { 'e', 'f', 'z', 'd', 'l' };
		intersection(nums1, nums2);
	}

	private void intersection(Character[] nums1, Character[] nums2) {
		HashSet<Character> set = new HashSet<Character>();
		
		
		set.addAll(Arrays.asList(nums1));
		set.retainAll(Arrays.asList(nums2));
		Character[] intersection = new Character[set.size()];
		intersection = set.toArray(intersection);
		System.out.println(Arrays.toString(intersection));

	}

}
