package question461;

public class hammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=hammingDistance(1,4);
		System.out.println(result);

	}
	
    public static int hammingDistance(int x, int y) {
    	   
    	    String xx=Integer.toBinaryString(x);
    	    String yy=Integer.toBinaryString(y);
    	    String repeated="";
    	    int	len=Math.abs(xx.length()-yy.length()); 
   	    repeated = new String(new char[len]).replace("\0", "0");
    	    if(xx.length()>=yy.length())
    	    {  
    	     yy=repeated+yy;
    	    	}
    	    else
    	    {
    	    	 xx=repeated+xx;
    	    }
    	    int count=0;
    	    for(int i=0;i<xx.length();i++)
    	    {
    	    	  if(xx.charAt(i)!=yy.charAt(i))
    	    	  {count=count+1;}
    	    }
    	    return count;
        
    }

}
