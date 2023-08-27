package P1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C2 {

	@Test(groups="one")
	public void test2() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		TimeUnit.SECONDS.sleep(8);
		
		ob.findElementById("user").sendKeys("Dhivyakarthik123");
		ob.findElementByName("pass").sendKeys("12345");
		File f=ob.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Lenovo\\deepa\\eclipse-workspace\\MavenSuiteEx\\src\\main\\java\\P1\\a.png"));
		TimeUnit.SECONDS.sleep(1);
		
		ob.findElementByClassName("btn_log").click();
		ob.quit();
	}
	
	}

