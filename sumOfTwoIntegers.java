package question371;

public class sumOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=6;
		int b=9;
		int result=getSum(a,b);
		System.out.println(result);
	}

    public static int getSum(int a, int b) {
        
    	    return Math.addExact(a, b);
    }
}
