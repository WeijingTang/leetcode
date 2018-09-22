package question342;

public class powerOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=(int)(Integer.MAX_VALUE/4);
		max=max*4;//Math.log(536870912)/Math.log(2)
		
		System.out.println(isPowerOfFour(16));
		
	}
	
    public static boolean isPowerOfFour(int num) {
    	
    	 int a=(int)(Math.log(Integer.MAX_VALUE)/Math.log(4));
    	 int maxPow=(int)(Math.pow(4, a));
    	 if(num==1)
    	 {
    		 return true;
    	 }
    	 if(num==536870912)
    	 {
    		 return false;
    	 }
    	 return (num>3 && maxPow%num==0 && (Math.log(num)/Math.log(4))%2!=1 );
    	
    }

}
