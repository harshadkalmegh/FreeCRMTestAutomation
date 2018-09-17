package Group_Package;

import org.testng.annotations.Test;

public class Group {
  @Test(groups={"Regression","Sanity"})
  public void f() {
  System.out.println("Regression and Sanity Testing");
  }
  
  @Test(groups={"Sanity"})
  public void g(){
  System.out.println("Sanity Testing");
  }
  
  @Test(groups={"Regression"})
  public void h(){
	  System.out.println("Regression Testing");
  }
  
  @Test(groups={"Regression","Sanity"})
  public void j() {
  System.out.println("Regression and Sanity Testing");
  }
  
}
