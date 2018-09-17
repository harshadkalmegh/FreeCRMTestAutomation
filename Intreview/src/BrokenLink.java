import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {

	public static <WebElement, Webdriver> void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kalmegh\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//1.who many link and imgaes are there
		List<WebElement> LinkList=driver.findElements(By.tagName("a"));
		LinkList.addAll(driver.findElements(By.tagName("img")));
		
		//2.check for active list
		List<WebElement> activelist=new ArrayList<WebElement>();
		
		for(int i=0;i<LinkList.size();i++)
		if(LinkList.get(i).getAttribute("href") !=null){
			activelist.add(LinkList.get(i));
		}

		for (int j=0;j<activelist.size();j++)
		HttpConnection connect= (HttpConnection) new URL(activelist.get(i).getAttribute("href")).openConnection();
		((URLConnection) connect).connect();
		connect.getResponseMessage();
		connect.disconnect();
		System.out.println(activelist.get(j).getAttribute("href")+"--->"+reponse);
		
				
	}

}
