package question44;

import java.util.ArrayList;

public class wildcardMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aa";
		String p="a*";
	//	System.out.println(starCompare(s,p));
		System.out.println(isMatch(s,p));
		
	}
	
	public static boolean starCompare(String s, String p)
	{
		ArrayList<Character> pl=ctoAList(p);
	    ArrayList<Character> sl=ctoAList(s);char l='\0';
	    for(int i=0;i<sl.size();i++)
	    {
	    	   if(!pl.contains(sl.get(i)))
	    	   {
	    		   int index=sl.indexOf(sl.get(i));
	    		   if(index-1>=0)
	    		   {
	    			   l=sl.get(index-1);
	    		   }
	    	   }
	    }
	    for(int i=0;i<pl.size();i++)
	    {
	    	   if(pl.get(i).equals(l))
	    	   {
	    		   if(i+1<pl.size() && pl.get(i+1)=='*')
	    		   {
	    			   return true;
	    		   }
	    	   }
	    }
	    return false;
	}
	
    public static boolean isMatch(String s, String p) {
      
    	    if(repeatNum(ctoAList(p),'?')==0 && repeatNum(ctoAList(p),'*')==0)
    	    {
    	    	   if(!s.equals(p))
    	    	   {
    	    		   return false;
    	    	   }
    	    }
    	   
    	    if(repeatNum(ctoAList(p),'?')!=0 && repeatNum(ctoAList(p),'*')==0)
    	    {
    	       	   if(p.length()!=s.length())
                {
                    return false;
                }
                else
                {
     	         for(int i=0;i<p.length();i++)
     	         {
     	    	      if(p.charAt(i)!='?')
     	    	      {
     	    	    	     if(p.charAt(i)!=s.charAt(i))
     	    	    	     {
     	    	    	    	    return false;
     	    	    	     }
     	    	      }
     	         }
                }
    	    }
    	    
    	    if(repeatNum(ctoAList(p),'*')!=0)
    	    {
    	    	    if(p.equals("*"))
    	    	    {
    	    	    	   return true;
    	    	    }
    	    	    if(starCompare(s,p)==false)
    	    	    {
    	    	    	return false;
    	    	    }
    	    	 
    	    	    ArrayList<Character> pl=ctoAList(p);
    	    	    ArrayList<Character> sl=ctoAList(s);
    	    	    int ee=0;
    	    	    for(int i=0;i<pl.size();i++)
    	    	    {
    	    	    	  if(pl.get(i)!='*' && pl.get(i)!='?' && !sl.contains(pl.get(i)))
    	    	    	  {	
    	    	    		  return false;
    	    	    	  }  
    	    	    	  if(pl.get(i)!='*')
    	    	    	  {
    	    	    		  ee++;
    	    	    	  }
    	    	    }
    	    	    if(ee>sl.size())
    	    	    {
    	    	    	return false;
    	    	    }
    	    	    
    	    	    ArrayList<String> ll=sepStar(p);
    	    	    
    	    	    for(int i=0;i<ll.size();i++)
    	    	    {
    	    	       int count=0;
    	    	    	   for(int j=0;j<s.length()-ll.get(i).length()+1;j++)
    	    	    	   {
    	    	    		   if(!findBulrMatch(s.substring(j, j+ll.get(i).length()),ll.get(i)))
    	    	    		   {
    	    	    			   count++;
    	    	    		   }
    	    	    		   System.out.println(s.substring(j, j+ll.get(i).length())+" "+ll.get(i));
    	    	    		   System.out.println(findBulrMatch(s.substring(j, j+ll.get(i).length()),ll.get(i)));
    	    	    	   }
    	    	    	   System.out.println(count+" "+(s.length()-ll.get(i).length()) );
    	    	    	   if(count==s.length()-ll.get(i).length()+1 && count!=0)
    	    	    	   {
    	    	    		   return false;
    	    	    	   }
    	    	    }
    	    	
    	    }
    	    
    	    return true;
    
    }
    
    public static ArrayList<Character> ctoAList(String line)
    {
      	ArrayList<Character> l=new ArrayList<Character>();
    	    for(int i=0;i<line.length();i++)
    	    {
    	    	   l.add(line.charAt(i));
    	    }
    	    return l;
    }
    
    public static int repeatNum(ArrayList<Character> l,char a)
    {
    	   int count=0;
    	   for(int i=0;i<l.size();i++)
    	   {
    		   if(l.get(i).equals(a))
    		   {
    			   count++;
    		   }
    	   }
    	   return count;
    }
    
    public static ArrayList<String> sepStar(String s)
    {
    	   //this function separate a string by star
    	    ArrayList<String> list=new ArrayList<String>();
    	    int i=0;
    	    String r="";
    	    
    	    while(i<s.length())
    	    {
    	   
    	    	    if(s.charAt(i)!='*')
    	    	    {
    	    	    	   r=r+s.charAt(i);
    	    	    	   
    	    	    }
    	    	    else
    	    	    {
    	    	    	   if(r!="")
    	    	    	   {
    	    	    		   list.add(r);
    	    	    		   
    	    	    	   }
    	    	    	   r="";
    	    	    }      
    	    	 	i++;
    	    }
    	    list.add(r);
    	   
    	    return list;
    }
    
    public static boolean findBulrMatch(String s, String sub)
    {
    	    //this function deal with inaccurate match like "a?b" with "acb" and "ab"
    	    //TODO
    	    if(s.length()!=sub.length())
    	    {
    	    	   return false;
    	    }
    	    for(int i=0;i<s.length();i++)
    	    {
    	    	   if(sub.charAt(i)!='?' && s.charAt(i)!=sub.charAt(i))
    	    	   {
    	    		   return false;
    	    	   }
    	    }
    	    return true;
    }
    
    boolean comparison(String str, String pattern) {
        int s = 0, p = 0, match = 0, starIdx = -1;            
        while (s < str.length()){
            // advancing both pointers
            if (p < pattern.length()  && (pattern.charAt(p) == '?' || str.charAt(s) == pattern.charAt(p))){
                s++;
                p++;
            }
            // * found, only advancing pattern pointer
            else if (p < pattern.length() && pattern.charAt(p) == '*'){
                starIdx = p;
                match = s;
                p++;
            }
           // last pattern pointer was *, advancing string pointer
            else if (starIdx != -1){
                p = starIdx + 1;
                match++;
                s = match;
            }
           //current pattern pointer is not star, last patter pointer was not *
          //characters do not match
            else return false;
        }
        
        //check for remaining characters in pattern
        while (p < pattern.length() && pattern.charAt(p) == '*')
            p++;
        
        return p == pattern.length();
}

}
