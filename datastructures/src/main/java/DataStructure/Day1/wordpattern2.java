package DataStructure.Day1;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class wordpattern2 {
	/*
	 * 
Example 1:
String[] ch = {"abb", "abc", "xyz", "xyy"};
String pattern = "mnn";
Output: ["xyy","abb"] --> List -> Any order
Answer: xyy and abb have same character at index 1 and 2 like the pattern
Example 2:
String[] ch = {"abb", "abc", "xyz", "xyy"};
String pattern =  "mno";
Output: ["abc", "xyz"]
Output: abc and xyz have all distinct characters, similar to the pattern.
Example 3:
String[] ch = ["abb", "abc", "xyz", "xyy"];
String pattern = "aba";
Output: [] 
Pattern has same character at index 0 and 2. No word in dictionary follows the pattern. 
	 */
	public static void main() {
	String[] ch = {"abb", "abc", "xyz", "xyy"};
	String pattern = "mnn";
	char[] charCh= new char[3];
	char[] charPattern = pattern.toCharArray();
	HashMap<Character,Integer> wordPattern = new HashMap<Character,Integer>();
	HashMap<Character,Integer> chPattern = new HashMap<Character,Integer>();
	ArrayList<String> chList = new ArrayList<String>();
	
	for(int i=0;i<=ch.length;i++)
	{
		charCh[i]=ch[i].charAt(i);
		if(wordPattern.put(charCh[i], i)!= chPattern.put(charPattern[i],i))
		{
			chList.add(ch[i]);
		}
	
	}
	
	System.out.println(chList);
}
}
