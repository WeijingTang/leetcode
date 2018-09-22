package question557;

public class reverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a="Let's take LeetCode contest";
      System.out.println(reverseWords(a));
	}
	
    public static String reverseWords(String s) {
    	
    	String[] l=s.split(" ");
    	String r="";
    	for(String e : l)
    	{ 
    		String rr="";
    		for(int i=0;i<e.toCharArray().length;i++)
    		{
    			rr=rr+e.toCharArray()[e.toCharArray().length-1-i];
    		}
    		r=r+rr+" ";
    	}
     return r.substring(0, r.length()-1);   
    }

}
