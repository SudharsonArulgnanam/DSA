package Practice;

import org.junit.Test;

public class convertLowertoUpperAndUppertoLower {
	


	@Test
	public void example3() {
		
		String input ="aBCde";
		
		captialSmallLetter(input);
		
	}

	private void captialSmallLetter(String input) {
		// TODO Auto-generated method stub
		
		
		char[] ch = input.toCharArray();
		
		String str ="";
		
		
		for(char c:ch)
		{
			if(Character.isLowerCase(c))
			{
				str = str + c + Character.toUpperCase(c);
			}
			else if(Character.isUpperCase(c)) {
				
				str = str + c + Character.toLowerCase(c);
			}
		}
		
		System.out.println(str);
	}

	

}
