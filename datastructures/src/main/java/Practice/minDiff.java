package Practice;

import java.util.Arrays;

import org.junit.Test;

public class minDiff {	@Test
	public void test1() {
	int[] data = {1,3,3,2,4};
	mindiff(data);
}

public void mindiff(int[] data) {
	
	Arrays.parallelSort(data);
	int sum=0;
	for(int i=0;i<data.length-1;i++) {
		
		int dif = data[i]-data[i+1];
		sum = sum + Math.abs(dif);
		
		
	}System.out.println(sum);
	
}


}
