
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mylist;
		mylist=new int[3];
		System.out.println(mylist[0]);
		
		int array[] = new int[7];
        for (int count=0;count<7;count++){
           array[count]=count;
       }
       for (int count=0;count<7;count++){
           System.out.println("array["+count+"] = "+array[count]);
       }

       int[][] twoD;
       twoD=new int [2][2];
       
       for (int count =0;count<2;count++){
    	   twoD[0][count]=count;
       }
       
       for (int count=0;count<2;count++){
           System.out.println("array["+count+"] ["+count+"] = "+array[count]);
       }

       
	}

}
