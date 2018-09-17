package selRCtcs;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.SeleneseTestCase;
import com.thoughtworks.selenium.Selenium;


public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Selenium sel= new DefaultSelenium("localhost",4444,"*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		sel.start();
		sel.open("/");
		String Tile=sel.getTitle();
		System.out.print(Tile);
		sel.windowMaximize();
		sel.close();
	}

}
