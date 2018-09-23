package question217;

import java.util.Arrays;

public class containsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums= {1};
      System.out.println( containsDuplicate(nums) );
	}
	
    public static boolean containsDuplicate(int[] nums) {
        
        boolean check=false;
        Arrays.sort(nums);
        for(int i=1; i<nums.length;i++)
        {
        	   if(nums[i]==nums[i-1])
        	   {
        		   check=true;
        	   }
        }
        return check;
        
    }

}
