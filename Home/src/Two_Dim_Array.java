
public class Two_Dim_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s[][]=new String[3][4];
		
		s[0][0]="A";
		s[0][1]="A";
		s[0][2]="A";
		s[0][3]="A";
		
		s[1][0]="B";
		s[1][1]="B";
		s[1][2]="B";
		s[1][3]="B";

		s[2][0]="B";
		s[2][1]="B";
		s[2][2]="B";
		s[2][3]="B";

		System.out.println(s.length);
		System.out.println(s[0].length);
		int rows=s.length;
		int cols=s[0].length;
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println(s[rows][cols]+ "-----");
			}
			
		}
	}

}
