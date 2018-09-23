package question28;

public class implementStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="aa";
		System.out.println(strStr(a,"aa"));

	}
	
    public static int strStr(String haystack, String needle) {
    	
    	int len=needle.length();
    	for(int i=0;i<haystack.length()-len+1;i++)
    	{
    		System.out.println(haystack.substring(i, i+len)+" "+needle);
    		if(haystack.substring(i, i+len).equals(needle))
    		{
    			return i;
    		}
    	}
   return -1;
        
    }

}
