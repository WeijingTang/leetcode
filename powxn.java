package question50;

public class powxn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=myPow(2.000,10);
        System.out.println(a);
	}
	
    public static double myPow(double x, int n) {
    	
    	int i=0;double a=1;
    while(i<n)
    {
    	    a=a*x;
    	    i++;
    }
    return a;
        
    }

}
