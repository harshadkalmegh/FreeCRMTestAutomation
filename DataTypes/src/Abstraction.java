public class Abstraction{
	
	public static void main(String args[]){
		har obj=new swp();
		obj.m2();
	}
}

abstract class har {

	abstract void m2();
}

class swp extends har{
	
	public void m2(){
		
		System.out.println("Run");
	}
}