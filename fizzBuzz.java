package question412;

import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=fizzBuzz(15);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
	
    public static List<String> fizzBuzz(int n) {
    	
    	List<String> result=new ArrayList<String>();
    	for(int i=0;i<n;i++)
    	{
    		if( (i+1)%3!=0 && (i+1)%5!=0 )
    		{
    			result.add((i+1)+"");
    		}
    		else if( (i+1)%3==0 && (i+1)%5!=0 )
        {
        	    result.add("Fizz");
	    }
    		else if( (i+1)%3!=0 && (i+1)%5==0 )
        {
            	result.add("Buzz");
    	    }
    		else
    		{
    			result.add("FizzBuzz");
    		}
    	}
    	return result;
    	
        
    }

}
