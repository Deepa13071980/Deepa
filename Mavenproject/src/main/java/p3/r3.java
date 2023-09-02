package p3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(test1.c1.class)
public class r3 {
	
	@Test
	public void bt()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob;
		
		 ob =new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "skdfkndknf");
		Assert.assertNotEquals(ob.getTitle(), "skdfkndknf");
		WebElement ele = ob.findElementByLinkText("Gmail");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}

}
