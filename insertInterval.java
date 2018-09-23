package question57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> r= new ArrayList<Interval>();
        r.add(new Interval(1,5));
//        r.add(new Interval(3,5));
//        r.add(new Interval(6,7));
//        r.add(new Interval(8,10));
//        r.add(new Interval(12,16));
        Interval a=new Interval(2,7);
        List<Interval> rr=insert(r,a);
        for(int i=0;i<rr.size();i++)
        {
        	  System.out.println(rr.get(i).start+" "+rr.get(i).end);
        }
        
	}
	
    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        
    	     List<Interval> list=new ArrayList<Interval>();
    	     if(intervals.size()==0)
    	     {
    	    	    list.add(newInterval);
    	    	    return list;
    	     }
    	     int start=0; int end=0;
    	     for(int i=0;i<intervals.size();i++)
    	     {
    	    	     if(newInterval.start>intervals.get(i).start)
    	    	     {
    	    	    	    start=i;
    	    	     }
    	     }
    	     for(int i=0;i<intervals.size();i++)
    	     {
    	    	     if(newInterval.end<intervals.get(i).end)
    	    	     {
    	    	    	    end=i;
    	    	    	    break;
    	    	     }
    	    	 
    	     }
    	  //   System.out.println(start+" * "+end);
    	     int left=0,right=0;
    	     if(newInterval.start<intervals.get(start).end )
    	     {
    	    	    left=intervals.get(start).start;
    	     }
    	     if(newInterval.start>intervals.get(start).end || newInterval.start<=intervals.get(start).start)
    	     {
    	    	    left=newInterval.start;
    	     }
    	     if(newInterval.end>intervals.get(end).start)
    	     {
    	    	    right=intervals.get(end).end;
    	     }
    	     if(newInterval.end<intervals.get(end).start || newInterval.end>=intervals.get(end).end)
    	     {
    	    	    right=newInterval.end;
    	     }
    	//     System.out.println(left+" * "+right);
    	     Interval r=new Interval(left,right);
    	     for(int i=0;i<intervals.size();i++)
    	     {
    	    	     if(intervals.get(i).end<left)
    	    	     {
    	    	    	    list.add(intervals.get(i));
    	    	     }
    	     }
    	     list.add(r);
    	     for(int i=0;i<intervals.size();i++)
    	     {
    	    	     if(intervals.get(i).start>right)
    	    	     {
    	    	    	    list.add(intervals.get(i));
    	    	     }
    	     }
    	     
      	 return list;
    }

}










