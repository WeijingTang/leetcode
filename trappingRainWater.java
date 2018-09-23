package question42;

import java.util.ArrayList;
import java.util.Arrays;

public class trappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
      //    int[] height= {2,0,2};
          int result=trap(height);
          //Arrays.sort(height);
          
          System.out.println(result);
	}
	
    public static int trap(int[] height) {
    	 if(height.length==0 || height.length==1)
     {return 0;}
    	int[] h=new int[height.length];
    	for(int i=0;i<height.length;i++)
    	{
    		h[i]=height[i];
    	}
    	Arrays.sort(h);
    	ArrayList<Integer> heights=new ArrayList<Integer>();
    
    for(int i=0;i<height.length;i++)
    {
    	   if(!heights.contains(h[i]))
    	   {
    		 heights.add(h[i]);
       }
    }      
    
    
    	int count=0;
    	int amount=0;
    	while(count<heights.size()-1)
    	{
    		ArrayList<Integer> list=new ArrayList<Integer>();
    		//int step=heights.get(count+1)-heights.get(count);
    		for(int i=0;i<height.length;i++)
    		{
    			if(height[i]>heights.get(count))
    			{
    				list.add(i);
    				//System.out.println(i);
    			}
    		}
    		for(int i=0;i<list.size()-1;i++)
    		{
    			amount=amount+(list.get(i+1)-list.get(i)-1)*(heights.get(count+1)-heights.get(count));
    			System.out.println(list.get(i+1)+" "+list.get(i));
    		}
    		System.out.println();
    		count++; 		
    	}
    	
    	return amount;
    	
        
    }

}
