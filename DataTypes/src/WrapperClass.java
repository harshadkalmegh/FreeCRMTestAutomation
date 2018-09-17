
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="100";
		int i =Integer.parseInt(str);
		System.out.println(i);
		
		String str1="20.33";
		double b=Double.parseDouble(str1);
		System.out.println(b);
		
		int u=100;
		String t=String.valueOf(u);
		System.out.println(t);
		
		String c="True";
		boolean d=Boolean.parseBoolean(c);
		System.out.println(d);
		
		String stri="100a";
		int j=Integer.parseInt(stri);//NumberFormatException

	}
 
	public void WrapperClass(){
		
	}
}
