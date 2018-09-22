package question383;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ransomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="fffbfg";
		String b="effjfggbffjdgbjjhhdegh";

	}
	
    public static boolean canConstruct(String ransomNote, String magazine) {
    	  
    	char[] ran=ransomNote.toCharArray();
    	char[] mag=magazine.toCharArray();
    	Map<Character,Integer> r=new HashMap<Character,Integer>();
    	Map<Character,Integer> m=new HashMap<Character,Integer>();
    	int i=0;
    	while(i<ran.length)
    	{
    		if(!r.containsKey(ran[i]))
    		{
    			r.put(ran[i], 1);
    		}
    		else
    		{
    			r.put(ran[i], r.get(ran[i])+1);
    		}
    		i++;
    	}
    	int j=0;
    	while(j<mag.length)
    	{
    		if(!m.containsKey(mag[j]))
    		{
    			m.put(mag[j], 1);
    		}
    		else
    		{
    			m.put(mag[j], m.get(mag[j])+1);
    		}
    		j++;
    	}
    	for(Character e : r.keySet())
    	{
    		if(!m.keySet().contains(e) || r.get(e)>m.get(e))
    		{
    			return false;
    		}
    	}
    	return true;
    
    }

}
