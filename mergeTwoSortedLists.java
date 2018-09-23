package question21;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class mergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);
		l1=l1.next;
    	System.out.println();

	}
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	 
    	ArrayList<Integer> list=new ArrayList<Integer>();
    while(l1!=null)
    {
    	  list.add(l1.val);
    	  l1=l1.next;
    }
    while(l2!=null)
    {
    	  list.add(l2.val);
    	  l2=l2.next;
    }
     int[] arr=new int[list.size()];
     for(int i=0;i<list.size();i++)
     {
    	  arr[i]=list.get(i);
     }
     Arrays.sort(arr);
     int count=0;
     ListNode[] result=new ListNode[arr.length];
     while(count<arr.length)
     {
    	   result[count]=new ListNode(arr[count]);
    	   count++;
     }
     for(int i=0;i<arr.length-1;i++)
     {
    	 result[i].next=result[i+1];
     }
    	 return result[0];
        
    }

}
