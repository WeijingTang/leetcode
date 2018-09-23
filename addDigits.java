package question258;

public class addDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=38;
     System.out.println(addDigits(num));
		
	}
	
    public static int addDigits(int num) {
        
    	    String a=Integer.toString(num);
    	    int b=0;
    	    for(int i=0;i<a.length();i++)
    	    {
    	    	   b=b+Character.getNumericValue(a.charAt(i));
    	    }
    	    if(b<10)
    	    {
    	    	  return b;
    	    }
    	    else
    	    {
    	    	  return addDigits(b);
    	    }
    	
    }

}
