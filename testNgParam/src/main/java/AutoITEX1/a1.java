package AutoITEX1;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a1 {

	
		@Test
		public void t1() throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
			ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.monsterindia.com/seeker/registration"); //Testing webpage
			Thread.sleep(3000);
			ob.findElementByCssSelector("#basicDetails > div.padding-15 > div:nth-child(4) > div.uploadResumeCont > div").click();
	ob.get("https://www.monsterindia.com/seeker/registration"); //Testing webpage
		Thread.sleep(3000);
		//ob.findElementByCssSelector("#basicDetails > div.padding-15 > div:nth-child(4) > div.uploadResumeCont > div").click();
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\AutiIT files\\deepaa1.exe");
}
}

