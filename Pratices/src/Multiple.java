

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.internal.Sets;
import com.google.common.collect.Iterators;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kalmegh\\Desktop\\Selenium\\Chorme\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(20000);
		d.findElement(By.xpath("//a[@target='_blank']")).click();
		System.out.println(d.getTitle());
		Set<String>ids=d.getWindowHandles();
		Iterator it=ids.iterator();
		
		String Parentid=ids.next();
		String Childid=ids.next();
		
		d.switchTo().window(Childid);
		System.out.println(d.getTitle());
		
		d.switchTo().window(Parentid);
		
		System.out.println(d.getTitle());
		
		
	}

}
