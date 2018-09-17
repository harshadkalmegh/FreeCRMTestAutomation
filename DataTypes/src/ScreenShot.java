import java.io.File;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.sun.jna.platform.FileUtils;

public class ScreenShot {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void take(String filename){
		
		//1.take screen shot and store the file
		
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		//2.now copy screen shot and save to desirved location
			FileUtils.copyfiles(file, new File("C:\Users\Kalmegh\workspace\DataTypes\src"+filename+".jpg"));
	}
}
