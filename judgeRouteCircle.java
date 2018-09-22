package question657;

public class judgeRouteCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String moves="UD";
    System.out.println(judgeCircle(moves));
		
	}
	
    public static boolean judgeCircle(String moves) {
    	
    	      int[] count=new int[4];
    	      for(int i=0;i<moves.length();i++)
    	      {
    	    	     if(moves.charAt(i)=='U')
    	    	     {
    	    	    	    count[0]++;
    	    	     }
    	    	     if(moves.charAt(i)=='D')
    	    	     {
    	    	    	    count[1]++;
    	    	     }
    	    	     if(moves.charAt(i)=='L')
    	    	     {
    	    	    	    count[2]++;
    	    	     }
    	    	     if(moves.charAt(i)=='R')
    	    	     {
    	    	    	    count[3]++;
    	    	     }
    	      }
    	      if(count[0]==count[1] && count[2]==count[3])
    	      {
    	    	    return true;
    	      }
    	      return false;
        
    }

}
