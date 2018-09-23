package question234;

import java.util.ArrayList;

public class palindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isPalindrome(ListNode head) {
    	
    	 ArrayList<Integer> list = new ArrayList<Integer>();
     	
     	while(head != null)
     	{
     		list.add(head.val);
     		head = head.next;
     	}
         
         for(int i=0;i<list.size();i++)
     	{
     		if(!list.get(i).equals( list.get(list.size()-1-i) ))
     		{
     			return false;
     		}
     	}
     	
     	return true;
    }

}
