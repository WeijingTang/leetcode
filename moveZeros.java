package question283;

public class moveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,1,0,3,12};
		moveZeroes(nums);
		for(int i=0;i<nums.length;i++)
		System.out.println(nums[i]);

	}
	
	 public static void moveZeroes(int[] nums) {
	        
	        int[] temp=new int[nums.length];
	        int count=0;int countZero=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]!=0)
	            {
	                temp[count]=nums[i];
	                count++;
	            }
	            else
	            {
	                countZero++;
	            }
	        }
	        for(int i=0;i<countZero;i++)
	        {
	            temp[count+i]=0;
	        }
	        
	        for(int i=0;i<nums.length;i++)
	        {
	        	   nums[i]=temp[i];
	        }
	       
	       
	    }

}
