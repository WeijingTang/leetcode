package question202;

public class happyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isHappy(2));
	}
	
    public static boolean isHappy(int n) {
      
    	 int result=0;
    	  while(n>4)
    	  {
    	    double a=0; 
        while(n>0)
        {
        	   a=a+Math.pow(n%10,2);
        	   n=n/10;
        }
        n=(int)a;
        result=n;
        System.out.println(a);
    	  }
       if(result==1 || n==1)
       {
        return true;
       }
       else
       {
    	    return false;
       }
        
    }

}
