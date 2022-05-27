package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P64_LC_1832_check_sentence_isPangram {



	public static void main(String args[]) {
		String sentence = "thequickbrownfoxjumpasoverthelzydog";
		// Assert.assertEquals(true, Arrays.equals(squareAndSort(nums), new int[] {4, 9,
		// 16, 16, 25}));
		System.out.println(MaxSubArray(sentence));
	}

	private static boolean MaxSubArray(String sentence) {
		// TODO Auto-generated method stub
		
		int[] pangram = new int[26];
		
		for(int i=0;i<sentence.length();i++) {
			pangram[sentence.charAt(i)-'a']++;
		}
		
		for(int i=0;i<pangram.length;i++) {
			if(pangram[i]<1) return false;
		}
		return true;
	}
}

/*	public static boolean MaxSubArray(String sentence) {

		int[] pangram = new int[26];

		for (int i = 0; i < sentence.length(); i++) {

			pangram[sentence.charAt(i) - 'a']++;

			if (i == sentence.length() - 1) {
				List<Integer> lst = Arrays.stream(pangram).boxed().collect(Collectors.toList());
				if (lst.contains(0))
					return false;
			}
		}

		return true;

	}


}*/
