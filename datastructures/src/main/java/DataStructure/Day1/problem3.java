package DataStructure.Day1;

import java.util.Arrays;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {0,1,0,3,12};
		int count=num.length;
		for(int i=count-1; i<num.length;i--)
		{
			if(num[i]!=0)
			num[--count]=num[i];
			if(i==0)
				break;
		}
		
		
		for(int i=count-1;i>=0;i--)
		{
			num[i]=0;
		}
		System.out.println(Arrays.toString(num));
	}

	}

