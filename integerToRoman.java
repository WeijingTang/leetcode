package question12;

public class integerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=78;
		String result=intToRoman(num);
		System.out.println(result);
	}

    public static String intToRoman(int num) 
    {
    	     String result="";
    	     if(num<1 || num> 3999)
    	     {System.out.println("No such number");}
    	     while(num>=1000)
    	     {
    	    	    result=result+"M";
    	    	    num=num-1000;
    	     }
    	     if(num>=900 && num<1000)
    	     {
    	    	    result=result+"CM";
    	    	    num=num-900;
    	     }
    	     if(num>=500 && num<900)
    	     {
    	    	    result=result+"D";
    	    	    num=num-500;
    	     }
    	     while(num>=400 && num<500)
    	     {
    	    	    result=result+"CD";
    	    	    num=num-400;
    	     }
    	     while(num>=100 && num<400)
    	     {
    	    	    result=result+"C";
    	    	    num=num-100;
    	     }
    	     if(num<100 && num>=90)
    	     {
    	    	    result=result+"XC";
    	    	    num=num-90;
    	     }
    	     if(num>=50 && num<90)
    	     {
    	    	    result=result+"L";
    	    	    num=num-50;
    	     }
    	     if(num>=40 && num<50)
    	     {
    	    	    result=result+"XL";
    	    	    num=num-40;
    	     }
    	     while(num>=10 && num<40)
    	     {
    	    	    result=result+"X";
    	    	    num=num-10;
    	     }
    	     if(num==9)
    	     {
    	    	   result=result+"IX";
    	    	   num=num-9;
    	     }
    	     if(num>=5 && num<9)
    	     {
    	    	    result=result+"V";
    	    	    num=num-5;
    	     }
    	     if(num==4)
    	     {
    	    	    result=result+"IV";
    	    	    num=num-4;
    	     }
    	     while(num>0 && num<4)
    	     {
    	    	     result=result+"I";
    	    	     num=num-1;
    	     }
    	    	 
        return result;
    }
	
}
