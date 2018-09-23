package question26;

import java.util.Arrays;

import java.util.stream.IntStream;

public class removeDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,2,2};
		//Arrays.stream(nums).distinct().toArray();
		//System.out.println(nums[0]);
		int a=removeDuplicates(nums);
		System.out.println(a);
	}
	
	public static int removeDuplicates(int[] nums) {
		
		nums=Arrays.stream(nums).distinct().toArray();
		for(int i=0;i<nums.length;i++)
		{
		System.out.println(nums[i]+" *");
		}
        return nums.length;
    }

}
