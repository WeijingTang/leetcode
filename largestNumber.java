package question179;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //     int[] a= {9051,5526,2264,5041,1630,5906,6787,8382,4662,4532,6804,4710,4542,2116,7219,8701,8308,957,8775,4822,396,8995,8597,2304,8902,830,8591,5828,9642,7100,3976,5565,5490,1613,5731,8052,8985,2623,6325,3723,5224,8274,4787,6310,3393,78,3288,7584,7440,5752,351,4555,7265,9959,3866,9854,2709,5817,7272,43,1014,7527,3946,4289,1272,5213,710,1603,2436,8823,5228,2581,771,3700,2109,5638,3402,3910,871,5441,6861,9556,1089,4088,2788,9632,6822,6145,5137,236,683,2869,9525,8161,8374,2439,6028,7813,6406,7519};
//      String[] a= {"39d","39c","34","59c","99c"};
//      Arrays.sort(a);
       int[] nums= {12,121};
//       for(int i=0;i<a.length;i++)
//       {
//    	      System.out.println(a[i]);
//       }
      
       System.out.println(largestNumber(nums));
	}
	
    public static String largestNumber(int[] nums) {
        
        String[] a=new String[nums.length];
  	  int len=0,zeroCount=0; 
    for(int i=0;i<nums.length;i++)
    {
  	      String s=nums[i]+"";
  	      a[i]=s;
  	      if(s.length()>len)
  	      {
  	    	     len=s.length();
  	      }
        if(nums[i]==0)
        {
            zeroCount++;
        }
    }
      if(zeroCount==nums.length)
      {
          return "0";
      }
    String[][] l=new String[nums.length][len];
    for(int i=0;i<nums.length;i++)
    {
  	      if(a[i].length()<len)
  	      {
  	    	     String app=a[i].charAt(0)+"";
  	    	     int diff=len-a[i].length();
  	    	     String repeated = IntStream.range(0, diff).mapToObj(j -> app).collect(Collectors.joining(""));
  	    	     a[i]=a[i]+repeated+"c"+diff+"n";
  	      }
            else
  	      {
  	    	     a[i]=a[i]+"d";
  	      }
  	  
    }
    Arrays.sort(a);
    String r="";
    for(int i=a.length-1;i>=0;i--)
    {
  	      String h=a[i];
  	      if(h.charAt(h.length()-1)=='n')
  	      {
  	    	     int d=Character.getNumericValue(h.charAt(h.length()-2));
  	    	     h=h.substring(0, h.length()-3-d);
  	      }
            else
  	      {
  	    	     h=h.substring(0, h.length()-1);
  	      }
  	      r=r+h;
  	  System.out.println(a[0]+" "+a[1]);
    }
    
    return r;
        
    }

}
