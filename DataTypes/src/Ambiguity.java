
interface y {

	public void m1();
}


interface x{
	
	public void m1();
}


class Ambiguity implements y, x {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
		System.out.println("Inerface");
		
		
	}
	
	public static void main (String agr[]){
		Ambiguity js=new Ambiguity();
		js.m1();
		
	}

	
}