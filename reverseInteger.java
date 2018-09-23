package question7;

public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=reverse(1534236469);
		System.out.println(a);
	}
	
    public static int reverse(int x) {
        String a=Math.abs(x)+"";int b=0;
        if(a.length()==1)
        {return x;}
        if(a.length()>=10)
        {return 0;}
        for(int i=0;i<a.length();i++)
        {
        	  char add=a.charAt(a.length()-1-i);
        	  b=(b+Character.getNumericValue(add)*(int) Math.pow(10, a.length()-1-i));
        }
        
        if(x<=0)
        {
        	  b=(-1)*b;
        }
        
        return b;
        
    }
}
