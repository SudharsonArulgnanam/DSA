package DataStructure.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,2};
		int sum =3;
		//int[][] result = null;
		//List<int[][]> rowList = new ArrayList<int[][]>();
		
		//Map<Integer,Integer> rightHereMap = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int value = array[i]+array[j];
				
				//List<Integer> no = new ArrayList<Integer>();
				//no.add(j);
				if(value==sum)
				{
					//rightHereMap.put(i, j);
					//System.out.println(rightHereMap);
					System.out.println(i+","+j);
				}
				
			}
		}
		
		

	}

}
