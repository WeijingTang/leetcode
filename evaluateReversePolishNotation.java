package question150;

import java.util.Stack;

public class evaluateReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] tokens= {"4", "13", "5", "/", "+"};
    System.out.println(evalRPN(tokens));
		
	}
	
    public static int evalRPN(String[] tokens) {
    	Stack<Integer> stack = new Stack<Integer>();
    	  
    	  for (int i = 0; i < tokens.length; i++) {
    	    switch (tokens[i]) {
    	      case "+":
    	        stack.push(stack.pop() + stack.pop());
    	        break;
    	          
    	      case "-":
    	        stack.push(-stack.pop() + stack.pop());
    	        break;
    	          
    	      case "*":
    	        stack.push(stack.pop() * stack.pop());
    	        break;

    	      case "/":
    	        int n1 = stack.pop(), n2 = stack.pop();
    	        stack.push(n2 / n1);
    	        break;
    	          
    	      default:
    	        stack.push(Integer.parseInt(tokens[i]));
    	    }
    	  }
    	  
    	  return stack.pop();
    }

}
