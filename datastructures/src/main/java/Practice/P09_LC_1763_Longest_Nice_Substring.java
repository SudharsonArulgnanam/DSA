package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class P09_LC_1763_Longest_Nice_Substring {

	
	
	
	
	@Test
	public void test1() {
		System.out.println(longestNiceSubstring("abABrsaAdDzZ"));
	}
	
	@Test
	public void test2() {
		System.out.println(longestNiceSubstring("Y"));
	}
	
	@Test
	public void test3() {
		System.out.println(longestNiceSubstring("YaaaAAy"));
	}
	
	
	public String longestNiceSubstring(String s) {
		int max = 0;
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder(s.charAt(i)+"");
			for (int j = i+1; j < s.length(); j++) {
				sb.append(s.charAt(j));
				if(niceString(sb.toString())) {
					if(max <j-i+1) {
						max = j-i+1;
						output = sb.toString();
					}
				}
			}
		}
		return output;
	}

	public boolean niceString(String sb) {
		String s = sb;//abAB
		for (int i = 0; i < s.length(); i++) {
			if((Character.isUpperCase(s.charAt(i)))) { //a
				if(!s.contains((Character.toLowerCase(s.charAt(i))+""))) // 
					return false;				
			}else { //a -> A
				if(!s.contains((Character.toUpperCase(s.charAt(i))+""))) 
					return false;
			}
		}
		return true;
	}
	
	/*
	 * private String longestNiceSubstring(String string) {
		// TODO Auto-generated method stub
	
	Set<Character>   set = new HashSet<Character>();
	
	//String subString1="", subString2 = "";
	
	char[] ch = string.toCharArray();
	
	for(char c : ch) {
		set.add(c);
	}
	
	for(int i=0;i<ch.length;i++) {
		if(set.contains(Character.toLowerCase(ch[i])) && set.contains(Character.toUpperCase(ch[i])))
			continue;
	String	subString1 =longestNiceSubstring(string.substring(0, i));
	String	subString2 = longestNiceSubstring(string.substring(i+1,ch.length));
	return subString1.length()>subString2.length() ? subString1:subString2;
	}
	return string;
	
		
	}
	 * 
	 * 
	 */
	
	
}






















