package Practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CharacterOccAndMaxNMin {
	
	@Test
	public void example1() {
		String s  = "hellohellocalltrdfgiop";
		maxNMin(s);
	}
	
	private void maxNMin(String s) {
		
		char[] ch = s.toCharArray();
		
		Map<Character,Integer> occurance = new HashMap<Character,Integer>();		
		
		for(Character c :ch)
		  occurance.put(c, occurance.getOrDefault(c, 0)+1);
		
		int max = Collections.max(occurance.values());
		
		
		int min = Collections.min(occurance.values());
		
		for(Map.Entry<Character,Integer> entry:occurance.entrySet())
		{
			if(entry.getValue()==max)
			{
				System.out.println("Max "+entry.getKey()+"="+entry.getValue());
			}
			
			if(entry.getValue()==min)
			{
				System.out.println("Min "+entry.getKey()+"="+entry.getValue());
			}
			
		}
		int secondMax=0;
		for(Map.Entry<Character,Integer> entry:occurance.entrySet())
		{
			if(entry.getValue()<max)
			{
				secondMax = Math.max(secondMax, entry.getValue());
			}
			
		}
		
		for(Map.Entry<Character,Integer> entry:occurance.entrySet())
		{
			if(entry.getValue()==secondMax)
			{
				System.out.println(entry.getKey());
			}
			
			}
		
	
		System.out.println(secondMax);
}
}
