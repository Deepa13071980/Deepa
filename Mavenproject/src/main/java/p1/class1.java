package p1;

import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.mycontactform.com");
	}

}
