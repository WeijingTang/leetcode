package question268;

import java.util.Arrays;

public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int missingNumber(int[] nums) {
    	
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length-1;i++)
    	{
    		if(nums[i+1]-nums[i]!=1)
    		{
    			return nums[i]+1;
    		}
            
    	}
       
        if(nums[0]==1)
        {
            return 0;
        }
        return nums[nums.length-1]+1;
    }

}
