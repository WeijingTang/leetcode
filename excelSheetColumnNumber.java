package question171;

import java.util.HashMap;
import java.util.Map;

public class excelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=titleToNumber("AAA");
		System.out.println(a);
	}

    public static int titleToNumber(String s) {
    	
    	final Map<Character, Integer> map=new HashMap<>();
    	for (char c = 'A'; c <= 'Z'; c++) 
    	{
      	map.put(c, c-'A'+1);
    }
    	int val=0;
    	for(int i=0;i<s.length();i++)
    	{
    		val=val+map.get( s.charAt(i) )*(int)Math.pow(26, s.length()-i-1);
    	}
     	
        return val;
    }
}
