package question347;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class topKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		h.put(3, 2);
		h.put(4,1);
		h.put(3,3);
		h.put(5,1);
		int[] nums= {4,1,-1,2,-1,2,3};
	//	for(Integer key : h.keySet())
	//	Arrays.sort(nums);
		List<Integer> r=TopKFrequent(nums,2);
		for(int i=0;i<r.size();i++)
		{
		System.out.println(r.get(i));
		}

	}
	
     public static List<Integer> topKFrequent(int[] nums, int k) {
    	 List<Integer> r=new ArrayList<Integer>();
    	 Map<Integer,Integer> h=new HashMap<Integer,Integer>();
    	 int i=0;
    	 while(i<nums.length)
    	 {
    		 if(!h.containsKey(nums[i]))
    		 {
    			 h.put(nums[i], 1);
    		 }
    		 else
    		 {
    			 h.put(nums[i], h.get(nums[i])+1);
    		 }
    		 i++;
    	 }
    	 String[] l=new String[h.keySet().size()];
    	 int j=0;
    	 for(Integer key : h.keySet())
    	 {
    		Integer value=h.get(key);
    		 String a=value+" "+key;
    		 l[j]=a;j++;
    	 }
    	 Arrays.sort(l);
    	 for(int w=0;w<Math.min(k, l.length);w++)
    	 {
      		 String[] z=l[l.length-1-w].split(" ");
    		 r.add(Integer.parseInt(z[1]));
    	 }
    	 return r;
        
    }
     
     public static List<Integer> TopKFrequent(int[] nums, int k)
     {
    	 List<Integer> r=new ArrayList<Integer>();
    	 Map<Integer,Integer> h=new HashMap<Integer,Integer>();
    	 int i=0;
    	 while(i<nums.length)
    	 {
    		 if(!h.containsKey(nums[i]))
    		 {
    			 h.put(nums[i], 1);
    		 }
    		 else
    		 {
    			 h.put(nums[i], h.get(nums[i])+1);
    		 }
    		 i++;
    	 }
    	 
   // 	 h.entrySet().stream().sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue())).forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    	 
    	 List<Entry<Integer, Integer>> l=new ArrayList<Entry<Integer, Integer>>(h.entrySet());
    	 l.sort( (k1,k2) -> k2.getValue().compareTo(k1.getValue()) );
    	 Map<Integer,Integer> rr=new LinkedHashMap<>();
    	 int min=Math.min(l.size(), k);int w=0;
     for(Entry<Integer,Integer> entry : l)
     {
    	    if(w<min)
    	    {
    	    	   r.add(entry.getKey());
    	    }
    	    rr.put(entry.getKey(), entry.getValue());
    	    w++;
     }
    
    	 return r;
     }

}
