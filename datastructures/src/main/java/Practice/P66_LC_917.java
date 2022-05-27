package Practice;

import java.util.Arrays;

import org.junit.Test;

public class P66_LC_917 {
	
	@Test // o(n/2)
	public void example1() {
		String s  = "ab-cd";
		reverseVowel(s);
	}
	
	@Test //o(n/2)
	public void example2() {
		String s  = "a-bC-dEf-ghIj";
		reverseVowel(s);
	}
	
	private void reverseVowel(String s) {
		char[] ch = s.toCharArray();
		int left = 0, right = ch.length-1;
		
		while(left < right) {
			if(isAlphabet(ch[left]) && isAlphabet(ch[right])) {
				char temp = ch[left];
				ch[left++] = ch[right];
				ch[right--] = temp;
			} else if(isAlphabet(ch[left])) {
				right--;
			} else {
				left++;
			}
		}
		System.out.println(Arrays.toString(ch));
		
	}

	private boolean isAlphabet(char c) {
		if(Character.isAlphabetic(c))
			return true;
		return false;
	}

	
}
