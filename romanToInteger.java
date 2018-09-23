package question13;

public class romanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=RomanToInteger("MDCCCLXXXIV");
		System.out.println(r);
		
	}
	/*Ⅰ（1）、Ⅴ（5）、Ⅹ（10）、Ⅼ（50）、Ⅽ（100）、Ⅾ（500）Ⅿ（1000）*/
	
	
	public static int RomanToInteger(String s) 
	{
		String four="IV",nine="IX",forty="XL",ninety="XC",fourhundred="CD",ninehundred="CM";
		int count=0,result=0;
		
			if(s.contains(four))
			{
				int index=s.indexOf(four),seq=0;
				while(index<s.length())
				{
					index=s.indexOf(four,index+2);
					seq=seq+1;
				}
				result=result+4*seq;
				String change=s.replaceAll(four, "O");
				s=change;
			}
			
			if(s.contains(nine))
			{
				result=result+9;
				String change=s.replaceAll(nine, "O");
				s=change;
			}
			
			if(s.contains(forty))
			{
				result=result+40;
				String change=s.replaceAll(forty, "O");s=change;
			}
			
			if(s.contains(ninety))
			{
				result=result+90;
				String change=s.replaceAll(ninety, "O");s=change;
			}
			
			if(s.contains(fourhundred))
			{
				result=result+400;
				String change=s.replaceAll(fourhundred, "O");s=change;
			}
			if(s.contains(ninehundred))
			{
				result=result+900;
				String change=s.replaceAll(ninehundred, "O");s=change;
			}
			
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='I')
				{result=result+1;}
				if(s.charAt(i)=='V')
				{result=result+5;}
				if(s.charAt(i)=='X')
				{result=result+10;}
				if(s.charAt(i)=='L')
				{result=result+50;}
				if(s.charAt(i)=='C')
				{result=result+100;}
				if(s.charAt(i)=='D')
				{result=result+500;}
				if(s.charAt(i)=='M')
				{result=result+1000;}
			}
		return result;
	}

}
