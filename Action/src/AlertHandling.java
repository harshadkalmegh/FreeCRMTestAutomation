import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertHandling {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalmegh\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver d =new ChromeDriver();
		d.get("file:///C:/Users/Kalmegh/Desktop/JavaTraining/test.html");
		Thread.sleep(6000);
		d.findElement(By.xpath("//*[@id='selectTable']/tbody/tr[2]/td/button")).click();
		Alert a=d.switchTo().alert();
		//a.sendKeys("123");
		System.out.println(a.getText());
		a.accept();
		//a.dismiss();
		//boxing:- object type to variable type
		//unboxing:- variable type to object type
		
		
		
	}

}
