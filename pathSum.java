package question112;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class pathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean hasPathSum(TreeNode root, int sum) {
    	
    Queue<TreeNode> q=new LinkedList<TreeNode>();
    Queue<Integer> add=new LinkedList<Integer>();
    ArrayList<Integer> list=new ArrayList<Integer>();
    
    if(root==null)
    {
    	  return false;
    }
    q.add(root);
    add.add(root.val);
    
    while(!q.isEmpty())
    {
    	    TreeNode a=q.poll();
    	    int b=add.poll();
    	    if(a.right!=null)
    	    {
    	    	  q.add(a.right);
    	    	  int m=a.right.val+b;
    	    	  add.add(m);
    	    }
    	    if(a.left!=null)
    	    {
    	    	  q.add(a.left);
    	    	  int v=a.left.val+b;
    	    	  add.add(v);
    	    }
    	    if(a.left==null && a.right==null)
    	    {
    	    	  list.add(b);
    	    	  if(b==sum)
    	    	  {
    	    		  return true;
    	    	  }
    	     }
      }
    return false;
          
    }

}
