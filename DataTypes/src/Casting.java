
public class Casting {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// It called Implicitly Type casting
		int x='a';
		System.out.println(x);
		
		//It called explicitly type casting 
		int y=150;
		//byte b=y; it will give error
		byte b=(byte) y;
		System.out.println(b);
		
		//class casting
		Casting a=new ChildCasting();
		//ChildCasting b=a; it will give complier error
		ChildCasting c=(ChildCasting)a;
		c.m1();
	}

}

class ChildCasting extends Casting{
	
	void m1(){
	System.out.println("Casting");
	}
}
