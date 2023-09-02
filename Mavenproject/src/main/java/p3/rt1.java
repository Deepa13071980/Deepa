package p3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rt1 {
	
	ChromeDriver ob;
	@Test(priority=0)
	public void t1()
	{
		System.out.println("Test case 1" + ob.getTitle());
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before tst ");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after test ");
		ob.quit();
	}
	@Test(priority=1)
	public void t2()
	{
		System.out.println("Test case 2");
		ob.findElementByLinkText("Images").click();
	}
	
	
	
	@BeforeClass
	public void btc()
	{
		System.out.println("before class ");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void atc()
	{
		System.out.println("after class " + ob.getCurrentUrl());
	}
	
	@BeforeMethod
	public void btm()
	{
		System.out.println("before method ");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void atm()
	{
		System.out.println("after method ");
		ob.manage().deleteAllCookies();
	}

}



