package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class PrintValidParanthesis {
	
//	@Test
	public void example1() {
		String str = "()";
		System.out.println(isValid(str));
	}

	//@Test
	public void example2() {
		String str = "([])";
		System.out.println(isValid(str));
	}
	
	@Test
	public void example3() {
		String str = ")[]){[(())]}";
		System.out.println(isValid(str));
	}
	
	//@Test
	public void example4() {
		String str = "())";
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
	private String isValid(String str) {
		
		char[] bracket = str.toCharArray();
		Map<Character, Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');
		Stack<Character> stack = new Stack<>();
		StringBuilder st = new StringBuilder();

		for (int i = 0; i < bracket.length; i++) {
			if(map.containsKey(bracket[i])) {
				if(!stack.isEmpty()) {
				if(stack.peek() == map.get(bracket[i])) {
					st.append(stack.pop()).append(bracket[i]);
				}}}
			else 
				stack.push(bracket[i]);
		}
		return st.toString();
	}




}
