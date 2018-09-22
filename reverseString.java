package question344;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a="Hello";
      String b=reverseString(a);
      System.out.println(b);
	}

	public static String reverseString(String s) {
		
//		String result="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			result=result+s.charAt(i);
//		}
//		return result;
		StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
	}
}
