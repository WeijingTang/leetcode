package question463;

public class islandPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] a = {{0,1,0,0},
        		 {1,1,1,0},
        		 {0,1,0,0},
        		 {1,1,0,0}};
        System.out.println(islandPerimeter(a));
	}
	
    public static int islandPerimeter(int[][] grid) {
    	
    	 //make it to a larger matrix
    	 int sideR = grid.length + 2;
    	 int sideC = grid[0].length + 2;
    	 int[][] ngrid = new int[sideR][sideC];
    	 for(int i = 0; i < sideR; i++)
    	 {
    		 for(int j = 0; j < sideC; j++)
    		 {
    			 if( (i>0 && i<sideR-1) && (j>0 && j<sideC-1))
    			 {
    				 ngrid[i][j]=grid[i-1][j-1];
    			 }
    			 else
    			 {
    				 ngrid[i][j]=0;
    			 }
    		 }
    	 }
//    	 for(int i = 0; i < sideR; i++)
//    	 {
//    		 for(int j = 0; j < sideC; j++)
//    		 {
//    	        System.out.print(ngrid[i][j]);
//    		 }
//    		 System.out.println();
//    	 }
    	 int count=0;
    	 for(int i = 1; i < sideR-1; i++)
    	 {
    		 for(int j = 1; j < sideC-1; j++)
    		 {
    			 if(ngrid[i][j]==1)
    			 {
    				 if(ngrid[i-1][j]==0)
    				 {
    					 count++;
    				 }
    				 if(ngrid[i+1][j]==0)
    				 {
    					 count++;
    				 }
    				 if(ngrid[i][j-1]==0)
    				 {
    					 count++;
    				 }
    				 if(ngrid[i][j+1]==0)
    				 {
    					 count++;
    				 }
    			 }
    		 }
    	 }
    	return count;	 
         
    }
	

}
