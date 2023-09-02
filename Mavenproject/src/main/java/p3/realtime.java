package p3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(test1.c2.class)
public class realtime {
	
	ChromeDriver ob;
	@Test(priority=0,description="visiting website",groups="N")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1,description="maximising website",groups="N")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2,description="refreshing website",invocationCount=3,groups="N")
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3,description="clicking",dependsOnGroups="N")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4,description="closing website",dependsOnGroups="N",timeOut=4000)
	public void closing() throws InterruptedException
	{
		Thread.sleep(3000);
		ob.quit();
		
	}
	
	}


