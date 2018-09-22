package question387;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class firstUniqueCharInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="loveleetcode"; 
	 System.out.println(firstUniqChar(s));
	}
	
    public static int firstUniqChar(String s) {
    	
   // 	 char[] chars=s.toCharArray();//array to list function?
   // 	 List<Character> list=s.chars().mapToObj(e->(char)e).collect(Collectors.toList());
    	// List<Entry<Character,Integer>> l=new ArrayList<Entry<Character,Integer>>();
    	 Map<Character,Integer> map=new HashMap<Character,Integer>();
    	 for(int i=0;i<s.length();i++)
    	 {
    		 if(!map.containsKey(s.charAt(i)))
    		 {
    			 
    			 map.put(s.charAt(i), 1);
    		 }
    		 else
    		 {
    			 map.put(s.charAt(i), map.get(s.charAt(i))+1);
    		 }
    	 }
   // 	 System.out.println(map.entrySet());
    	 for(int i=0;i<s.length();i++)
    	 {
    		
    		 if(map.get(s.charAt(i))==1)
    		 {
    			 return i;
    		 }
    	 }
    	 return -1;
        
    }

}
