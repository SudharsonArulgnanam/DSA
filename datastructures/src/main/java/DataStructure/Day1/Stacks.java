package DataStructure.Day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{[)]}";
		char[] bracket = str.toCharArray();
		Map<Character,Character> map = new HashMap<Character,Character>();
		map.put('}','{');
		map.put(']','[');
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<bracket.length;i++)
		{
			if(map.containsKey(bracket[i])) {
			if(stack.isEmpty() || stack.pop() !=map.get(bracket[i])) break;
			}
				else stack.push(bracket[i]);
			}
		
		if(stack.isEmpty())
			System.out.print("properly closed");
		}
		
		
	}


