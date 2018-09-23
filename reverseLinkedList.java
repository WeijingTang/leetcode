package question206;

import java.util.ArrayList;

public class reverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ListNode a1=new ListNode(1);
    ListNode a2=new ListNode(2);
    ListNode a3=new ListNode(3);
    a1.next=a2;
    a2.next=a3;
    ListNode a=reverseList(a1);
   
    	  System.out.println(a.val);
    	 
    
		
	}
	
    public static ListNode reverseList(ListNode head) {
    	
    	if(head==null)
    {return null;}
   
    	int count=0;
    	ArrayList<ListNode> list=new ArrayList<ListNode>();
    	
    	while(head!=null)
    	{
    		list.add(head);
    	//	System.out.println(head.val+" *");
    		head=head.next;
    		
    		count++;
 //   		list.get(count).next=list.get(count-1);
    		
    	}
    	
    	
    	for(int i=count-1;i>=1;i--)
    	{
    		//System.out.println(list.get(i).val+" &");
    		list.get(i).next=list.get(i-1);   		
    	}
    
    	  return list.get(count-1);
    }
        
    

}
