package question66;

import java.math.BigInteger;
import java.util.Arrays;

public class plusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Integer.toBinaryString(343);
		int[] digit= {9};
		int[] result=plusOne(digit);
	//	int[] newArray= {0};
		//System.arraycopy(digit, newArray.length, newArray, 0, 2);
		//System.arraycopy(newArray, 0, digit, 0,digit.length);
//		int[] fun ={0,1,2,3,4,5,6};
//		System.arraycopy(fun,0,fun,4,4);
//		for(int i=0;i<fun.length;i++)
//		{
//			System.out.println(fun[i]);
//		}
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
	

    public static int[] plusOne(int[] digits) {
    	
    	int[] r=new int[digits.length+1];
    	int[] newD=new int[digits.length+1];
    	newD[digits.length]=1;
    int[] digits1=new int[digits.length+1];
    for(int i=1;i<digits.length;i++)
    {
    	   digits1[i]=digits[i-1];
    }
    
    
    for(int i=0;i<digits.length;i++)
    {
    	  if(digits1[digits.length-i]+newD[digits.length-i]>9)
    	  {
    		  r[digits.length-i]=0;
    		  newD[digits.length-i-1]=1;
    	  }
    	  else
    	  {	  
    		  r[digits.length-i]=digits1[digits.length-i]+newD[digits.length-i];
    		  newD[digits.length-i-1]=0;
    	  }
    	  
    }
    if(r[0]==0)
    {
    	  int[] newArray=Arrays.copyOfRange(r, 1, r.length);
    	  return newArray;
    }
    
    	return r;
    
    }
}
