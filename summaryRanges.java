package question228;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,2,4,5,7};
		List<String> r=summaryRanges(nums);
		for(int i=0;i<r.size();i++)
		{
			System.out.println(r.get(i));
		}
	}
	
    public static List<String> summaryRanges(int[] nums) {
    	
    	List<String> r=new ArrayList<String>();
    	List<List<Integer>> l=new ArrayList<List<Integer>>();
    	ArrayList<Integer> a=new ArrayList<Integer>();
    	if(nums.length==0)
    	{
    		return r;
    	}
    	int i=0;
    	a.add(nums[0]);
    	while(i<nums.length-1)
    	{
    		if(nums[i]==nums[i+1]-1)
    		{
    			a.add(nums[i+1]);
    		}
    		else
    		{
    			System.out.println(a);
    			l.add(a);
    			a=new ArrayList<Integer>();
    			a.add(nums[i+1]);
    		}
    	    i++;
    	}
    	l.add(a);
    	
    	for(int j=0;j<l.size();j++)
    	{
    		String h=l.get(j).get(0)+"";
    		if(l.get(j).size()>1)
    		{
    			h=h+"->"+l.get(j).get(l.get(j).size()-1);
    		}
    		r.add(h);
    	}
      return r;  
    }

}
