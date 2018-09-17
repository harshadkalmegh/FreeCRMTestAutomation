
public class Constrcutor {
	
	//default Constructor
	public Constrcutor(){
		System.out.println("default Constructor");
	}

	//Single Parameter constructor
	public Constrcutor(int i){
		System.out.println("one parameter Constructor");
		System.out.println("Value of i is"+i);
	}

	//two Parameter constructor
	public Constrcutor(int i,int j){
		System.out.println("two parameter Constructor");
		System.out.println("Value of i is"+i);
		System.out.println("Value of j is"+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constrcutor c=new Constrcutor();
		Constrcutor c1=new Constrcutor(10);
		Constrcutor c2=new Constrcutor(10,20);
	}

}
