package Testgn3;

import org.testng.annotations.Test;

public class FiveClass {
  @Test(priority=90)
  public void first() {
	  System.out.println("90");
  }
  
  @Test(priority=92)
  public void Second() {
	  System.out.println("92");
  }
  
  @Test(priority=89)
  public void Thrid() {
	  System.out.println("89");
  }
  
  @Test(priority=100)
  public void fourth() {
	  System.out.println("100");
  }
}
