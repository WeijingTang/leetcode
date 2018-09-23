package question172;

import java.math.BigInteger;

public class factorialTrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	      System.out.println( TrailingZeroes(2126) );
	}
	
    public static int trailingZeroes(int n) {
        
        BigInteger reallyBig=new BigInteger("1");
        for(int i=n;i>0;i--)
        {
            BigInteger Big=new BigInteger(Integer.toString(i));
            reallyBig=reallyBig.multiply(Big);
        }
        String a=reallyBig.toString();
        System.out.println(a);
        boolean check=false;
        int count=0;
        while(check==false)
        {
        	   if(a.charAt(a.length()-1-count)!='0')
        	   {
        		   check=true;
        	   }
        	   else
        	   {
        	   count++;
        	   }
        }
        return count;
        
    }
    //method two
    public static int TrailingZeroes(int n) {
        int r = 0;
        while (n > 0) {
        	    System.out.println(n+" n");
            n /= 5;// n=n/5
            
            r += n;// r=r+n
            System.out.println(r+" r");
        }
        return r;
    }

}
