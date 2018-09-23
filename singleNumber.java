package question136;

public class singleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int[] array= {1,1,2,2,3,3,6};
      int a=singleNumber(array);
      System.out.println(a);
	}
	
    public static int singleNumber(int[] nums) {
    	int ans =0;
        
        int len = nums.length;
        for(int i=0;i<len;i++)
            ans ^= nums[i];
        
        return ans;
        
    }

}
