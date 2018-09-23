package question38;

import java.util.ArrayList;

public class countAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(countAndSay(2));
		
	}
	
	public static String countAndSay(int n) {
		
	   if(n==1)
  	   {
  		   return 1+"";
  	   }
  	   if(n==2)
  	   {
  		   return "11";
  	   }
		
		String a=countAndSay(n-1);
		ArrayList<int[]> list=new ArrayList<int[]>();
		int[] l1=new int[2];
		l1[0]=Character.getNumericValue(a.charAt(0));l1[1]=1;
		//System.out.println(l1[0]+""+l1[1]);
		list.add(l1);
	   for(int i=1;i< a.length();i++)
 	   {
		   int[] l=list.get(list.size()-1);
		   if(Character.getNumericValue(a.charAt(i))==l[0])
		   {
			   l[1]++;
		   }
		   else
		   {
			   int[] newlist=new int[2];
			   newlist[0]=Character.getNumericValue(a.charAt(i));
			   newlist[1]=1;
			   //System.out.println(newlist[1]);
			   list.add(newlist);
		   }
 	   }
	   String result="";
	   for(int i=0;i<list.size();i++)
	   {
		   int[] r=list.get(i);
		   result=result+""+r[1]+""+r[0];
	   }

		return result;
	
	}
	
}
