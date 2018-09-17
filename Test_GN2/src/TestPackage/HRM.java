package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HRM {
	WebDriver d;
	@Test
	
  public void f() {
	  
	  d.findElement(By.id("txtUsername")).sendKeys("Admin");
	  d.findElement(By.id("txtPassword")).sendKeys("admin");
	  d.findElement(By.id("btnLogin")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalmegh\\Desktop\\Selenium\\chromedriver.exe");

	 d =new ChromeDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");

  }

  @AfterMethod
  public void afterMethod() {
	  d.quit();
  }

}
