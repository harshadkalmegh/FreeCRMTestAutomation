
public class Odd_Number {

	private static char[] sum;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int oddn=0;
		for(int i=2;i<=100;i++){
			if(i%2!=0)
			{
				oddn=oddn+i;
				System.out.println(i);
			}
		}
		System.out.println(oddn);
		int sum=0;
		for (int j=0;j<=100;j++)
		{
			sum=sum+j;
				
		}
		System.out.println("Total sum is for 100 is " +sum);
	}
	

}
