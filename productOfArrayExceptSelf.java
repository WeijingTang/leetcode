package question238;

import java.util.Arrays;

public class productOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums= {1,2,3,4};
       int[] result=productExceptSelf(nums);
       for(int i=0;i<nums.length;i++)
       {
    	      System.out.println(result[i]);
       }
		
	}
	
    public static int[] productExceptSelf(int[] nums) {
    	
    	   int countZero=0;
    	   for(int i=0;i<nums.length;i++)
    	   {
    		   if(nums[i]==0)
    		   {
    			   countZero++;
    		   }
    	   }
    	   int[] result=new int[nums.length];
    	   if(countZero>1)
    	   {
    		   Arrays.fill(result, 0);
    	   }
    	   else if(countZero==1)
    	   {
    		   int total=1;
    		   for(int i=0;i<nums.length;i++)
    		   {
    			   if(nums[i]!=0)
    			   {
    				   total=total*nums[i];
    			   }
    		   }
    		   for(int i=0;i<nums.length;i++)
    		   {
    			   if(nums[i]==0)
    			   {
    				   result[i]=total;
    			   }
    			   else
    			   {
    				   result[i]=0;
    			   }
    		   }
    	   }
    	   else
    	   {
    		   int t=1;
    		   for(int i=0;i<nums.length;i++)
    		   {
    			   t=t*nums[i];
    		   }
    		   for(int i=0;i<nums.length;i++)
    		   {
    			  result[i]=t/nums[i];
    		   }
    	   }
    	   return result;
    }

}
