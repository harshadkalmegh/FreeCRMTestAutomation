import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={4,5,4,4,6,9,5};
		
		ArrayList <Integer> ab=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) 
		{ 
			int k=0;
		 	if(!ab.contains(a[i]))
			 { 
			ab.add(a[i]);
			 k++; 
			for(int j=i+1;j<a.length;j++) 
			{
			 if(a[i]==a[j]) 
			{ k++; 
			} } 
			System.out.println("the value is" +a[i]); 
			System.out.println("the count is" +k); 
			if(k==1) System.out.println(a[i]+"is unique number"); 
		}
		 }
		 }

		}

