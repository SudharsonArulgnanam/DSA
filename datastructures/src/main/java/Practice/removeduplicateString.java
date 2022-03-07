package Practice;

import org.junit.Test;

public class removeduplicateString {
	@Test // positive
	public void example1() {
		String str = "lovelovelove";
		
		removeDuplicateString(str);
	}

	private void removeDuplicateString(String str) {
		
		char[] ch = str.toCharArray();
		
		String newString = "";
		
		for(char c: ch)
		{
			if(newString.indexOf(c)<0)
			{
				newString=newString + c;
			}
			
		}
		
		System.out.println(newString);
		
		
	}
		
	
}
