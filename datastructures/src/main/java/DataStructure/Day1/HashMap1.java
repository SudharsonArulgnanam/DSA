package DataStructure.Day1;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap1 {
	
	
	public static void main(String args[])
	{
		String jewels = "aA";
		String stones = "aAAbbbb";
		HashMap<Character,Integer> jewelsSet = new HashMap<Character,Integer>();
		
		int jewelsSize = jewels.length();
		int count=0;
		 
		 for(int i=0;i<jewelsSize;i++)
		 {
			 jewelsSet.put(jewels.charAt(i), jewelsSet.getOrDefault(jewels.charAt(i),0)+1);
		 }

         for(int i=0;i<stones.length();i++)
         {
        	 if(jewelsSet.containsKey(stones.charAt(i)))
        	 {
        		 count++;
        	 }
        		 
         }
	
	System.out.println("jewels"+count);
	}
}
