package question35;

public class searchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int searchInsert(int[] nums, int target) {
       if(nums.length==0)
       {
    	      return 0;
       }
       int count=0;
    	  for(int i=0;i<nums.length;i++)
    	  {
    		if(nums[i]>=target)
    		{
    			return i;
    		}
    		else
    		{
    			count++;
    		}
    		
      }
    	  if(count==nums.length)
    	  {
    		  return nums.length;
    	  }
    	  return 0;
    }

}
