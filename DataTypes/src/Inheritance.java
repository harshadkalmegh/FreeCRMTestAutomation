
public class Inheritance {

	String Teacher="Harshad";
	String Book="BookBeginner";
	
}


class Parent extends Inheritance{
	char Classroom='A';
	void method(){
		int sum=10+20;
		System.out.println(sum);
		
	}
	
}


 class Child extends Parent{
	
	 String Subject="Maths";
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 Child ch = new Child();
		 System.out.println(ch.Teacher);
		 System.out.println(ch.Book);
		 System.out.println(ch.Subject);
		 System.out.println(ch.Classroom);
		 ch.method();
		}
}