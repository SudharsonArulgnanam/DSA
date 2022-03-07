package DataStructure.Day1;

import java.util.ArrayList;
import java.util.Arrays;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="hello";
		int left=0;
		int right=input.length()-1;
		char[] inputs=input.toCharArray();
		
			
			ArrayList<String> vowelIndices=new ArrayList<String>();
			vowelIndices.add("aeiou");
			if(vowelIndices.contains(inputs[left]))
				System.out.println(true);
			else
				System.out.println(false);


				
			
}
}
