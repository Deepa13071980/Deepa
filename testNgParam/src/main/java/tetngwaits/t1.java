package tetngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class t1 {

	@Test
	public void t2()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		ob.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(ob.getTitle());
		System.out.println(ob.getCurrentUrl());
		ob.navigate().refresh();
		
		
		
	}
}
