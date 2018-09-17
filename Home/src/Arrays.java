
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str[]=new String[5];
		str[0]="xxx";
		str[1]="yyy";
		str[2]="email@yahoo.com";
		str[3]="123";
		str[4]="123456";
		
		System.out.println(str.length);
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println();
		
		for(int j=str.length-1;j>=0;j--)
		{
			System.out.println(str[j]);
	
		}

String x="We are learning";
String y="mistakes happen";
int z=1000;
System.out.println("Java is easy. "+x+" selenium and "+y+" "+z +" times");
	}
	
	
	

}
