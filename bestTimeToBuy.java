package question122;

public class bestTimeToBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] prices= {2,4,0};
     System.out.println(maxProfit(prices));
	}
	
    public static int maxProfit(int[] prices) {
        
    	    if(prices.length==1 || prices.length==0)
    	    {return 0;}
    	    int min=Integer.MAX_VALUE;
    	    int max=prices[0];int MinPosi=0, MaxPosi=0;
        for(int i=0;i<prices.length;i++)
        {
        	   if(prices[i]<min)
        	   {
        		   min=prices[i];
        		   MinPosi=i;
        		   System.out.println(min+" s "+MinPosi);
        	   }
        	   if(prices[i]>max)
        	   {
        		   max=prices[i];
        		   MaxPosi=i;
        		   System.out.println(max+" l "+MaxPosi);
        	   }     	
        }
        if(MaxPosi<=MinPosi)
        {
        	  return 0;
        }
        else
        {
        return max-min;
        }
        
    }

}
