
public class ThisKeyword {

	String name;
	int i;
	
	public ThisKeyword (String name, int i){
		this.name=name;
		this.i=i;
		System.out.println(name);
		System.out.println(i);
		
	}
	
	public void m2(String name,int i){
		this.name=name;
		this.i=i;
		System.out.println(name);
		System.out.println(i);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword t=new ThisKeyword("Harshad", 10);
		t.m2("Harshad1", 20);
	}

}
