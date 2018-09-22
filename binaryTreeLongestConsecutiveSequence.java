package question298;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class binaryTreeLongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root=new TreeNode(1);
		TreeNode left=new TreeNode(2);
		TreeNode right=new TreeNode(7);
		TreeNode ll=new TreeNode(1);
		TreeNode lr=new TreeNode(3);
		TreeNode rl=new TreeNode(6);
		TreeNode rr=new TreeNode(9);
		root.left=left;
		root.right=right;
		left.left=ll;left.right=lr;right.left=rl;right.right=rr;
		int r=longestConsecutive(root);
		System.out.println(r);

	}
	
    public static int longestConsecutive(TreeNode root) {
    	
    	Stack<TreeNode> stack=new Stack<TreeNode>();
    	stack.push(root);
    	int count=1;
    	Stack<Integer> record=new Stack<Integer>();
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	record.push(1);
    	while(!stack.isEmpty())
    	{
    		TreeNode a=stack.pop();	
    	    int b=record.pop();
    		list.add(b);
    		if(a.left!=null)
    		{
    			stack.push(a.left);
    		    if(a.val==a.left.val-1)
    		    {
    		    	   record.push(b+1);
    		    }
    		    else
    		    {
    		    	   record.push(1);
    		    }
    		}
    		if(a.right!=null)
    		{
    			stack.push(a.right);
    			if(a.val==a.right.val-1)
    			{
    				record.push(b+1);
    			}
    			else
    			{
    				record.push(1);
    			}
    		}
    	}
    	 int[] array=list.stream().mapToInt(i -> i).toArray(); 
    	 Arrays.sort(array);
    	 if(root==null)
    	 {
    		 return 0;
    	 }
    	 return array[array.length-1];
        
    }

}
