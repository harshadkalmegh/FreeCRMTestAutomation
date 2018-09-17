package ObjectRes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomeLoginPagePF {
	
	public HomeLoginPagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=("//input[@name='email']"))
	WebElement email;
	
	@FindBy(xpath=("//span[@class='RveJvd snByac']"))
	WebElement button;
	
	public WebElement email(){
		
		return email;
	}
	

public WebElement button(){
		
		return button;
	}
	


}
