package question169;

import java.util.ArrayList;
import java.util.Arrays;

public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,3};
		//Arrays.sort(nums);
		//System.out.println(nums[nums.length-1]);
        int result= majorityElement(nums);
        System.out.println(result);
	}
	
    public static int majorityElement(int[] nums) {
    	
    	ArrayList<Integer> countArr=new ArrayList<Integer>();
    	    for(int i=0;i<nums.length;i++)
    	    {
    	    	   if(!countArr.contains(nums[i]))
    	    	   {
    	    		   countArr.add(nums[i]);
    	    	   }  	   	    	
    	    }
    	    
    	    int[] count=new int[countArr.size()];
    	    for(int i=0;i<countArr.size();i++)
    	    {
    	    	   for(int j=0;j<nums.length;j++)
    	    	   {
    	    		   if(countArr.get(i)==nums[j])
    	    		   {count[i]++;}
    	    	   }
    	    	//   System.out.println(countArr.get(i)+" *");
    	    }
    	   
    	    int index=0,largest=0;
    	    for(int i=0;i<count.length;i++)
    	    {
    	    	   if(count[i]>largest)
    	    	   {
    	    		   largest=count[i];
    	    		   index=countArr.get(i);
    	    	   }
    	    }
    	    
    	    return index;
    	    
        
    }

}
