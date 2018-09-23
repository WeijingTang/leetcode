package question98;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class validateBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(10);
		TreeNode left=new TreeNode(5);
	//	TreeNode left=null;
		TreeNode right=new TreeNode(15);
		TreeNode ll=null;
		TreeNode lr=null;
		TreeNode rl=new TreeNode(6);
		TreeNode rr=new TreeNode(20);
		root.left=left;
		root.right=right;
		left.left=ll;left.right=lr;right.left=rl;right.right=rr;
		
		//System.out.println(r);
	}
	
   

}
