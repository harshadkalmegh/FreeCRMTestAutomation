import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScriptExec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalmegh\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver d =new ChromeDriver();
		
		//d.navigate();
		//d.na

		d.get("http://www.facbook.com");
		JavascriptExecutor je=(JavascriptExecutor)d;
		String ax=(String)je.executeScript("return document.title");
		System.out.println(ax);
		//WebElement loginBtn=(WebElement)je.executeScript("document.getElementById('glaeGLAccount_drop Text')");
		d.quit();

		//boxing:- object type to variable type.
		//unboxing:- variable type to object type.

	}

}
