
public class This {
	
	int a;
	int b;
	
	void m1(int a, int b){
		
		this.a=a;
		this.b=b;
	}
	void m2(){
		
		System.out.println("The Value of a is "+a);
		System.out.println("The Value of a is "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		This obj=new This();
		obj.m1(2, 3);
		obj.m2();

	}

}
