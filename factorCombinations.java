package question254;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class factorCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> r = new ArrayList<List<Integer>>();
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		
		getAllPrime(2,32,a);
		System.out.println(a);
		b.add(2);b.add(3);b.add(5);b.add(7);b.add(11);
//		combinations(2,r,b);
//		System.out.println(r);
		
		CombinationR(a, r);
//		Collections.sort(b);System.out.println(b);
//		Collections.reverse(b);System.out.println(b);
        System.out.println(r);
		
		
		
	}
	
	 public static List<List<Integer>> getFactors(int n) {
	        
	    List<List<Integer>> r=new ArrayList<List<Integer>>();
	    if(n==1)
        {
            return r;
        }
	    List<Integer> a = new ArrayList<Integer>();
	    getAllPrime(2, n,a);
	    CombinationR(a, r);
	    return r;
	 }
	 
	
	 
	 public static boolean isPrime(int n)
	 {
		 if(n==2) 
		 {
			 return true;
		 }
		 int count=0;
		 for(int i=2;i<n;i++)
		 {
			 if(n%i==0)
			 {
				 count++;
			 }
		 }
		 if(n!=2 && count==0)
		 {
			 return true;
		 }
		 return false;	 
	 }
	 
	 
	 public static void getAllPrime(int i, int n,List<Integer> a)
	 {
		 if(i==n)
		 {
			 return;
		 }
		 if(n%i==0)
		 {
			 if(isPrime(i)==true)
			 {
				 a.add(i);
				 if(isPrime(n/i)==true)
				 {
					 a.add(n/i);
					 return;
				 }
				 else
				 {
					 getAllPrime(i,n/i,a);
				 }
			 }
		 }
		 if(n%i!=0)
		 {
			 getAllPrime(i+1,n,a);
		 }		 
		 
	 }
	 
//	 static void printCombinations(char[] sequence, int N) 
//	 {
//	        char[] data = new char[N];
//	        for (int r = 0; r < sequence.length; r++)
//	            combinations(sequence, data, 0, N - 1, 0, r);
//	 }
//	 
//	 static void combinations(char[] sequence, char[] data, int start, int end,
//	            int index, int r) 
//	 { 
//	        if (index == r) 
//	        {
//	            for (int j = 0; j < r; j++)
//	                System.out.print(data[j] + " ");
//	            System.out.println();
//	        }
//	        
//	        for (int i = start; i <= end && ((end - i + 1) >= (r - index)); i++) 
//	        {
//	        	    System.out.println((end - i + 1)+" "+(r-index));
//	            data[index] = sequence[i];
//	            combinations(sequence, data, i + 1, end, index + 1, r);
//	        }
//	  }
	 

	 
	 static void Combination(List<Integer> a, List<List<Integer>> v)
	 {
		 
		 int distence=1; 
		 while(distence<a.size())
		 {int multi=1;
			 List<Integer> c=new ArrayList<Integer>();
		     for(int i=0;i<a.size();i++)
		     {
			   if(i<a.size()-distence)
			   {
				 c.add(a.get(i));
			   }
			   else
			   {
				 multi=multi*a.get(i);
			   }
		     }
		   c.add(multi);
		   Collections.sort(c);
		   if(!v.contains(c))
		   {System.out.println(c);
			   v.add(c);
		   }
		   
		   if(c.size()<a.size() && c.size()>2)
		   {
		   List<Integer> d=new ArrayList<Integer>();
		   for(int j=0;j<c.size();j++)
		   {
			   d.add(c.get(c.size()-j-1));
		   }
		   System.out.println(d);
		   Combination(d,v);
		   }
		   distence++;
		 }
	 }
	 
	 static List<Integer> rotateList(List<Integer> a)
	 {
		 int zero=a.get(0);
		 a.remove(0);
		 a.add(zero);
		 return a;
	 }
	 
	 static void CombinationR(List<Integer> a, List<List<Integer>> v)
	 {
		 for(int i=0;i<a.size();i++)
		 {
			 Combination( a, v);
			 a=rotateList(a);
		 }
	 }
 
}
