package question458;

public class poorPigs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int result=poorPigs(1000,15,60);
    System.out.println(result);
		
	}
	
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) 
    {
  
       int oneD=minutesToTest/minutesToDie+1;
       int pigs= 0;
       if(buckets!=1)
       {
       pigs= (int)Math.ceil((Math.log(buckets*1.0)/Math.log(oneD)));
       }
       return pigs;
    	
    }

}
