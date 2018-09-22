package question374;

public class GuessNumberHigherOrLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static int guessNumber(int n) {
        
        int i=0,j=n;
        while(i<j)
        {
        	    int mid=i+(j-i)/2;
        	    if(guess(mid)==0)
        	    {
        	    	   return mid;
        	    }
        	    else if(guess(mid)==1)
        	    {
        	    	   i=mid+1;
        	    }
        	    else
        	    {
        	    	  j=mid;
        	    }
        	
        }
        return 0;
        
    }
}
