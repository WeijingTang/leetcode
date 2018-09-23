package question49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
                            /*USE HASHMAP*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    List<String> a=new ArrayList<String>();
//    a.add("a");a.add("b");a.add("c");
//    List<String> b=new ArrayList<String>();
//		b.add("c");b.add("b");b.add("a");
//	String mm="abafda";
//	char[] charArray = mm.toCharArray();
//	Arrays.sort(charArray);
//		System.out.println(charArray[5]);
		String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
		HashMap<Integer, List<String>> hmap = new HashMap<Integer, List<String>>();
		List<String> a=new ArrayList<String>();a.add("mm");a.add("jj");
		hmap.put(12, a);
	    System.out.println(hmap.get(12));

	}
	
    public static List<List<String>> groupAnagrams(String[] strs) {
    	
    	ArrayList<String> list=new ArrayList<String>();
    	List<List<String>> result=new ArrayList<List<String>>();
    	for(int i=0;i<strs.length;i++)
    	{
    		char[] arr=strs[i].toCharArray();
    		Arrays.sort(arr);
    		String st=String.valueOf(arr);
    		if(!list.contains(st))
    		{
    			list.add(st);			
    		}    		
    	}
   // 	System.out.println( list.get(2) );
    		for(int j=0;j<list.size();j++)
    		{
    			List<String> b=new ArrayList<String>();
    			for(int i=0;i<strs.length;i++)
    	    	    {
    	    		   char[] anew=strs[i].toCharArray();
    	    		   Arrays.sort(anew);
    	    		   String set=String.valueOf(anew);
    			   if(set.equals(list.get(j)))
    			   {
    				b.add(strs[i]);
    			   }
    	    	    }
    			result.add(b);
    		}
   
    	    return result;
        
    }

}
