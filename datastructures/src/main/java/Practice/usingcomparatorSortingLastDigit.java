package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class usingcomparatorSortingLastDigit {

	@Test
	public void test1() {
		Integer[] data = {198,354,789};
		frequencySort(data);
	}

	private void frequencySort(Integer[] data) {
		
		List<Integer> sort = Arrays.asList(data);
		
		Collections.sort(sort, new Comparator<Integer>() {
			
			public int compare(Integer e1, Integer e2) {
				if(e1%100>e2%100) return 1;
				else if(e1%100<e2%100) return -1;
				return 0;
			}
		});
		System.out.println(sort);
}}
