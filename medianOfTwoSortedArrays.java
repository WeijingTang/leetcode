package question4;

import java.util.ArrayList;
import java.util.Arrays;

public class medianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {1,2,3,7};
       int[] b= {3,5,7,9,11};
       //double result=findMedianSortedArrays(a,b);
       String repeated = new String(new char[3]).replace("\0", "*");
       System.out.println(Math.max(5,9));
	}
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
    	   double[] list=new double[nums1.length+nums2.length];
    	   for(int i=0;i<nums1.length+nums2.length;i++)
    	   {
    		   if(i<nums1.length)
    		   {
    			   list[i]=(nums1[i]);
    		   }
    		   if(i>=nums1.length)
    		   {
    			   list[i]=nums2[i-nums1.length];
    		   }
    	   }
    	   Arrays.sort(list);
    	   if( (nums1.length+nums2.length)%2==0 )
    	   {
    		   return ( list[(nums1.length+nums2.length)/2-1]+list[(nums1.length+nums2.length)/2] )/2.0;
    	   }
    	   else
    	   {
    		   return list[(nums1.length+nums2.length-1)/2];
    	   }
    	
    }

}
