package Practice;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class AlphabeticSequence {
	
	@Test
	public void example1() {
		String str = "aabbcccc";  //abcabccc
		System.out.println(isValid(str));
	}

	private String isValid(String s) {
		
		List<Character> lst1 = new LinkedList<Character>();
		List<Character> lst2 = new LinkedList<Character>();
		Set<Character> set = new LinkedHashSet<Character>();
		char[] ch = s.toCharArray();
		StringBuilder sd = new StringBuilder();
		for(char c:ch) {
			lst1.add(c);
		}
		lst2.addAll(lst1);
		for(int i=0;i<lst1.size();i++) {
			if(set.add(lst1.get(i))) {
				lst2.remove(lst1.get(i));
				sd.append(lst1.get(i));
			}else if(i==lst1.size()-1) {
				lst1.clear();
				lst1.addAll(lst2);
				set.clear();
				i=-1;
			}
			System.out.println(lst1);
			System.out.println(lst2);
			System.out.println(sd.toString());
		}
		
		
		
		return sd.toString();
		
		
	}
}
