package Param;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class c1 {
@Parameters({"u","v"})
	@Test
	public void testp(String a ,String b) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		ob.findElementById("user").sendKeys(a);
		ob.findElementByName("pass").sendKeys(b);
		TimeUnit.SECONDS.sleep(2);
		ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
		ob.quit();
	}
}
