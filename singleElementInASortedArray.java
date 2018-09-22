package question540;

public class singleElementInASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int singleNonDuplicate(int[] nums) {
    	
    	if(nums.length==1)
    	{
    		return nums[0];
    	}
    	if(nums[1]!=nums[0])
    	{
    		return nums[0];
    	}
    	for(int i=1;i<nums.length-1;i++)
    	{
    		if(i!=0 && i!=nums.length-1 && nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
    		{
    			return nums[i];
    		}
    	}
    	if(nums[nums.length-1]!=nums[nums.length-2])
    	{
    		return nums[nums.length-1];
    	}
        return 0;
    }

}
