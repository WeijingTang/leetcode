package question152;

public class maximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] nums= {-2,3,-4};
   int r = MaxProduct(nums);
    System.out.println(r);
	}
	
    public static int maxProduct(int[] nums) {
    	
    	     
    	      if(nums.length==1)
    	    	  return nums[0];
    	     
    	      for(int i=1;i<nums.length;i++)
    	      {
    	    	     if(nums[i]<0 && nums[i-1]<0)
    	    	     {
    	    	    	    int temp=nums[i]*nums[i-1];
    	    	    	    nums[i]=temp;
    	    	    	    nums[i-1]=0;
    	    	     }
    	      }
    	      int sum=1,max=0;
    	      for(int i=0; i<nums.length;i++)
    	      {
    	    	     sum=sum*nums[i];
    	    	     if(sum>max)
    	    	     {
    	    	    	    max=sum;
    	    	     }
    	    	     else if(nums[i]<=0)
    	    	     {
    	    	    	    sum=1;
    	    	     }
    	      }
    	      return max;     
    }
    
    public int axProduct(int[] A) 
    {
        if (A == null || A.length == 0) {
            return 0;
        }
        int[] f = new int[A.length];
        int[] g = new int[A.length];
        f[0] = A[0];
        g[0] = A[0];
        int res = A[0];
        for (int i = 1; i < A.length; i++) {
            f[i] = Math.max(Math.max(f[i - 1] * A[i], g[i - 1] * A[i]), A[i]);
            g[i] = Math.min(Math.min(f[i - 1] * A[i], g[i - 1] * A[i]), A[i]);
            res = Math.max(res, f[i]);
        }
        return res;
      }
    
    static int MaxProduct(int[] A)
    {
    	   if(A==null || A.length==0)
    	   {
    		   return 0;
    	   }
    	   int[] a=new int[A.length];
    	   int[] b=new int[A.length];
    	   a[0]=A[0];
    	   b[0]=A[0];
    	   int r=A[0];
    	   for(int i=1;i<A.length;i++)
    	   {
    		  a[i]=Math.max(Math.max(a[i-1]*A[i], b[i-1]*A[i]), A[i]);
    		  b[i]=Math.min(Math.min(a[i-1]*A[i], b[i-1])*A[i], A[i]);
    		  System.out.println(Math.max(a[i-1]*A[i], b[i-1]*A[i])+" "+a[i]);
    		  r=Math.max(r, a[i]);
    	   }
    	   return r;
    }

}
