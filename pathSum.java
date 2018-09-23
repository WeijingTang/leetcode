package question113;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class pathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	
    	List<List<Integer>> listT=new ArrayList<List<Integer>>();
    	 Queue<TreeNode> q=new LinkedList<TreeNode>();
    	    Queue<Integer> add=new LinkedList<Integer>();
    	    Queue<String> record=new LinkedList<String>();
    	   ArrayList<Integer> list=new ArrayList<Integer>();
    	   if(root==null)
    	   {
    		   return listT;
    	   }
    	   
    	    q.add(root);
    	    add.add(root.val);
    	    record.add(""+root.val);
    	    while(!q.isEmpty())
    	    {
    	    	    TreeNode a=q.poll();
    	    	    int b=add.poll();
    	    	    String l=record.poll();
    	    	    if(a.right!=null)
    	    	    {
    	    	    	  q.add(a.right);
    	    	    	  int m=a.right.val+b;
    	    	    	  add.add(m);
    	    	    	  String ll=l+" "+a.right.val;
    	    	    	  record.add(ll);
    	    	    }
    	    	    if(a.left!=null)
    	    	    {
    	    	    	  q.add(a.left);
    	    	    	  int v=a.left.val+b;
    	    	    	  add.add(v);
    	    	    	  String j=l+" "+a.left.val;
    	    	    	  record.add(j);
    	    	    }
    	    	    if(a.left==null && a.right==null)
    	    	    {
    	    	    	  list.add(b);
    	    	    	  if(b==sum)
    	    	    	  {
    	    	    		  String[] parts=l.split(" ");
    	    	    		  List<Integer> y=new ArrayList<Integer>();
    	    	    		  for(int i=0;i<parts.length;i++)
    	    	    		  {
    	    	    			  y.add( Integer.parseInt(parts[i]) );
    	    	    		  }
    	    	    		  listT.add(y);
    	    	    	  }
    	    	    	 
    	    	     }
    	      }
    	    return listT;
    	          
    	
        
    }

}
