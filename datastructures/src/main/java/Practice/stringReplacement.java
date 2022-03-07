package Practice;

import org.junit.Test;

public class stringReplacement {
	
	String output = "";

@Test
public void example1() {
	System.out.println(replaceWord("Welcome to the interview. All the best to your test","to"));
}

private String replaceWord(String string, String string2) {
	
	// TODO Auto-generated method stub
	
	String[] splitString = string.split(" ");
	
	String newString = "";
	
	for(String str:splitString) {
		if(str.contains(string2)) {
			str = str.replace("to", "");
			System.out.println(str);
			newString = newString +str+ " ";
		}else {
			newString=newString+str+" ";
		}
	}
	return newString;
}

// s1.replace("to","");



}
