
public class mee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Java";
		String s2="Java";
		System.out.println(s1==s2);
		
		String s=new StringBuffer(s1).reverse().toString();
		System.out.println(s);
		
		String s3=s1.toUpperCase();
		System.out.println(s3);
		
		String s5=s1.toLowerCase();
		System.out.println(s5);
		
		String S4="harshad1111111";
		for (int i=0;i<S4.length();i++){
			char c=S4.charAt(i);
			if(Character.isLetter(c)){
				System.out.print(c);
		
			}
			
		}
	}

}
