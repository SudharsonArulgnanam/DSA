package DataStructure.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class FrequencySort {

	@Test
	public void test1() {
		int[] data = { 3, 4, 6, 2, 4, 2 };
		System.out.println(frequencySort(data));
	}

	private Map<Integer, Integer> frequencySort(int[] nums) {

		Map<Integer, Integer> frequency = new TreeMap<Integer, Integer>();
		List<Integer> values = new ArrayList<Integer>();
		for (int sdata : nums) {
			frequency.put(sdata, frequency.getOrDefault(sdata, 0) + 1);
			
		}
		
		
		  for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
		  values.add(entry.getValue()); }
		  
		 
		  System.out.println(values);
		

		return frequency;

	}
}
