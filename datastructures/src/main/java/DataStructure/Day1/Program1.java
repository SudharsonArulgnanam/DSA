package DataStructure.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program1 {

	
	// Given the integer array and the target
	//Remove the matching target from the array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,6,7};
		int target = 2;
		
		/*Using another array without list
		int count=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]!=target)
				count++;		
		}	
		int result[] = new int[count];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=target) {
				result[j]=arr[i];
				j++;
			}
		}*/
		
		// using array with list
		List<Integer> remTarget = new ArrayList<Integer>();
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]!=target)
				remTarget.add(arr[i]);		
		}	
		int result[] = new int[remTarget.size()];
		int j=0;
		for(int i=0;i<remTarget.size();i++)
		{
			result[i] = remTarget.get(i);
			}
		
		
System.out.println(Arrays.toString(result));

	}

}
