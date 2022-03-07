package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {

	public static void main(String[] args) {
		
	/*	String s = "(\\d+) |  ([A-Z]+)";
		// TODO Auto-generated method stub
		
		String input = "Aa123";*/
		
		/*String s = "cat";
		// TODO Auto-generated method stub
		
		String input = "cat cat 2cat123 catact";*/
		
		String s = "a*b";
		// TODO Auto-generated method stub
		
		String input = "aabfooaabfooabfoob";
		
		input = input.replaceAll("a*b", "-");
		
		System.out.println(input);
		
	/*	String s = "a+b";
		// TODO Auto-generated method stub
		
		String input = "aabfooaabfooabfoob";*/
		
		/*String s = "a?b";
		// TODO Auto-generated method stub
		
		String input = "aabfooaabfooabfoob";*/
		
		
		
		/*String s = "ab";
		String input = "abbahybahgabbababab";*/
		
		/*String s = "ab+";
		String input = "abbahybahgabbababab";*/
		
		
		
		int count=0;
		
		Pattern p = Pattern.compile(s);
		
		Matcher m = p.matcher(input);
		
		List<String> lst = new ArrayList<String>();
		
		while(m.find())
		{
			lst.add(m.group());
			System.out.println(m.group(0));
		}
		
		System.out.println(lst);
	}

}
