package question141;

import java.util.ArrayList;

public class linkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//2:55
	public static boolean hasCycle(ListNode head)
	{
		ArrayList<ListNode> list=new ArrayList<ListNode>();
		while(head!=null)
		{
			list.add(head);
			head = head.next;
			if(list.contains(head))
			{
				return true;
			}
		}
		return false;
	}

}
