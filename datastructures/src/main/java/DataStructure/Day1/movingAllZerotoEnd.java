package DataStructure.Day1;

import java.util.Arrays;

import org.junit.Test;

public class movingAllZerotoEnd {
	
	/*Given an integer array nums, move allo's to the end of it while
	 * maintaining the relative order of the non-zero elements
	 */
	
	@Test
	public void testData1()
	{
		int[] num = {0,1,0,3,12};
		
		moveZeros(num);
			
	}
	
	@Test
	public void testData2()
	{
		int[] num = {0};
		moveZeros(num);
	}
	
	@Test
	public void testData3()
	{
		int[] num = {1,-1,-2,-3,-4,4,5};
		moveZeros(num);
	}
	
	public void moveZeros(int num[])
	{
		
		//moving the zero to array's end 
		int count=0;
		for(int i=0; i<num.length;i++)
		{
			if(num[i]!=0)
			num[count++]=num[i];				
		}
		
		for(int i=count;i<num.length;i++)
		{
			num[i]=0;
		}
		System.out.println(Arrays.toString(num));
	}
		
		
	/*	for(int i=count-1; i<num.length;i--)
		{
			if(num[i]!=0)
			num[--count]=num[i];
			if(i==0)
				break;
		}
		
		
		for(int i=count-1;i>=0;i--)
		{
			num[i]=0;
		}
		System.out.println(Arrays.toString(num));
	}*/

}
