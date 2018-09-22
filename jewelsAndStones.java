package question771;

import java.util.ArrayList;

public class jewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int jewelInStones(String J, String S)
	{
		int count=0;
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0; i<J.length(); i++)
		{
			list.add(J.charAt(i));
		}
		for(int i=0; i<S.length();i++)
		{
			if(list.contains(S.charAt(i)))
			{
				count++;
			}
		}
		return count;
	}

	
}
