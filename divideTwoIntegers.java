package question29;

import java.math.BigInteger;
import java.math.BigDecimal;

public class divideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=-2147483648;
     System.out.println(Math.sqrt(6));
     System.out.println(divide(a,-1));
		
	}
	
    public static int divide(int dividend, int divisor) {
//    	Integer.MAX_VALUE =  2147483647
//    	Integer.MIN_VALUE = -2147483648
       
    	   if(dividend==Integer.MAX_VALUE && divisor==(-1))
    	   {
    		   return Integer.MAX_VALUE;
    	   }
    	   int count=0;
         int dent=Math.abs(dividend);
         int sor=Math.abs(divisor);
        while(dent>=sor)
        {  	  
        		   count++;
        		   dent-=sor;  	  
        }
        
        if(dividend*divisor>0)
        {
        return count;
        }
        else if(dividend*divisor<0)
        {
            return (-1)*count;
        }
        else
        {
             return 0;   
        }
        
    }
	

}
