package question160;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	
    	List<ListNode> a=new ArrayList<ListNode>();
    	while(headA!=null)
    	{
    		a.add(headA);
    		headA=headA.next;
    	}
    	List<ListNode> b=new ArrayList<ListNode>();
    	while(headB!=null)
    	{
    		b.add(headB);
    		headB=headB.next;
    	}
    	int count=0;
    	for(ListNode i : a)
    	{
    		if(b.contains(i))
    		{
    			return i;
    		}
    	}
    return null;
        
    }
}
