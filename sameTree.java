package question100;

import java.util.LinkedList;
import java.util.Queue;

public class sameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	
    	    Queue<TreeNode> pp = new LinkedList<TreeNode>();pp.add(p);
    	    Queue<TreeNode> qq = new LinkedList<TreeNode>();qq.add(q);
        while(!pp.isEmpty() && !qq.isEmpty())
        {
        	    TreeNode a=pp.poll();
        	    TreeNode b=qq.poll();
        	    if(a.left.val!=b.left.val || a.right.val!=b.right.val)
        	    {
        	    	   return false;
        	    }
        	    else
        	    {
        	    	   pp.add(a.left);pp.add(a.right);
        	    	   qq.add(b.left);qq.add(b.right); 
        	    }
        }
        return true;
    }
    
    public static boolean IsSameTree(TreeNode p, TreeNode q) {
    	    
    	    
    	  
    }

}
