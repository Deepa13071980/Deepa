package tetngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class t3 {

	@Test
	public void t4()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.google.com");
		//Declare and initialise a fluent wait
				FluentWait w = new FluentWait(ob);
				
				//Specify the timout of the wait
				w.withTimeout(6000, TimeUnit.MILLISECONDS);
				
				//Sepcify polling time
				
				w.pollingEvery(2000, TimeUnit.MILLISECONDS);
				
				w.until(ExpectedConditions.alertIsPresent());
	}
}
