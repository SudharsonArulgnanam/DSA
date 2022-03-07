package DataStructure.Day1;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class reverseVowels {
	

		/*
		*
		* Given a string s, reverse only all the vowels in the string and return it.
		* The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
		*
		*/

 		@Test
		public void example1() {
		String input="hello";
		String output="holle";
		reverseVowels(input);
		}

	//	@Test
		public void edge() {
		String input="bcdgh";
		String output="bcdgh";
		//Assert.assertTrue(output.equals(reverseVowels(input)));
		}

//		@Test
		public void example2() {
		String input="leetcode";
		String output="leotcede";
		//Assert.assertTrue(output.equals(reverseVowels(input)));
		}

		/*
		* Pseudocode
		*
		* 1) Take the given array
		* 2) Find the vowels in a string and store it in a separate string
		* 3) Also store the indices of the vowels in an arrayList
		* 4) Loop through arrayList and replace the vowel character in the String
		* from the vowelString
		*
		*/

		/*private String reverseVowels(String input) {
		if(input.contains("aeiou")||!input.equals("")){
		String vowelStr="";
		ArrayList<Integer> vowelIndices=new ArrayList<Integer>();

		for(int i=0;i<input.length();i++) {
		if(("aeiou").contains(input.charAt(i)+"")){
		vowelStr=input.charAt(i)+vowelStr;
		vowelIndices.add(i);
		}
		}
		char[] charArray = input.toCharArray();
		for(int i=0;i<vowelIndices.size();i++) {
		charArray[vowelIndices.get(i)]=vowelStr.charAt(i);
		}
		input=String.copyValueOf(charArray);
		}
		else return input;

		System.out.println(input);
		return input;

		}*/
		
		//Two pointers
		
		
		
		private void reverseVowels(String input)
		{
			int left=0;
			int right=input.length()-1;
			char[] inputs=input.toCharArray();
			char temp;
			while(left<right)
			{
			if((isVowel(inputs[left])) && (isVowel(inputs[right])))
			{
				temp =inputs[left];
				inputs[left++]=inputs[right];
				inputs[right--]=temp;
			}else if(isVowel(inputs[left]))
			{
				right--;
				
			}else
				left++;
			
			
		}
			System.out.println(Arrays.toString(inputs));
		}
		
		private boolean isVowel(char c) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				return true;
			return false;
		}
}

