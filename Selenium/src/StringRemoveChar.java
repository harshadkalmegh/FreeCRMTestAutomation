
public class StringRemoveChar 
{
	public static void main(String[] agrs)
	{
	String str="This is Java";
	System.out.println(removeCharAt(str,3));

	String str1="Hello Hi hey world Hello";
	System.out.println(str1.replace('H','W'));
	System.out.println(str1.replaceFirst("He","Wa"));
	System.out.println(str1.replaceAll("He","W"));

	String strOrig="Developers Hello6 Hello";
	int intIndex= strOrig.indexOf("Hello7");
	
	if(intIndex == -1)
	{
	System.out.println("Hello not found");
	}
	
	else
	{
	System.out.println("Found Hello at index" +intIndex);
	}
	}//main close

	public static String removeCharAt(String s, int pos)
	{
	String s1=s.substring(0,pos);//thi
	System.out.println(s1);
	String s2=s.substring(pos+1);//is java
	System.out.println(s2);
	System.out.println("original string is "+s);
	return(s1+s2);
	}
}
