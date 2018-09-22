package question279;

public class perfectSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(numSquares(17));
		int[] a= numSquares(37);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
    public static int[] numSquares(int n) {
    	
    	 String a = Integer.toBinaryString(n);
    	 System.out.println(a);
         int count=0;
         String rr = "";
         for(int i=0;i<a.length();i++)
         {
             if(a.charAt(i)=='1')
             {
                 count++;
                 rr = rr +i;
             }
         }
         int[] r=new int[count];
         for(int i=0;i<count;i++)
         {
             r[i]=Character.getNumericValue(rr.charAt(i));
         }
         return r;
        
    }

}
