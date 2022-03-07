package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class validlongestparensesthiscount {

	
	@Test
	public void example1() {
		String str = "(()";
		System.out.println(isValid(str));
	}

	@Test
	public void example2() {
		String str = ")()())";
		System.out.println(isValid(str));
	}
	
	@Test
	public void example3() {
		String str = "()(()";
		System.out.println(isValid(str));
	}
	
	
	
	/* Algorithm: Stack and Map
	 * 
	 * 1) Convert the String into character array 
	 * 2) Create a Map with key (closing brackets) and value (open brackets)
	 * 3) Loop through each character 
	 * 		a) Check if the char exist in the Map as key
	 * 			i) Exist: Pop the stack value and compare the map value 
	 * 			ii) If matches --> continue, else --> return false;
	 * 		b) If the char does not exist --> push to the stack
	 * 4) finally, return the boolean --> if the stack is empty -> true else false
	 * 
	 */

	/* 
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 * 
	 */
	private int isValid(String str) {
     
		int max=0; 
		
		char[] ch = str.toCharArray();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(-1);
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='(') {
				stack.push(i);
			}else {
				stack.pop();
				if(stack.isEmpty()) stack.push(i);
				else {
					int length = i-stack.peek();
					max=Math.max(max, length);
				}
			}
		}
		return max;
			}



}
