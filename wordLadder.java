package question127;

import java.util.ArrayList;
import java.util.List;

public class wordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordList=new ArrayList<String>();
		wordList.add("hot");wordList.add("dot");
		wordList.add("dog");wordList.add("lot");
		wordList.add("log");wordList.add("cog");
		int len=ladderLength("hit","cog",wordList);
        System.out.println(len);
	}
	
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
         //get the difference
        int largest=0;
        List<String> l=new ArrayList<String>();
        List<List<String>> nl=new ArrayList<List<String>>();
        helper(beginWord,endWord,wordList,nl,l);
        for(int i=0;i<nl.size();i++)
        {
          System.out.println(nl.get(i));
        	  if(nl.get(i).size()>largest)
        	  {
        		  largest=i;
        	  }
        } 	         
        return largest;   	
    }
    
    public static void helper(String beginWord, String endWord, List<String> wordList, List<List<String>> l, List<String> nl)
    {
    	     
    	     if(findOneLadder(wordList,beginWord))
    	     {
    	    	   
    	    	    List<String> rw=findWord(wordList,beginWord);
    	    	    for(int i=0;i<rw.size();i++)
    	    	    {
                if(rw.get(i).equals(endWord))
                {
                	   l.add(nl);
                	   return;
                }
                else
                {
                	 nl.add(rw.get(i));
    	    	    	     wordList=removeWord(wordList,rw.get(i));
    	    	    	     helper(rw.get(i),endWord,wordList,l,nl);
                }
    	    	    }
    	     }
    	
    }
    
    public static int diffBetwTwo(String a, String b)
    {
    	     int diff=0;
	     for(int i=0;i<a.length();i++)
	     {
	    	    if(a.charAt(i)!=b.charAt(i))
	    	    {
	    	    	   diff++;
	    	    }
	     }
	     return diff;
    }
    
    public static boolean findOneLadder(List<String> wordList, String word)
    {
    	   boolean check=false;
    	   for(int i=0;i<wordList.size();i++)
   	   {
    	    	     int count=0;
    	    	     
    	    	     for(int j=0;j<wordList.get(i).length();j++)
    	    	     {
    	    	    	     if(wordList.get(i).charAt(j)!=word.charAt(j))
    	    	    	     {
    	    	    	    	    count++;
    	    	    	     }
    	    	     }
    	    	     if(count==1)
    	    	     {
    	    	    	     check=true;
    	    	     }
    	    }
    	   return check;
    }
    
    public static List<String> findWord(List<String> wordList, String word)
    {
    	   List<String> rw=new ArrayList<String>();
    	   for(int i=0;i<wordList.size();i++)
   	   {
    	    	     int count=0;
    	    	     
    	    	     for(int j=0;j<wordList.get(i).length();j++)
    	    	     {
    	    	    	     if(wordList.get(i).charAt(j)!=word.charAt(j))
    	    	    	     {
    	    	    	    	    count++;
    	    	    	     }
    	    	     }
    	    	     if(count==1)
    	    	     {
    	    	    	     rw.add(wordList.get(i));
    	    	     }
    	    }
    	   return rw;
    }
    
    public static List<String> removeWord(List<String> wordList, String word)
    {
    	    if(wordList.contains(word))
    	    {
    	    	   wordList.remove(wordList.indexOf(word));
    	    }
    	    return wordList;
    }

}
