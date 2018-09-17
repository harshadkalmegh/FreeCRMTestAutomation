package ExcludePackage;

import org.testng.annotations.Test;

public class ExcludeClass {
  @Test
  public void f() {
	  System.out.println("F");
  }
  @Test
  public void One(){
	  System.out.println("One");
  }
  @Test
  public void Two(){
	  System.out.println("Two");
  }
  @Test
  public void Three(){
	  System.out.println("Three");
	  
  }
}
