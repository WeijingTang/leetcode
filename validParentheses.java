package question20;

import java.util.ArrayList;
import java.util.Stack;

public class validParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ArrayList<ArrayList<Integer>> posi=new ArrayList<ArrayList<Integer>>();
		boolean a=isValid("()");
		String s="C[)]";
		System.out.println(a);
//		int[] m= {1,6,3,4};
//		//System.out.println(Integer.MIN_VALUE);
//		for (int i : m) 
//		{
//			System.out.println(i);
//		}
	       
	}
	
       public static boolean isValid(String s) {
    	   
    	   Stack<Character> stack = new Stack<Character>();
    		for (char c : s.toCharArray()) {
    			System.out.println(c);
    			if (c == '(')
    				stack.push(')');
    			else if (c == '{')
    				stack.push('}');
    			else if (c == '[')
    				stack.push(']');
    			else if (stack.isEmpty() || stack.pop() != c)
    				return false;
    			//System.out.println(stack.peek()+" "+"*");
    			
    		}
    		return stack.isEmpty();
    }

}
