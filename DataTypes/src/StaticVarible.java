
public class StaticVarible {
	
	public static String name="Harshad";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(name);
		Staticcalled SC= new Staticcalled();
		SC.called();
		

	}

}

 class Staticcalled
{
	public void called(){
		
		System.out.println(StaticVarible.name);
	}
	
	}
