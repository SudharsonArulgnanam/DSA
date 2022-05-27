package Practice;

import java.util.Arrays;

import org.junit.Test;

public class P63_LC_238_Product_Of_array_Except_self {
	
	@Test
	public void testData() {
		
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productOfArray(nums)));
		
	}

	private int[] productOfArray(int[] nums) { 
		
	int output[] = new int[ nums.length];
    
    output[0] = 1;

    // left prefix product 
    for(int i=1;i<nums.length;i++){
         output[i] = output[i-1] * nums[i-1];
    }
    
    int product = 1;

    for(int i=nums.length-1;i>=0;i--){
        
        output[i] = output[i] * product;
        
        product*= nums[i];
    }
    
    return output;
    }

}
