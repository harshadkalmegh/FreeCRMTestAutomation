
public class Hierachinal {

	void multi(){
		int multi=2*2;
		System.out.println(multi);
		
	}

	
}

class c extends Hierachinal{
	void add(){
		int add =20+20;
		System.out.println(add);
		
	}
	
}

class b extends Hierachinal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b hi=new b();
		hi.multi();
	
	
}

}



