package DataStructure.Day1;
import org.junit.Test;

public class ReverseStringTwoPointers {

	@Test
	public void example1() {
		String s = "hello";
		reverseUsing2Pointer(s);
	}

	// O[n]
	private void reverseString(String s) {
		char[] ch = s.toCharArray();  	// mem copy		
		for (int i = ch.length-1; i >=0; i--) { // O[n]
			System.out.print(ch[i]);
		}

	}

	private void reverseUsing2Pointer(String s) {
		char[] ch = s.toCharArray();  			
		int left = 0, right = ch.length-1;
		while (left < right) { // O(n/2) => o(n)
			// swap
			char temp = ch[right];
			ch[right--] = ch[left];
			ch[left++] = temp;
		}
		System.out.println(new String(ch));
	}

}

