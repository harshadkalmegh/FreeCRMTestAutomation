import java.lang.*;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("Hello ");
		sb.append("Java");//now original string is changed
		System.out.println(sb);//print Hello Java
		
		sb.insert(1, "Java");//now original string is changed
		System.out.println(sb);//prints HJavaello
		
		sb.replace(1, 3, "Tes");
		System.out.println(sb);//prints HJavalo
		
		sb.delete(1, 3);
		System.out.println(sb);//print Hlo
	}

}
