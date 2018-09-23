package question58;

public class lengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="     ";
		System.out.println(lengthOfLastWord(s));

	}
	
    public static int lengthOfLastWord(String s) {
        
    	    boolean check=false;
    	    for(int i=0;i<s.length();i++)
    	    {
    	    	   if(s.charAt(i)!=' ')
    	    	   {
    	    		   check=true;
    	    	   }
    	    }
    	    if(check==false)
    	    {
    	    	   return 0;
    	    }
    	    else
    	    {
        String[] splited = s.split(" ");
        return splited[splited.length-1].length();
        }
        
    }

}
