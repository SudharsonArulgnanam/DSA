package Practice;

import java.util.Arrays;

public class P50_LC_34_First_and_Last_Position_inSortedArray {
    
    public static void main(String args[]){
        int nums[] = {5,7,7,8,8,10};
		int target =8;
		int[] nums1 = searchRange(nums,target);
		System.out.print(Arrays.toString(nums1));
    }
    public static int[] searchRange(int[] nums, int target) {
        
		// TODO Auto-generated method stub
		int left=0,right=0,start=-1,end=-1;
        
        if(nums.length<1) 
            return new int[] {start,end};
            
        
		while(right<nums.length) {
			if(nums[right]==target && nums[left]==target) {
                start=left;
                end=right++;
            }else {	
                left++;
				right++;
			}
        }
        if (start==-1 && end==-1){
            return new int[] {start,end};
        }
        return new int[] {start,end};
		
		
	
        
    }
    
    
    
    /*
     * public static int[] searchRange(int[] nums, int target) {
	Map<Integer,Integer>  map = new HashMap<Integer,Integer>();
	Map<Integer,Integer>  map2 = new HashMap<Integer,Integer>();
	
	for(int i=0;i< nums.length;i++) {
		
		if(map.containsKey(nums[i]) && nums[i]== target) {
			for(int j=i;j<nums.length;j++) {
				map2.put(nums[j], j);
			}
			return new int[] {map.get(nums[i]),map2.get(nums[i])};
		}
		
		map.put(nums[i], i);
	}
        if(map.containsKey(target)) return new int[] {map.get(target),map.get(target)};
	return new int[] {-1,-1};
}
     * 
     * 
     * 
     * 
     */
}
