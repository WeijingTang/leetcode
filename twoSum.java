package question167;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static int[] twoSum(int[] numbers, int target) {
        
    	    int a=0,b=0;
    	    for(int i=0;i<numbers.length;i++)
    	    {
    	    	   for(int j=i+1;j<numbers.length;j++)
    	    	   {
    	    		   if(numbers[i]+numbers[j]==target)
    	    		   {
    	    			   a=i;b=j;
    	    		   }
    	    	   }
    	    }
    	    int[] r= {a+1,b+1};
    	    return r;
    }
    
    public static int[] TwoSum(int[] numbers, int target)
    {
    	     int start = 0, end = numbers.length - 1;
         while(start < end){
             if(numbers[start] + numbers[end] == target) break;
             if(numbers[start] + numbers[end] < target) start++;
             else end--;
         }
         return new int[]{start + 1, end + 1};
    }
}
