package question67;

import java.util.Collections;

public class addBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="1";
		String b="111";
		System.out.println(addBinary(a,b));
//		String m=String.join("", Collections.nCopies(3, "0"));
//		System.out.println(m);

	}
	
    public static String addBinary(String a, String b) {
    	
    	     int length=Math.max(a.length(), b.length());
    	     if(a.length()>b.length())
    	     {  
    	    	    b= String.join("", Collections.nCopies((a.length()-b.length()), "0"))+b;
    	     }
    	     else
    	     {
    	    	    a=String.join("", Collections.nCopies((b.length()-a.length()), "0"))+a;
    	    	  //  System.out.println(a);
    	     }
    	     int put=0;
    	     String result="";
    	     for(int i=0;i<length;i++)
    	     {
    	    	     String l="";
    	    	     if( Character.getNumericValue( a.charAt(a.length()-1-i) ) + Character.getNumericValue( b.charAt(b.length()-1-i) +put )==2 )
    	    	     {
    	    	    	     l=0+"";
    	    	    	     put=1;
    	    	    	    
    	    	     }
    	    	     else if(Character.getNumericValue( a.charAt(a.length()-1-i) ) + Character.getNumericValue( b.charAt(b.length()-1-i) +put )==1)
    	    	     {
    	    	    	     l=1+"";
    	    	    	     put=0;
    	    	    	    
    	    	     }
    	    	     else if(Character.getNumericValue( a.charAt(a.length()-1-i) ) + Character.getNumericValue( b.charAt(b.length()-1-i) +put )==3)
    	    	     {
    	    	    	     l=1+"";
    	    	    	     put=1;
    	    	    	     
    	    	     }
    	    	     else
    	    	     {
    	    	    	     l=0+"";
    	    	    	     put=0;
    	    	    	     
    	    	     }
    	    	     result=l+result;
    	    	   //  System.out.println(result+" r");
    	    	  }
    	     if(put==1)
    	     {
    	     return 1+result;
    	     }
    	     else
    	     {
    	    	 return result;
    	     }
        
    }

}
