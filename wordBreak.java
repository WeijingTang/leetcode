package question139;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] m= {"cbnm","abk","biuj","aljj"};
//		Arrays.sort(m);
//		for(int i=0;i<m.length;i++)
//		{
//			System.out.println(m[i]);
//		}
		
		//for(char c='a';c<='z';c++)
//		String a="am";
//		{
//			System.out.println('a'-a.charAt(1));
//		}
		String s = "aaaaaaaa";
		List<String> dict = new ArrayList<String>();
		dict.add("aaaa");
		dict.add("aaa");
		dict.add("aa");
		System.out.println(wordBreak(s,dict));

	}
	
    public static boolean wordBreak(String s, List<String> wordDict) {
    	
    	String[] list=new String[wordDict.size()];
    	for(int i=0;i<wordDict.size();i++)
    	{
    		list[i]=wordDict.get(i);
    	}
    	Arrays.sort(list);
    	ArrayList<String>[] group = (ArrayList<String>[])new ArrayList[26];
    	for(int i=0;i<26;i++)
    	{
    		group[i]=new ArrayList<String>();
    	}
    	System.out.println(group[2].size());
    	for(int i=0;i<list.length;i++)
    	{
    		System.out.println(list[i]+" ");
    	    group[list[i].charAt(0)-'a'].add(list[i]);    	    
    	}
    	int count=0;
    	while(count<s.length())
    	{
    		System.out.println(count+" c");
    		ArrayList<String> b=group[s.charAt(count)-'a'];
    		System.out.println(b+" b");
    		int c=0,cl=0;
    		for(int i=0;i<b.size();i++)
    		{
    			int len=b.get(i).length();
    			System.out.println(len+" l "+ (count+len)+" cl");
    			if(count+len<=s.length())
    			{
    			String nw=s.substring(count, count+len);
    			System.out.println(nw+" nw");
    			
    			 if( nw.equals(b.get(i)) )
    			 {
    				count=count+len;
    			 }
    			 else
    			 {
    				c++;
    			 }
    			}
    			else
    			{
    				cl++;
    			}
    		}
    		System.out.println(cl+" & "+b.size());
    		if(c==b.size()|| cl==b.size() )
    		{
    			return false;
    		}
    	}
    	return true;
        
    }
    
    public boolean WordBreak(String s, List<String> wordDict) {
    	
    boolean[] f=new boolean[s.length()+1];
    f[0]=true;
    for(int i=1;i<=s.length();i++)
    {
    	    for(int j=0;j<i;j++)
    	    {
    	    	    if(f[j] && wordDict.contains(s.substring(j, i)))
    	    	    {
    	    	    	    f[i]=true;
    	    	    }
    	    }
    }
    
    return f[s.length()];
        
    }

}
