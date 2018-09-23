package question230;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;



public class kthSmallestElementInaBST {

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
        int r=kthSmallest(root,5);
        System.out.println(r);
	}
	
    public static int kthSmallest(TreeNode root, int k) {
    	
    	Queue<TreeNode> q=new LinkedList<TreeNode>();
    	q.add(root);
    ArrayList<Integer> list=new ArrayList<Integer>();
    
    	while(!q.isEmpty())
    	{
    		TreeNode a=q.poll();
    		list.add(a.val);
    		if(a.right!=null)
    		{
    			q.add(a.right);
    		}
    		if(a.left!=null)
    		{
    			q.add(a.left);
    		}
    	}
    int[] array=list.stream().mapToInt(i -> i).toArray(); 
    Arrays.sort(array);
    return array[k-1];
    }

}
