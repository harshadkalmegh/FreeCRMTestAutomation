import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class UIElement {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kalmegh\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		String Username="mercury";
		String Password="mercury";
		String URL="http://newtours.demoaut.com";
		
		d.get(URL);
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='userName']")).sendKeys(Username);
		d.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		d.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(10000);
		SelectTrip(d,"oneway");
		Thread.sleep(10000);
		SelectClass(d,"FirstClass");
		Thread.sleep(10000);
		SelectPass(d,"2");
		//Thread.sleep(10000);
		//SelectPass(d,"March");
	}
	public static void SelectTrip(WebDriver d,String option)
	{
		if(option=="roundtrip")
		{
			
			d.findElement(By.cssSelector("input[value='roundtrip']")).click();
		}
		else
		{
			
			d.findElement(By.cssSelector("input[value='oneway']")).click();
		}
		
	}
	
	public static void SelectClass(WebDriver d,String flight) 
	{
		switch(flight)
		{
		case "Cclass":
		d.findElement(By.xpath("//input[@value='servClass']")).click();
		break;
		case "Bclass":
		d.findElement(By.xpath("//input[@value='Business']")).click();
		break;
		case "FirstClass":
		d.findElement(By.xpath("//input[@value='First']")).click();
		break;
		}

	}
	
	public static void SelectPass(WebDriver d,String option)
	{
		Select pass=new Select(d.findElement(By.name("passCount")));
		pass.selectByValue(option);
		Select passs=new Select(d.findElement(By.name("fromMonth")));
		passs.selectByVisibleText("March");
		
	}
}
