package question15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class threeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums= {-1, 0, 1, 2, -1, -4};
		int[] nums= {-4, -1,-1, 0, 1, 2};
		List<List<Integer>> a=threeSum(nums);
		System.out.println(a);
	}
	
    public static List<List<Integer>> threeSum(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	for(int i=0;i<nums.length;i++)
    	{
    		
    		int a=nums[i];
    		
    		for(int j=i+1;j<nums.length;j++)
    		{
    			int b=nums[j];
    			
    			for(int l=j+1;l<nums.length ; l++)
    			{
    				int c=nums[l];
    				if(a+b+c==0)
    				{
    					List<Integer> r=new ArrayList<Integer>();
    					r.add(a);r.add(b);r.add(c);
    					//System.out.println(a+" "+b+" "+c);
    					if(!result.contains(r))
    					{
    					result.add(r);
    					}
    				}
    			}
    		}
    	}
    	
    	return result;
        
    }
    
   

}
