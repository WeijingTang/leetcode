package question479;

public class LargestPaliProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println(largestPalindrome(2));
	}
	
    public static int largestPalindrome(int n) {
    	
    	    String product="";int largest=0;
    	    double start = Math.pow(10, n-1);
    	    double end = Math.pow(10, n);
    	    for(int i= (int)start; i<end;i++)
    	    {
    	    	   for(double j=i+1;j>i && j<end;j++)
    	    	   {
    	    		   product= (int)(i*j)+"";
    	    		   boolean check = true;
    	    		   for(int k=0;k<product.length();k++)
    	    		   {
    	    			   if(product.charAt(k)!=product.charAt(product.length()-(int)k-1) )
    	    			   {
    	    				   check=false;
    	    			   }
    	    			   
    	    		   }
    	    		   if(check==true)
    	    		   {
    	    			   if(i*j>largest)
    	    			   largest=(int)(i*j);
    	    		   }
    	    	   }
    	    }
    	    return largest%1337;
        
    }
    
    public int LargestPalindrome(int n) {
        
        long max = (long)Math.pow(10, n) - 1;
       long min = max / 10;
       for (long left = max; left > min; left--) {
           long right = Long.parseLong(new StringBuilder("" + left).reverse().toString());
           long target = left * (max + 1) + right;
           for (long i = max; i * i >= target; i--) {
               if (target % i == 0) {
                   return (int)(target % 1337);
               }
           }
       }
       return 9;
       
   }

}
