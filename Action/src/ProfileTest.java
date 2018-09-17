import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class ProfileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kalmegh\\Desktop\\Selenium\\geckodriver.exe");
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.startup.homepage", "http://www.google.com");
		File f=new File("C:\\Users\\Kalmegh\\Desktop\\Selenium\\FirebugExtension\\firebug-2.0.17-fx.xpi");
		profile.addExtension(f);
		WebDriver d=new FirefoxDriver(profile);
		WebElement element=d.findElement(By.id("gs_htif0"));
		element.sendKeys("100");

	}

}
