package question205;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class isomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="ab";
    String t="ca";
		System.out.println(isIsomorphic(s,t));

	}

    public static boolean isIsomorphic(String s, String t) {
        
    	HashMap<Character,ArrayList<Integer>> mapS=new HashMap<Character,ArrayList<Integer>>();
    HashMap<Character,ArrayList<Integer>> mapT=new HashMap<Character,ArrayList<Integer>>();
   for(int i=0;i<s.length();i++)
   {
	   if(!mapS.containsKey(s.charAt(i)))
	   {
		   ArrayList<Integer> l=new ArrayList<Integer>();
		   l.add(i);
		   mapS.put(s.charAt(i), l); 
	   }
	   else
	   {
		   mapS.get(s.charAt(i)).add(i);
		   mapS.put(s.charAt(i), mapS.get(s.charAt(i)));
	   }
	   if(!mapT.containsKey(t.charAt(i)))
	   {
		   ArrayList<Integer> h=new ArrayList<Integer>();
		   h.add(i);
		   mapT.put(t.charAt(i), h);
	   }	 
	   else
	   {
		   mapT.get(t.charAt(i)).add(i);
		   mapT.put(t.charAt(i), mapT.get(t.charAt(i)));
	   }
   }
   System.out.println(mapS.values());
   System.out.println(mapT.values());
//   Object[] a=mapS.values().toArray();
//   Object[] b=mapT.values().toArray();
   System.out.println(mapT.values().containsAll(mapS.values()));
   if( mapS.values().containsAll(mapT.values()) && mapT.values().containsAll(mapS.values()) )
   {
    	   return true;
   }
   return false;   
   
   
        
    }
}
