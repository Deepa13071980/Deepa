package tetngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class T2 {

	@Test
	public void t3()
	{
		
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver ob=new ChromeDriver();
			ob.get("http://www.google.com");
			WebDriverWait w= new WebDriverWait(ob,5);
			
			//title
			
			w.until(ExpectedConditions.titleIs("Google")); //5
			w.until(ExpectedConditions.titleContains("oo")); //5
			
			//alert is present or not
			//w.until(ExpectedConditions.alertIsPresent());
			
			//visibility of an element
			//finding the element and checking its visibility 
			w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail"))); //5
			
			//visibility of more elements
			// images=> collect=> visible
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img"))); //5
			
			//element is clickable or not
		    // finding the element and checking whether it is clickable or not
			//w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images"))); //5
			
			ob.quit();
	}
}
