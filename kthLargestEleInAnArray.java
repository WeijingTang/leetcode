package question215;

import java.util.Arrays;

public class kthLargestEleInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] r= {3,2,1,5,6,4};
		System.out.println(findKthLargest(r,2));
	}

    public static int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        return nums[nums.length-k];
        
    }
}
