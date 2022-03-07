package Practice;

import java.util.Arrays;

import org.junit.Test;

public class sortString {
	
	@Test
	public void example1() {
		String s  = "hellohellocalltrdfgiop";
		sortStr(s);
	}
	
	private void sortStr(String s)
	{
		//String str ="";
		
		char[] ch = s.toCharArray();
		 s="";
		Arrays.sort(ch);
		
		for(char c:ch)
		s=s+c;
		
		System.out.println(s);
		
		
	}

}
