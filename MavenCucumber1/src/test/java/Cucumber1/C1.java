package Cucumber1;



import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class C1 {
	ChromeDriver ob;
		
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ob=new ChromeDriver();
		ob.get("http://www.mycontactform.com");   
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		ob.findElementById("user").sendKeys("Dhivyakarthik123");
		ob.findElementByName("pass").sendKeys("12345");
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
		ob.findElementByClassName("btn_log").click();  
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		Thread.sleep(2);
		ob.quit();
	    
	}
}
