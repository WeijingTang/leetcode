package question11;

public class containerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*1 8 6 2 5 4 8 3 7*/
		int[] height= {1 ,1};
		int result=maxArea(height);
		System.out.println(result);
		
	}

    public static int maxArea(int[] height) 
    {
        //return area
    	   int area=0;int largest=0;
    	   for(int i=0;i<height.length;i++)
    	   {
    		   for(int j=0;j<height.length;j++)
    		   {
    			   if(i!=j)
    			   {
    				   area=Math.min(height[i],height[j])*Math.abs(i-j);
    				   if(area>largest)
    				   {largest=area;}
    			   }
    		   }
    	   }
    	   return largest;
    }
	
	
}
