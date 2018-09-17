
public class InstanceVarible {

	public String name;//can be used in sub class
	private int salary;//can be used within class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVarible IV=new InstanceVarible("Harshad");
		IV.emsalary(10000);
		IV.emprint();
		
	}
	
	//varible name assigned in the Constcutor 
	public InstanceVarible(String empname){
		name=empname;
		
	}

	public void emsalary(int empsalary){
		salary=empsalary;
		
	}
	
	public void emprint(){
		
		System.out.println("Employees name is " +name);
		System.out.println("Employee salary is" +salary);
	}
}
