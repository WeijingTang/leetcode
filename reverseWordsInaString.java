package question151;

public class reverseWordsInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the sky is blue";
		String m="   ";
		
    String a=reverseWords(s);
    System.out.println(a);
    
		
	}
	
    public static String reverseWords(String s) {
        
    	String[] line=s.split(" ");
    	String[] result=new String[line.length];
    	String a="";
    	for(int i=0;i<line.length;i++)
    	{
    		result[i]=line[line.length-1-i];
    		a=a+result[i]+" ";
    	}
    	
    a = a.trim().replaceAll("(\\s)+", "$1");//why work?
   
    	return a;
    }

}
