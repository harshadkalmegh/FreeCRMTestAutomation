package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestNG test=new TestNG();
		
		List <String> list=new ArrayList<String>();
		
		list.add("C:\\Users\\Kalmegh\\workspace\\ExcludeTestgn\\test-output\\Suite\\testng-failed.xml");
		
		test.setTestSuites(list);
		
		test.run();

	}

}
