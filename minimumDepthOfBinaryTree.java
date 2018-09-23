package question111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class minimumDepthOfBinaryTree {

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
		int a=minDepth(root);
	}
	
    public static int minDepth(TreeNode root) {
    	
    	if(root==null)
   	 {
   		 return 0;
   	 }
    	Stack<TreeNode> stack=new Stack<TreeNode>();
    	Stack<Integer> depth=new Stack<Integer>();
    	List<Integer> list=new ArrayList<Integer>();
    	stack.push(root);
    	depth.push(1);
    	
    	while(!stack.isEmpty())
    	{
    		TreeNode a=stack.pop();
    		int d=depth.pop();
    		if(a.right!=null)
    		{
    			stack.push(a.right);
    			depth.push(d+1);
    		}
    		if(a.left!=null)
    		{
    			stack.push(a.left);
    			depth.push(d+1);
    		}
    		if(a.left==null && a.right==null)
    		{
    			list.add(d);
    		}
    		
    	}
    	
    	int[] array=list.stream().mapToInt(i -> i).toArray(); 
	Arrays.sort(array);
		 
    	 return array[0];
       
    }

}
