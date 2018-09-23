package question53;

public class maximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums)
	{
		int largest=nums[0];
		for(int i=0;i<nums.length;i++)
		{
			int j=i,lf=0;
			while(j<nums.length)
			{	
				lf=nums[j]+lf;
				if(lf>largest)
				{largest=lf;}
				j=j+1;
			}
			
		}
		return largest;
	}

}
