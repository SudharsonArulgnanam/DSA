package Practice;

public class P51_LC_1752_Array_Is_Sorted_and_Rotated {
    
    public static void main(String args[]){
        int[] nums ={3,4,5,1,2};
        
    }
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
        }
        
        if(count>1) return false;
        else return true;
}

}
