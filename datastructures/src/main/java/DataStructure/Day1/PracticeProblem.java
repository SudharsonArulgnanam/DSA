package DataStructure.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem {@Test
	public void test1() {
	String s = "123";
	System.out.println(isSubsequenceOptimized(s));
}

private Stack<Character> isSubsequenceOptimized(String str) {
	
	char[] ch = str.toCharArray();
	
	Stack<Character>  stack = new Stack<Character>();
	
	for(int i=0;i<ch.length;i++) {
		
		stack.push(ch[i]);
	}
	
	
	
	return stack;





}}