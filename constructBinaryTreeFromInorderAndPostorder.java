package question106;

public class constructBinaryTreeFromInorderAndPostorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inorder, get left-root relation
		//postorder, get right-root relation

	}
	
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	
    	return build(inorder, inorder.length-1,0,postorder,postorder.length-1);  
    }
    
    public TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder,int postStart)
    {
    	    if(inEnd>inStart)
    	    {
    	    	  return null;
    	    }
    	    
    	    TreeNode root=new TreeNode(postorder[postStart]);
    	    
    	    if(inEnd==inStart)
    	    {
    	    	  return root;
    	    }
    	    
    	    int index=0;
    	    for(int i=inStart; i>=inEnd; i--)
    	    {
    	    	  if(inorder[i]==root.val)
    	    	  {
    	    		  index=i;
    	    		  break;
    	    	  }
    	    }
    	    
    	    root.right=build(inorder, inStart, index+1, postorder, postStart-1);
    	    root.left=build(inorder, index-1, inEnd, postorder, postStart-(inStart-index)-1);  	
    	    return root;
    }

}
