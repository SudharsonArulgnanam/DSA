package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class comparator {

	@Test
	public void test1() {
		int[] data = {3,4,6,2,4,2};
		frequencySort(data);
	}

	private void frequencySort(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
		}
		
		List<Entry<Integer,Integer>> lst = new ArrayList<>(map.entrySet());
		//sort by value
		Collections.sort(lst, Map.Entry.comparingByValue());
		Collections.reverse(lst);
		System.out.println(lst);
		
		//sort by key
		Collections.sort(lst, Map.Entry.comparingByKey());
		Collections.reverse(lst);
		System.out.println(lst);
		
		
	}


}
