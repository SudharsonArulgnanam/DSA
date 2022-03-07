package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class characterCountingProblemStack {

	// Problem aabcca --> 2a1b2c1a
	@Test
	public void example1() {
		String str = "";
		System.out.println(stackProblem(str));
	}

	private String stackProblem(String str) {
		// TODO Auto-generated method stub

		Stack<Character> st = new Stack<Character>();

		StringBuilder sb = new StringBuilder();

		if (str.equals(null) || str.length() == 0)
			return "";

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (st.empty()) {
				st.push(ch[i]);
			}
			else if (st.peek() != ch[i]) {
				sb.append(st.size()).append(st.pop());
				st.clear();
				st.push(ch[i]);
			} else {
				st.push(ch[i]);
			}

		}
		return sb.append(st.size()).append(st.pop()).toString();
	}

}

/*
 * 
 * private void stackProblem(String str) {
		// TODO Auto-generated method stub
		
		
		List<Character> lst = new ArrayList<Character>();
		
		StringBuilder st = new StringBuilder();
		char[] ch = str.toCharArray();
		int left=0,right=0;
		
		while(right<ch.length)
		{
			if(ch[left]==ch[right])
			{
				lst.add(ch[right++]);
			}else {
				st.append(lst.size()).append(ch[left]);
				System.out.println(st);
				lst.clear();
				left = right;
			}
				
		}
		System.out.println(st.append(lst.size()).append(ch[left]));

		}
		
 */

/*
 * brute froce
 * 
 * char prevChar =0;
 * int counter=0;
 * 
 * for(char c: ch)
 * {
 * if(c==preChar)
 * counter++;
 * else if (preChar!=0)
 * sb.append(counter).append(preChar);
 * precChar=c;
 * counter=1;
 * }
 * sb.appebd(counter).append(prechar);
 * Sys.out(sb.toString());
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
