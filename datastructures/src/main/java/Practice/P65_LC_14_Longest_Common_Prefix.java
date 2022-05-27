package Practice;

public class P65_LC_14_Longest_Common_Prefix {
	
	
	public static void main(String args[]) {
		String[] str = {"flower","flow","olight"};
		System.out.println(isValid(str));
	}

	public static String isValid(String[] str) {
		
		if(str.length==0) return "";
		
		String prefix = str[0];
		
		for(int i=1;i<str.length;i++) {
			while(str[i].indexOf(prefix)!=0) {
				
				prefix = prefix.substring(0, prefix.length()-1);
			}
			
		}
		return prefix;
		
		
}
	
}
