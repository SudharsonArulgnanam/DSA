package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class P59_LC_771_Jewels_and_stones {
	
	@Test
	public void testdata() {
		String jewels ="aA";
		String stones="aAAbbbb";
		System.out.println(jewelsAndStones(jewels,stones));
	}

	private int jewelsAndStones(String jewels, String stones) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		char[] jewel = jewels.toCharArray();
		
		Set<Character>  set = new HashSet<Character>();
		
		for(char  c:jewel) {
		set.add(c);
		}
		char[] stone = stones.toCharArray();
		
		for(int i=0;i<stones.length();i++) {
			if(set.contains(stone[i])) {
				count++;
			}
		}
		
		
		
		return count ;
	}

	private int jewelsAndStones1(String jewels, String stones) {
		// TODO Auto-generated method stub
		char[] stone = stones.toCharArray();
		char[] jewel = jewels.toCharArray();
		
		int count=0;
		
		Map<Character,Integer>  map = new HashMap<Character,Integer>();
		
		
		for(int i=0;i<stone.length;i++) {
			map.put(stone[i], map.getOrDefault(stone[i], 0)+1);
		}
		
		System.out.println(map);
		
		for(int i=0;i<jewel.length;i++) {
			for(Map.Entry<Character,Integer> entry:map.entrySet()) {
				if(entry.getKey()==jewel[i]) {
				count = count+entry.getValue();
				}
			}
		}
		
		return count;
	}

}
