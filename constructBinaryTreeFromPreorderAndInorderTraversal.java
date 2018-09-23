package question105;

public class constructBinaryTreeFromPreorderAndInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		Say we have 2 arrays, PRE and IN.
		Preorder traversing implies that PRE[0] is the root node.
		Then we can find this PRE[0] in IN, say it’s IN[5].
		Now we know that IN[5] is root, so we know that IN[0] - IN[4] is on the left side, IN[6] to the end is on the right side.
		Recursively doing this on subarrays, we can build a tree out of it
    */
	}
	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
    	return build(inorder, inorder.length-1,0,preorder,0); 
    }
    
    public TreeNode build(int[] inorder, int inStart, int inEnd, int[] preorder,int preStart)
    {
    	    if(inEnd>inStart)
    	    {
    	    	  return null;
    	    }
    	    
    	    TreeNode root=new TreeNode(preorder[preStart]);
    	    
    	    if(inEnd==inStart)
    	    {
    	    	  return root;
    	    }
    	    
    	    int index=0;
    	    for(int i=inStart; i<=inEnd; i++)
    	    {
    	    	  if(inorder[i]==root.val)
    	    	  {
    	    		  index=i;
    	    		  break;
    	    	  }
    	    }
    	    
    	    root.right=build(inorder, inEnd, index+1, preorder, preStart+index-inStart+1);
    	    root.left=build(inorder, index-1, inStart, preorder, preStart+1);  
    	    return root;
    }

}
