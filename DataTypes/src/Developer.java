
public class Developer implements Banking,BankingApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Developer d=new Developer();
		d.AppleApp();
		d.ATM();
		d.manual();
		Banking dr=new Developer();// run polysim we can call only method under banking interface 
		
	}

	@Override
	public void ATM() {
		// TODO Auto-generated method stub
		System.out.println(a);
		
	}

	@Override
	public void AppleApp() {
		// TODO Auto-generated method stub
		
	}

	public void manual(){
		
	}
}
