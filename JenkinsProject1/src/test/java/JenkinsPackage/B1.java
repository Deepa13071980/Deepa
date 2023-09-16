package JenkinsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B1 {
	
	@Test
	
	public void t2()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		ob.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(ob.getTitle());
		System.out.println(ob.getCurrentUrl());
		ob.navigate().refresh();
		ob.quit();
		
		
		
	}

}
