import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActionTCFirst {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kalmegh\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		String Username="Admin";
		String Password="admin";
		String BaseURL="http://opensource.demo.orangehrmlive.com";
		
		d.get(BaseURL);
		Thread.sleep(5000);
		WebElement User=d.findElement(By.name("txtUsername"));
		User.sendKeys(Username);
		d.findElement(By.id("txtPassword")).sendKeys(Password);
		d.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(20000);
		//d.findElement(By.id("menu_admin_viewAdminModule")).click();
		//Thread.sleep(10000);
		Actions action = new Actions(d);
		action.moveToElement(d.findElement(By.id("menu_admin_viewAdminModule"))).moveToElement(d.findElement(By.id("menu_admin_UserManagement"))).moveToElement(d.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"))).click().build().perform();
	   
		//Implicit wait(it will wait till the given timeout and it will use only with findElement)
		d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		//Explicit Wait(it will wait for condition or element and it will wait till mentioned time who will come first it will perform condition)
		WebDriverWait wait=new WebDriverWait(d,20);//here, wait time in second
		wait.until(ExpectedConditions.visibilityOf(d.findElement(By.id("d"))));
		
		//fluent wait(it will consider polling time first)
		new FluentWait<WebElement>(d.findElement(By.id("d"))).
		withTimeout(10,TimeUnit.SECONDS).
		pollingEvery(100,TimeUnit.MILLISECONDS);
		
		
	}

}
