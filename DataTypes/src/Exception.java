import org.openqa.selenium.remote.server.handler.GetPageSource;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class Exception {
	
	public static void main(String agrs[]){
	
	int i=20,j=0;
	 try{
		 
		 int f=20/0;
		 System.out.println("Pass");
	 }
	 
	 catch(ArithmeticException e){
		 System.out.println("Failtype" +e);
	 }
	 finally{
			System.out.println("Inside the finally block1");
		  }

	 
	 System.out.println("Main Page");
	 
		  try {
		   int d = 0;
		   int n = 20;
		   int fraction = n / d;
		   int g[] = {
		    1
		   };
		   g[20] = 100;
		  }
		  
		 /* catch(Exception e){
		  	System.out.println("In the catch clock due to Exception = "+e);
		  }*/
		  catch (ArithmeticException e) {
		   System.out.println("In the catch clock due to Exception = " + e);
		  } 
		  
		  System.out.println(SwitchToFrame.);
		  catch (ArrayIndexOutOfBoundsException e) {
		   System.out.println("In the catch clock due to Exception = " + e);
		  }
		  finally{
				System.out.println("Inside the finally block2");
			  }
		  

		  System.out.println("End Of Main");
		 }
		
}
	