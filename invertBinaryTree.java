package question226;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class invertBinaryTree {

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
	
	TreeNode r=invertTree(root);
	System.out.println(r.val+" "+r.left.val+" "+r.right.val+" "+r.left.right.val);
		
	}
	
    public static TreeNode invertTree(TreeNode root) {
    	
    	if(root==null)
    	{
    		return null;
    	}
    	
    Stack<TreeNode> q=new Stack<TreeNode>();
    	q.push(root);
   
    	while(!q.empty())
    	{
    		TreeNode a=q.pop();
    		TreeNode left=a.left;
    		a.left=a.right;
    		a.right=left;
    		
    		if(a.left!=null)
    		{
    		q.push(a.left);
    		}
    		if(a.right!=null)
    		{
    		q.push(a.right);
    		}  		   			
    	}
     return root;   
    }

}



