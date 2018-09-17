import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.Pattern;
public class Image {

	/**
	 * @param args
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * @throws FindFailed 
	 */
	public static void main(String[] args) throws AWTException, InterruptedException, FindFailed {
		Robot r=new Robot();
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kalmegh\\Desktop\\Selenium\\geckodriver.exe");
WebDriver d=new FirefoxDriver();
d.get("http://www.google.co.in");
Thread.sleep(6000);
Screen s =new Screen();
Pattern p1 = new Pattern("E:\\Selenium\\Capture.PNG");
//s.click(p);
Thread.sleep(6000);
//Pattern p1=new Pattern("Path");
s.click(p1);

if(s.exists(p1)!=null)
		{
	s.type(p1,"test match ind vs aus score live");
	r.keyPress(KeyEvent.VK_ENTER);
		}


	}

}
