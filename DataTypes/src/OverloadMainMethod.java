
public class OverloadMainMethod {

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		main(10);
		main("Harshad");
		main(10.00);

	}

	public static void main(int i) {
		
		System.out.println("Main Method with int");

	}

	public static void main(String name) {
	
	System.out.println("Main Method with string");

	}
	
	public static void main(double c) {
		
		System.out.println("Main Method with double");

	}

	

}
