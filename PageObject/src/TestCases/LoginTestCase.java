package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ObjectRes.HomeLoginPage;

public class LoginTestCase {
	
	@Test
	public void test(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kalmegh\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		HomeLoginPage Login=new HomeLoginPage(driver);
		Login.email().sendKeys("harshad");
		Login.button().click();
		
	}

}
