package TestGn_Firest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Suite2 {
  @Test
  public void f() {
	  System.out.println("Testing");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
  System.out.println("after Method");
  }

}