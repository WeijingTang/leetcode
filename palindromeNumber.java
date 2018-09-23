package question9;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=89790079;
        boolean check=isPalindrome(11244211);
		System.out.println(check);
	}
	
    public static boolean isPalindrome(int x) {
        
      	boolean judge=false;
        String a=x+"";int count=0;int len=0;
        if(a.length()%2==0)
        {
        	   len=a.length()/2;
        }
        else
        {
        	   len=(a.length()-1)/2;
        }
       
        for(int i=0;i<len;i++)
        {
        	  if(a.charAt(i)==a.charAt(a.length()-1-i))
        	  {
        		  count++;
        	  }
        }
       // System.out.println(count);
        if(count==len || len==0)
        {
        	  judge=true;
        }
        return judge;
    }

}
