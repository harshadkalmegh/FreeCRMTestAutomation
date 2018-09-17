import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DrgDrp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalmegh\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.theautomatedtester.co.uk/demo2.html");
		
		WebElement someElement=
				d.findElement(By.xpath("/html/body/div[1]"));
		WebElement otherElement=
				d.findElement(By.name("droppable"));
		
		Actions builder=new Actions(d);
		builder.dragAndDrop(someElement,otherElement).build().perform();
		
		

	}

}
