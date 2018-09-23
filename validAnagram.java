package question242;

import java.util.Arrays;

public class validAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static boolean isAnagram(String s, String t) {
    	
    	char[] sArray=s.toCharArray();
    	char[] tArray=t.toCharArray();
    	Arrays.sort(sArray);
    	Arrays.sort(tArray);
    	if(sArray.length!=tArray.length)
    	{
    		return false;
    	}
    	else
    	{
    		for(int i=0;i<sArray.length;i++)
    		{
    			if(sArray[i]!=tArray[i])
    			{
    				return false;
    			}
    		}
    	}
    	return true;
        
    }

}
