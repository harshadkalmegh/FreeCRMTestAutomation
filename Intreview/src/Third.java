
public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array=new int [8];
		
		System.out.println(array.length);
		
		for (int count=0;count<8;count++){	
			array[count]=count+1;
		}
		
		for(int count=0;count<7;count++){
			System.out.println("array["+count+"]=" +array[count]);
		}
		
		String[] a={"Harshad","Samiksha"};
		for(int count=0;count<2;count++){
		System.out.println(a[count]);
		}

	}

}
