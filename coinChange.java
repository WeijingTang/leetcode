package question322;

import java.util.Arrays;
import java.util.Collections;

public class coinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Integer[] a= {1,5,2};
//      Arrays.sort(a,Collections.reverseOrder());
		int[] a= {2};
		int r=coinChange(a,3);
      System.out.println(r);
	}
	
    public static int coinChange(int[] coins, int amount) {
    	
    	  int[] r=new int[coins.length];
    	  int total=0;
    	  Arrays.sort(coins);
    	  for(int i=0;i<coins.length;i++)
    	  {
    		  if(coins[coins.length-1-i]<=amount)
    		  {
    			  r[coins.length-1-i]=amount/coins[coins.length-1-i];
    			  amount=amount%coins[coins.length-1-i];
    			  total=total+r[coins.length-1-i];
    		  }
    	  }   
    	  if(amount!=0)
    	  {
    		  return -1;
    	  }
    	  return total;
    }
    
    public static int CoinChange(int[] coins, int amount)
    {
    	if (coins == null || coins.length == 0 || amount <= 0)
    		return 0;
    	int[] minNumber = new int[amount + 1];
    	for (int i = 1; i <= amount; i++) {
    		minNumber[i] = Integer.MAX_VALUE;
    		for (int j = 0; j < coins.length; j++) {
    			if (coins[j] <= i && minNumber[i - coins[j]] != Integer.MAX_VALUE)
    				minNumber[i] = Integer.min(minNumber[i], 1 + minNumber[i - coins[j]]);
    		}
    	}
    	if (minNumber[amount] == Integer.MAX_VALUE)
    		return -1;
    	else
    		return minNumber[amount];
    }

}
