package question14;

public class longestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] strs= {"abca","aba","aaab"};
       String result=longestCommonPrefix(strs);
       String a="";
	   System.out.println(result);
	}
	
    public static String longestCommonPrefix(String[] strs) {
    	 
    	     String result="";
    	     if(strs.length==1)
    	     {result=strs[0];}
         if(strs.length!=0)
         {
           int shortest=strs[0].length();
           
         
     	    for(int i=0;i<strs.length;i++)
     	    {
     		 if(strs[i].length()<shortest)
     		 {shortest=strs[i].length();}
     	    }
     	   if(shortest!=0)
           {
     	    boolean[] check=new boolean[shortest];
     		int falseCount=0,trueCount=0;
     		 for(int j=0;j<shortest;j++)
    		     {
     	      for(int i=1;i<strs.length;i++)
     	      {
     	    
     		 
     			if(strs[i].charAt(j)!=strs[0].charAt(j))
     			{falseCount++;}
     			else
     			{trueCount++;}
     			
     			if(falseCount!=0)
     			{check[j]=false;}
     			else
     			{check[j]=true;}
     			
     		   }
     		 // System.out.println(falseCount);
     	      }
     	
     	if(check[0]==true)
     	{
     		int counter=0;
     		while(counter<shortest && check[counter]!=false)
     		{		
     			result=result+strs[0].charAt(counter); 			
     			counter=counter+1;
     		}
     	}
         }
         }
     	return result;
        
    }

}
