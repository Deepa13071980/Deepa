package p2;

import org.testng.annotations.Test;

public class T3 {

	@Test(priority=0)
	public void visiting()
	
	{
		System.out.println("visiting");
	
	}
	@Test(priority=1,dependsOnMethods="visiting")
	public void login()
	{
		System.out.println("login");
	}

}
