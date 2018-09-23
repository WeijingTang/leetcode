package question23;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeKsortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode mergeKLists(ListNode[] lists) {
    	
        int count=0;
        for(int i=0;i<lists.length;i++)
        {
            if(lists[i]==null)
            {
                count++;
            }
        }
        if(count==lists.length)
        {
            return null;
        }
    ArrayList<Integer> list=new ArrayList<Integer>();
    	for(int i=0;i<lists.length;i++)
    	{
    		while(lists[i]!=null)
    		{
    			list.add(lists[i].val);
    			lists[i]=lists[i].next;
    		}
    	}
    	int[] arr=new int[list.size()];
    	for(int i=0;i<list.size();i++)
    	{
    		arr[i]=list.get(i);   	
    	}
    	Arrays.sort(arr);
    ListNode[] result=new ListNode[list.size()];
    	for(int i=0;i<arr.length;i++)
    	{
    		 result[i]=new ListNode(arr[i]);
    		 result[i].next=result[i+1];
    	}
    	for(int i=0;i<arr.length-1;i++)
    	{
    		 result[i].next=result[i+1];
    	}
    	return result[0];
        
    }

}
