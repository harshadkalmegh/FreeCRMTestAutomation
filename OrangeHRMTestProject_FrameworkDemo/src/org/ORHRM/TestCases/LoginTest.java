package org.ORHRM.TestCases;



import java.io.IOException;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.ORHRM.TestMethods.LoginModuleTestMethods;
import org.ORHRM.UtilityMethods.ExcelFileHandling;
import org.ORHRM.UtilityMethods.PublicVars;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.Assertion;

public class LoginTest {
	WebDriver d;
	LoginModuleTestMethods login =new LoginModuleTestMethods();
	ExcelFileHandling Exl=new ExcelFileHandling(PublicVars.UseExcelFileName);
	ExcelFileHandling ResultUpdate=new ExcelFileHandling(PublicVars.TestCaseFileName);
@Test
  public void LoginTest() throws RowsExceededException, BiffException, WriteException, IOException {
	try
	{
	   Assert.assertTrue(login.Login(d));
	   ResultUpdate.UpdateResult("TC_1", "Passed");
	}
	catch(Exception ex)
	{
		System.out.println("There is an error in test");
		ResultUpdate.UpdateResult("TC_1","Failed");
	}
  }
  @BeforeMethod
  public void beforeMethod() {
	  d=new FirefoxDriver();
	  d.get(Exl.GetParameter("URL"));
  }

  @AfterMethod
  public void afterMethod() {
	  d.quit();
  }

}
