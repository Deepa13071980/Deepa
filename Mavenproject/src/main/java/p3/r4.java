package p3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class r4 {
	
	@Test
	public void bt()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob;
		
		 ob =new ChromeDriver();
		ob.get("http://www.google.com");
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(ob.getTitle(), "skdfkndknf");
		s.assertNotEquals(ob.getTitle(), "skdfkndknf");
		WebElement ele = ob.findElementByLinkText("Gmail");
		s.assertTrue(ele.isDisplayed());
		s.assertFalse(ele.isSelected());
		ob.quit();
		s.assertAll();
	}

}



