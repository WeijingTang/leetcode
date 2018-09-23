package question118;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> r=generate(5);
        for(List<Integer> i : r)
        {
        	  System.out.println(i);
        }
	}
	
    public static List<List<Integer>> generate(int numRows) {
    	    List<List<Integer>> r=new ArrayList<List<Integer>>();
    	    List<Integer> a=new ArrayList<Integer>();a.add(1);
    	    List<Integer> aa=new ArrayList<Integer>();aa.add(1);aa.add(1);
     	if(numRows==0)
     	{
     		List<Integer> zero=new ArrayList<Integer>();zero.add(0);
     		r.add(zero);
     	}
     	else if(numRows==1)
     	{
     	    r.add(a);
     	}
     	else if(numRows==2)
     	{
     	r.add(a);r.add(aa);
     	}
     	else
     	{
     	 r.add(a);r.add(aa);
     	int i=0;
    	    while(i<numRows-2)
    	    {
    	    	   int j=0;
    	    	   List<Integer> aaa=new ArrayList<Integer>(); aaa.add(1);
    	    	   while(j<r.get(r.size()-1).size()-1)
    	    	   {
    	    		   int item=r.get(r.size()-1).get(j)+r.get(r.size()-1).get(j+1);
    	    		   aaa.add(item);
    	    		   j++;
    	    	   }
    	    	   aaa.add(1);
    	    	   r.add(aaa);
    	    	   i++;
    	    }
     	}
         return r; 
    }

}
