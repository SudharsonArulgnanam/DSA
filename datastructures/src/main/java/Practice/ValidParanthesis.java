package Practice;

import org.junit.Test;

public class ValidParanthesis {

	//How many more paranthesis needed to make it valid parenthesis
	@Test
	public void testData() {
		String input = ")(())()()))";
		validParenthesis(input);
	}

	private void validParenthesis(String input) {
		// TODO Auto-generated method stub
		
		char[] ch = input.toCharArray();
		
		int open=0,close=0;
		
		for(char c : ch)
		{
			if(c=='(') open++;
		    else close++;
		}
	 
		int value = Math.abs(close-open);
		System.out.println(value);
		
	}
	
	
	
}
