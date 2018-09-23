package question88;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3};
		int[] b= {4,5,6,7};
		merge(a,3,b,4);
	    System.out.println(a.length);

	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
//    	    int[] c = (int[]) Array.newInstance(nums1.getClass().getComponentType(), 3 + 4);
// 	    System.arraycopy(nums1, 0, c, 0, m);
// 	    System.arraycopy(nums2, 0, c, m, n);
//        Arrays.sort(c);
    	 System.arraycopy(nums2, 0, nums1, m, n);
         Arrays.sort(nums1);
    	
        
    }

}
