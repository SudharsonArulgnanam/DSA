package Practice;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class P65_LC_242_Valid_Anagram {
	
	@Test
	public void example1() {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(findMostOrLeast(s,t));
	}

	private boolean findMostOrLeast(String s,String t) {
        
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        Map<Character,Integer> map1 = new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        
        for(int i=0;i<t.length();i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        
        System.out.println(map);
        
        System.out.println(map1);
        
        if(map.equals(map1)) return true;
        
        return false;
        
	}

}
