package question6;

import java.util.ArrayList;

public class zigzagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="PAYPALISHIRING";
      
       String result=convert(a,3);
       System.out.println(result);
	}
	
    public static String convert(String s, int numRows) 
    {
    	 String result="";
    	 double oneTurn=numRows+numRows-2;
    	 double len=Math.ceil(s.length()/oneTurn)*(1+(oneTurn-numRows));
    	
    	 String[] list=new String[numRows];
    	 for(int i=1;i<numRows-1;i++)
    	 {
    		
    		 int countE=2*(numRows-2);
    		 int countO=2;int num=i;
    		double j=1;
    		list[i]="";
    		while(num<s.length() && j<len)
    		{
    			//System.out.println(num+"__*");
    			if(j%2==1)
    			{
    			
    			list[i]=list[i]+s.charAt(num);
    			if(countE>countO)
    			{countE=countE-2;}
    			num=num+countE;
    			}
    			if(j%2==0)
    			{
    			
    			list[i]=list[i]+s.charAt(num);
    			if(countO<countE)
    			{countO=countO+2;}
    			num=num+countO;
    			}
    			j=j+1;
    		}
	    result=result+list[i];
	  
    	 }
    	 String firstLine="";
    	 String lastLine="";
    	 int n=0;
    	 
    		 while(n<s.length())
    		 {    		 
    		// System.out.println(n+" &");
    		 firstLine=firstLine+s.charAt(n);
    		 n=n+2*(numRows-1);
    		 }
    		 int n1=numRows-1;
    		 while(n1<s.length())
    		 {
    		 lastLine=lastLine+s.charAt(n1);
    		 n1=n1+2*(numRows-1);
    		 }
    		
    	    result=firstLine+result+lastLine;
    	 
    	 return result;       
    }

}
