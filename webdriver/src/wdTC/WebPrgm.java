package wdTC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebPrgm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\Kalmegh\\Desktop\\Selenium\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.get("http://google.com");
System.out.print(d.getTitle());
WebDriver d2= new FirefoxDriver();
d2.get("http://www.yahoo.com");
System.out.print(d2.getTitle());
	}

}
