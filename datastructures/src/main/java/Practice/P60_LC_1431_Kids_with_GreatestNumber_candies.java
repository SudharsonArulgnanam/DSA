package Practice;

import java.util.Arrays;

import org.junit.Test;

public class P60_LC_1431_Kids_with_GreatestNumber_candies {
	
	@Test
	public void testData() {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		System.out.println(Arrays.toString(candies(candies,extraCandies)));
	}

	private String[] candies(int[] candies, int extraCandies) {
		// TODO Auto-generated method stub
		
		String[] newCandies = new String[candies.length];
		int max=0;
		
		for(int i=0;i<candies.length;i++) {
			max=Math.max(max, candies[i]);
		}
		
		for(int i=0;i<candies.length;i++) {
			if(candies[i] + extraCandies >=max) newCandies[i]= "true";
			else newCandies[i]="false";}
		
		
			
		return newCandies;
		
	}

}
