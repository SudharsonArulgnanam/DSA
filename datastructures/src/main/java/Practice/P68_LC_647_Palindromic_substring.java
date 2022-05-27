package Practice;

import org.junit.Test;

public class P68_LC_647_Palindromic_substring {
	
	
	@Test
	public static void main(String args[]) {
		
		String s = "abc";
		System.out.println(countSubstrings(s));
		
	}
	

    public static int countSubstrings(String s) {
        
        if(s.length()==0) return 0;
        int len =s.length();
        int output =0;
        char[] ch =s.toCharArray();
        
        for(int i=0;i<len;i++){
            output = output + isPalindrome(i,i,ch);
            output = output + isPalindrome(i,i+1,ch);
        }
        return output;
        }
        
    
    public static int isPalindrome(int s,int e,char[] c)
    {
        int count=0;
        while(s>=0 && e<c.length && c[s--]==c[e++])
            count++;
        
        return count;
    }
    

}
