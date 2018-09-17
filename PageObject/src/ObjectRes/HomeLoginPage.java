package ObjectRes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeLoginPage {
	
	
	public HomeLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	
	WebDriver driver;
	
	By username= By.xpath("//input[@name='email']");
	By Nextbutton= By.xpath("//span[@class='RveJvd snByac']");
	
	public WebElement email(){
		
		return driver.findElement(username);
	}
	

public WebElement button(){
		
		return driver.findElement(Nextbutton);
	}
	
}
