package question198;

public class houseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] nums= {4,1,2,7,5,3,1};
     System.out.println(rob(nums));
	}
	
    public static int rob(int[] nums) {
    	   
    	if(nums.length==1)
    {
            return nums[0];
     }
    if(nums.length==2)
    {
            return Math.max(nums[0],nums[1]);
    }
    	  int largest=0;
      for(int step=2;step<nums.length;step++)
      {
    	     for(int start=0;start<step;start++)
    	     {
    	    	     int i=start,r=0; 
    	    	     while(i<nums.length)
    	    	     {
    	    	    	    r=r+nums[i];
    	    	    	    i=i+step;
    	    	     }
    	    	//     System.out.println(r);
    	    	     if(r>largest)
    	    	     {
    	    	    	   largest=r;
    	    	     }
    	     }
      }
     return largest;
        
    }
    
    public int Rob(int[] num) {
        int rob = 0; //max monney can get if rob current house
        int notrob = 0; //max money can get if not rob current house
        for(int i=0; i<num.length; i++) {
            int currob = notrob + num[i]; //if rob current value, previous house must not be robbed
            notrob = Math.max(notrob, rob); //if not rob ith house, take the max value of robbed (i-1)th house and not rob (i-1)th house
            rob = currob;
        }
        return Math.max(rob, notrob);
    }

}
