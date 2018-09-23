package question17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class letterCombinationsOfAphoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<String> list=letterCombinations("23");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	 	String[] two= {"a","b","c"};
    	    String[] three= {"d","e","f"};
        String[] four= {"g","h","i"};
        List<String[]> input=new ArrayList<String[]>();input.add(two);input.add(three);
        input.stream().map()
		List<String[]> output = input.stream().map(item -> Arrays.stream(item).distinct().toArray())
			    .collect(Collectors.toList());
	}
	
    public static List<String> letterCombinations(String digits) {
        
//      	List<String> result=new ArrayList<String>();
//      	char[] alphabet=new char[26];
//      	for (char c = 'a'; c <= 'z'; c++) {
//      	    alphabet[c - 'a'] = c;
//      	}
//      	ArrayList<String[]> list=new ArrayList<String[]>();
//      	String[][] l=new String[9][];
//      	for(int i=1;i<6;i++)
//      	{
//      		String[] n=new String[2];
//      		n[0]=i+1+"";n[1]=alphabet[(i-1)*3]+""+alphabet[(i-1)*3+1]+""+alphabet[(i-1)*3+2];
//      		list.add(n);
//      		l[i]=n;
//      	}
//      	String[] seven=new String[2]; seven[0]=7+"";seven[1]="pqrs";
//      	String[] eight=new String[2]; eight[0]=8+"";eight[1]="tuv";
//      	String[] nine=new String[2]; nine[0]=9+"";nine[1]="wxyz";
//      	list.add(seven);list.add(eight);list.add(nine);
//      	
//      	String[] rr=new String[digits.length()]; //rr all the small char array acc to number
//      	for(int i=0;i<digits.length();i++)
//      	{
////      		String[] nl=list.get( Character.getNumericValue(digits.charAt(i))-1 );
////      		rr[i]=nl[1];
//      		
//      	}
    	
    	String[] two= {"a","b","c"};
    	String[] three= {"d","e","f"};
    	String[] four= {"g","h","i"};
    	String[] five= {"j","k","l"};
    	String[] six= {"m","n","o"};
    	String[] seven= {"p","q","r","s"};
    	String[] eight= {"t","u","v"};
    	String[] nine= {"w","x","y","z"};
    	String[][] t= new String[][] {two,three,four,five,six,seven,eight,nine};
      	for(int i=0;i<digits.length();i++)
      	{
      		String[] b=t[Character.getNumericValue(digits.charAt(i))-1];
      	}
      	 
    	
    	    return result;
    }

}
