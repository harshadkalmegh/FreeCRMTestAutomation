import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Paytm {

	

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalmegh\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver d =new ChromeDriver();
		d.get("https://paytm.com");
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[@id='app']/descendant::div[@class='_3ac-']")).click();
		Thread.sleep(6000);
		d.switchTo().frame(d.findElement(By.xpath("//div[@class='_1MBe transparent']/descendant::iframe")));
		d.findElement(By.xpath("//*[@id='input_0']")).sendKeys("9975951609");
		d.findElement(By.xpath("//*[@id='input_1']")).sendKeys("Getz@007");
		d.findElement(By.cssSelector("button[type='submit']")).click();
		String Text =d.findElement(By.cssSelector("span[class='ng-binding']")).getText();
		
		System.out.println(Text);
		if(Text.contains("1609"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
	}

}
