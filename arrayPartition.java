package question561;

import java.util.Arrays;

public class arrayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr= {1,4,3,2,8,9};
	int result=arrayPairSum(arr);	
	System.out.println(result);	
	
	}
	
    public static int arrayPairSum(int[] nums) {
        
    	Arrays.sort(nums);
    	int sum=0;
    	for(int i=0;i<nums.length/2;i++)
    	{
    		sum=sum+nums[2*i];
    	}
    	
    	return sum;
    	
    }
	

}
