package question349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class intersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a= {1,2,3};
    List<Integer> n1=new ArrayList(Arrays.asList(a));
    List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());//***
    for(int i=0;i<list.size();i++)
    {
    	    System.out.println(list.get(i));
    }
	}
	
    public static int[] intersection(int[] nums1, int[] nums2) {
    	
    	    List<Integer> n1=Arrays.stream(nums1).boxed().collect(Collectors.toList());
    	    List<Integer> n2=Arrays.stream(nums2).boxed().collect(Collectors.toList());
    	    List<Integer> r=new ArrayList<Integer>();
    	    for(int i=0;i<n1.size();i++)
    	    {
    	    	   if(n2.contains(n1.get(i)))
    	    	   {
    	    		   if(!r.contains(n1.get(i)))
    	    		   {
    	    		      r.add( n1.get(i) );
    	    		   }
    	    	   }
    	    }
    	    int[] rr=r.stream().mapToInt(Integer :: intValue).toArray();
        return rr;
    }

}
