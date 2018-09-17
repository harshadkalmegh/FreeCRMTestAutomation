import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTC {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kalmegh\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		String Username="Admin";
		String Password="admin";
		String BaseURL="http://opensource.demo.orangehrmlive.com";
		
		d.get(BaseURL);
		Thread.sleep(5000);
		WebElement User=d.findElement(By.name("txtUsername"));
		User.sendKeys(Username);
		d.findElement(By.id("txtPassword")).sendKeys(Password);
		d.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(10000);
		if (d.findElement(By.id("menu_admin_viewAdminModule")).isDisplayed())
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
	d.quit();

	String BaseURLL="https://apache.prospectportal.com/Apartments/module/application_authentication/property[id]/212858/show_in_popup/false/kill_session/1/";
	WebDriver d1 = new FirefoxDriver();
	d1.get(BaseURLL);
	Thread.sleep(5000);
	d1.findElement(By.name("applicant[name_first]")).sendKeys("Harshad");
	d.quit();
	}

}
