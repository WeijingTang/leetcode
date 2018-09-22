package question326;

public class powerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.ceil(Math.log(243)/Math.log(3))+" "+Math.floor(Math.log(243)/Math.log(3)) );
       System.out.println(isPowerOfThree(25)); 
	}
	
    public static boolean isPowerOfThree(int n) {
        
    	int maxPow = (int)(Math.pow(3, (int)(Math.log(Integer.MAX_VALUE) / Math.log(3))));
        return (n > 0 && maxPow % n == 0);
        
    }

}
