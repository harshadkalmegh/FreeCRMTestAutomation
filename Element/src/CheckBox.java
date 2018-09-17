import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckBox {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kalmegh\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		String Username="Admin";
		String Password="admin";
		String BaseURL="http://opensource.demo.orangehrmlive.com";
		
		d.get(BaseURL);
		Thread.sleep(5000);
		WebElement User=d.findElement(By.name("txtUsername"));
		User.sendKeys(Username);
		d.findElement(By.id("txtPassword")).sendKeys(Password);
		d.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(10000);
		d.findElement(By.id("menu_admin_viewAdminModule")).click();
		//Thread.sleep(5000);
		//SelectAllCheckBox(d,"Check");
		Thread.sleep(5000);
		SelectUserCheckBox(d,"john.smith");

	}

	public static void SelectAllCheckBox(WebDriver d, String option)
	{
		String CheckResult=d.findElement(By.id("ohrmList_chkSelectAll")).getAttribute("checked");
		
		if(CheckResult!=null)
		{
			if(option.equals("Check"))
			{
				System.out.println("Check Box is Already Checked");
				
			}
			else
			{
				d.findElement(By.id("ohrmList_chkSelectAll")).click();
				
			}
			
		}
		
		else
		{
		if(option.equals("Check"))
		{
			d.findElement(By.id("ohrmList_chkSelectAll")).click();	
			System.out.println("Now Checkbox is checked");
		}
		else
		{
			System.out.println("Check Box is Already Unchecked");
			
		}
		
		}
		if("checked"!=null)
		{
			System.out.println("Check Box is Already Checked");
		}
		else
		{
			System.out.println("Check Box is Already unChecked");
		}
		
	}
	
	public static void SelectUserCheckBox(WebDriver d, String Name) throws InterruptedException
	{
		
		WebElement e=d.findElement(By.id("resultTable")).findElement(By.tagName("tbody"));
		List <WebElement> rows=e.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(WebElement row:rows)
		{
			List <WebElement> Cols=row.findElements(By.tagName("td"));
			System.out.println(Cols.size());
			System.out.println(row.getAttribute("class"));
			if(Cols.get(1).getText().equals(Name))
			{
				System.out.println(Cols.get(1).getText());
				System.out.println(Cols.get(0).findElement(By.tagName("input")).getAttribute("id"));
				Thread.sleep(5000);
				Cols.get(0).findElement(By.tagName("input")).click();
				break;
			}
			
		}
	}
}