package DataStructure.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class decoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="a3[2[ab]]";
		char[] bracket = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		List<Character> decode = new ArrayList<Character>();
		for(int i=0;i<bracket.length;i++) 
		{
			if(bracket[i]!=']') stack.push(bracket[i]);
			else
				decode.add(stack.pop());
		}

System.out.print(decode);
}
}
