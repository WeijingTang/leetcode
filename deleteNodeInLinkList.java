package question237;



public class deleteNodeInLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
    public static void deleteNode(ListNode node) {
    	   
    	
        node.val= node.next.val;
        node=node.next.next;
        
    }

}
