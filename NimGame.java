package question292;

public class NimGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result=canWinNim(4);
		System.out.println(result);
	}
	/*win 1,2,3   5,6,7   9,10,11*/
	/*lose      4       8       */
	/*mod 4 decide if can win*/
    public static boolean canWinNim(int n) 
    {
    	    boolean result=false;
        if(n%4!=0)
        {result=true;}
        else
        {result=false;}
        return result;
        
    }

}
