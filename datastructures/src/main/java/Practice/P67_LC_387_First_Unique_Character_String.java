package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class P67_LC_387_First_Unique_Character_String {
	

	
	@Test 
	public void example1() {
		String s  = "lleetcode";
		System.out.println(firstUnique(s));
	}

	
	private int firstUnique(String s) {
		
		Map<Character,Integer>  map = new LinkedHashMap<Character,Integer>();
		
		int j=0;
		
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			
			if(entry.getValue()==1) {
				 return s.indexOf(entry.getKey());
			}
			j++;
		}
		
		return -1;
	}

	
	


}
