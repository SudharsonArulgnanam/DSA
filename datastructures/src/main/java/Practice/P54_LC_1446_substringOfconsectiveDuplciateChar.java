package Practice;

import org.junit.Test;

public class P54_LC_1446_substringOfconsectiveDuplciateChar {
	
	@Test
	public void example1() {
		String str = "leetcode";
		System.out.println(isValid(str));
	}

	private int isValid(String s) {
		// TODO Auto-generated method stub
		
		int left=0,right=1,max=0,count=1;
		
		char[] ch = s.toCharArray();
		
		 if(ch.length==0) return 0;
         if(ch.length==1) return 1;
        
		while(right<s.length()) {
			if(ch[left]==ch[right])  count++;
			else count=1;
            left++;
			right++;
            max=Math.max(max, count);
		}
		return max;
    
	}
}
/*	private int isValid(String str) {

		
		Stack<Character>  stack = new Stack<Character>();
		char[] ch = str.toCharArray();
		
		int max=0;
		
		for(int i=0;i<ch.length;i++) {
			
			if(stack.isEmpty()) {
				stack.push(ch[i]);
			}else if (stack.peek()==ch[i]) {
				stack.push(ch[i]);
				max=Math.max(max, stack.size());
			}else {
				if(stack.size()>=2) {
					stack.clear();
					stack.push(ch[i]);
				}else {
					stack.pop();
					stack.push(ch[i]);
				}
				
			}
		}
	
	return max;
	}*/
