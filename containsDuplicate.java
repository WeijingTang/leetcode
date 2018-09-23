package question219;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,1,5};
		 Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		 System.out.println( containsNearbyDuplicate(nums,3) );

	}
	
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
    	
    	 Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		 for(int i=0;i<nums.length;i++)
		 {  
			 if(map.containsKey(nums[i]))
			 {
				 if( i-map.get(nums[i])<=k )
				 {
					 System.out.println(i+" "+map.get(nums[i]));
					 return true;
				 }
			 }
			 map.put(nums[i],i);
		 }
		 return false;
        
    }

}
