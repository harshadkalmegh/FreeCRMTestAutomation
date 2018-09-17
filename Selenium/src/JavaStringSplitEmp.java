	
	public class JavaStringSplitEmp {
	
		public static void main(String[] args) {
		
			String str="jan-feb-march-april-may-jun-july";
			String delimeter="-";
			String[] temp=str.split(delimeter);
	
			for (int i=0;i<temp.length;i++)
			{
			System.out.println(temp[i]);
			System.out.println("");
			}
			temp=str.split(delimeter,5);//n-1
			for(int j=0;j<temp.length;j++)
			{
			System.out.println(temp[j]);	
			}
		}
	
	}
