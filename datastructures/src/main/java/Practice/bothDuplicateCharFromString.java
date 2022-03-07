package Practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class bothDuplicateCharFromString {


	@Test
	public void example1() {
	//	String s = "adcqertabc";
	//	String p = "abc";
		
		
		String s = "achujikolabc";
		String p = "abc";
		findAllAnagramsUsingSlidingWindow(s,p);
	}

	private void findAllAnagramsUsingSlidingWindow(String s, String p) {
		int sLength = s.length(), pLength = p.length();
		
		if(pLength > sLength)
			new RuntimeException("Given Input is wrong");
		
		HashMap<Character, Integer> pMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < pLength; i++) {
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0)+1);
		}
		
		// Push into sMap only pLength character 
		// Add the new character, Delete the old character
		for (int i = 0; i < sLength; i++) {
			
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
			
			// when it is bigger than pLength
			if(i >= pLength) {
				char ch = s.charAt(i-pLength); // this is character to delete
				
				// if it is just one occurance --> delete the key
				// if it is multiple occurance --> update with value - 1     
				
				if(sMap.get(ch) == 1) {
					sMap.remove(ch); // --> delete the key
				} else {
					sMap.put(ch, sMap.get(ch)-1); // --> update with value - 1
				}
			}
			
			if(i >= pLength && sMap.equals(pMap)) {
				System.out.println("Matches !!");
			}
			
			
			
		}}
	

	

}
