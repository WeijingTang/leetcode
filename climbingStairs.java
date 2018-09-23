package question70;

import java.math.BigInteger;
import java.util.ArrayList;

public class climbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=35;
		System.out.println(climbStairs(n));

	}

    public static int climbStairs(int n) {
        //compare the result of some different combination
        
        int numOfTwo=0;
        if(n%2==0)
        {
        	   numOfTwo=n/2;
        }
        else
        {
        	   numOfTwo=(n-1)/2;
        }
        int result=0;
	  //  System.out.println(numOfTwo+" not");
	  //  int spots=numOfTwo+n-numOfTwo*2;
         for(int i=0;i<=numOfTwo;i++)
        {
        	    //#total spot: i+n-i*2, choose spot: i
        	    int count=0;
        	   // int spots=i+n-i*2;
        	   // int total=1;
        	    BigInteger total = BigInteger.valueOf(1);
        	    BigInteger spots = BigInteger.valueOf(i+n-i*2);
        	    BigInteger one= BigInteger.valueOf(1);
        	    while(count<i)
        	    {
        	    	   total=total.multiply(spots);
        	    	   System.out.print(spots+" * "+total+" ");
        	    	   spots=spots.subtract(one);
        	    	   count=count+1;  	    	  
        	    }
        	    System.out.println();
        //	    System.out.println(total+" total "+i);
        	   // int choose=1;
        	   // int c=i;
        	    BigInteger choose = BigInteger.valueOf(1);
        	    BigInteger c= BigInteger.valueOf(i);
        	    
        	    while(c.intValue()>0)
        	    {
        	    	   choose=choose.multiply(c);
        	    	 //  choose=choose.multiply(c);
        	    	   System.out.print(c+" ^ ");
        	    	   c=c.subtract(one);
        	    	   
        	    }
        	    System.out.println();
        //	    System.out.println(choose+" choose "+i);
        	   // int num=0;
        	    BigInteger num= BigInteger.valueOf(0);
        	    if(i==0)
        	    {num=one;}
        	    else
        	    {
        	     num=total.divide(choose);
        	    }
        	    System.out.println(num+" num "+i);
        	   result=result+num.intValue();
        	  // System.out.println(result);
        }
         
        return result;
       
    }
	
}
