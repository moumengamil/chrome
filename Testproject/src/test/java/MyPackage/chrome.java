package MyPackage;

import java.io.File;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chrome {
	@Test
	public void test(){
		
		String exePath="src\\main\\resources\\chromedriver.exe";
		File exeFile=new File(".",exePath);
		//System.out.println(exeFile.getAbsolutePath());
		
System.setProperty("webdriver.chrome.driver", exeFile.getAbsolutePath());

	WebDriver driver = new ChromeDriver();

	 String  baseUrl = "http://google.com";

	   driver.get(baseUrl);
		
		
	}
	    

}
