package question27;
import java.util.ArrayList;


public class removeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {2,2,3,3};
		int a=removeElement(nums, 3);
		System.out.println(a);
	}
	
    public static int removeElement(int[] nums, int val) {
    	
    	ArrayList<Integer> a=new ArrayList<Integer>();
    	for(int i=0;i<nums.length;i++)
    	{
    		if(nums[i]!=val)
    		{
    			a.add(nums[i]);
    			System.out.println(nums[i]);
    		}
    	}
     
      return a.size();  
    }

}
