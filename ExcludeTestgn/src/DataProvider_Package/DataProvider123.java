package DataProvider_Package;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvider123 {
  @Test(dataProvider = "TestData")
  public void f(String n, String s) {
	  System.out.println("Username: "+n+" Password: "+s);
  }

  @DataProvider
  public Object[][] TestData() {
    Object[][] data=new Object[3][2];
    
    data[0][0]="U1";
    data[0][1]="P1";
    
    data[1][0]="U2";
    data[1][1]="P2";
    
    data[2][0]="U3";
    data[2][1]="P3";
	  return data; 
  }
}
