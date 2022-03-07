package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P53_LC_2062_Count_Vowel_Substrings_of_a_String {
    
    public static void main(String args[]){
        String str = "cuaieuouacc";
		//int target =2;
		System.out.println(vowels(str));
    }
    public static int vowels(String str) {
    	int left=0,right=0, count=0;
    	
    	List<Character>  lst = new ArrayList<Character>();
    	
    	Set<Character>   set = new HashSet<Character>();    	
    	
    	while(left<str.length()) {
    		
    		while(isvowels(str.charAt(right)) && right<=str.length()) {
    			lst.add(str.charAt(right));
    			set.addAll(lst);
    			if(set.size()==5) count++;
    			right++;
    		}
    		set.clear();
    		lst.clear();
    		right=++left;
    	}
    	return count;	
    }
	private static boolean isvowels(char c) {
		// TODO Auto-generated method stub
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			return true;
		}
		return false;
	}
}
