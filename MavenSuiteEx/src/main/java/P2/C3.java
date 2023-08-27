package P2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C3 {
@Test(groups="two")
	public void test3() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
	ChromeDriver ob=new ChromeDriver();
	ob.get("http://www.google.com");
	TimeUnit.SECONDS.sleep(6);
	ob.manage().window().maximize();
	ob.findElementByPartialLinkText("Im").click();
	//ob.findElementByLinkText("Images").click();
	//Thread.sleep(2);
	ob.findElementByLinkText("Privacy").click();
	
	ob.quit();
	
	}
	
}
