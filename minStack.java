package question155;

import java.util.ArrayList;
import java.util.Stack;

public class minStack {
	
	/** initialize your data structure here. */
	Stack<Integer> st=new Stack<>();
	int min=Integer.MAX_VALUE;
    public minStack() {
    	
    	
        
    }
    
    public void push(int x) {
      if(x<=min) {st.push(min);min=x;}
       st.push(x); 
    }
    
    public void pop() {
       if(st.peek()==min) {st.pop();min=st.pop();}
       else st.pop();
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }

}
