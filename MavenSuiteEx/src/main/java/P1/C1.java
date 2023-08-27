package P1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C1 {
	@Test(groups="one")
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.mycontactform.com");
		ob.quit();
	}
	
}
