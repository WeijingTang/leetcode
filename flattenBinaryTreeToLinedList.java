package question114;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class flattenBinaryTreeToLinedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		TreeNode left=new TreeNode(2);
		TreeNode right=new TreeNode(7);
		TreeNode ll=new TreeNode(1);
		TreeNode lr=new TreeNode(3);
		TreeNode rl=new TreeNode(6);
		TreeNode rr=new TreeNode(9);
		root.left=left;
		root.right=right;
		left.left=ll;left.right=lr;right.left=rl;right.right=rr;
        preorder(root);
	}
	
    public static void preorder(TreeNode root)
    {
    	    Stack<TreeNode> stack=new Stack<TreeNode>();
    	    LinkedList<TreeNode> list=new LinkedList<TreeNode>();
    	    Queue<TreeNode> q=new LinkedList<TreeNode>();
    	    stack.push(root);
    	    while(!stack.isEmpty())
    	    {
    	    	   TreeNode a=stack.pop();
    	    	   q.add(a);
    	  //  	   System.out.print(a.val);
    	    	   if(a.right!=null)
    	    	   {
    	    		   stack.push(a.right);
    	    	   }
    	    	   if(a.left!=null)
    	    	   {
    	    		   stack.push(a.left);
    	    	   }
    	    	
    	    }
    	    
    	    TreeNode r=q.poll();
        while(!q.isEmpty())
        {
        	   r.right=q.poll();
        	   r=r.right;
        	  // System.out.println(r.val);
        }
    	
    	
    }

}
