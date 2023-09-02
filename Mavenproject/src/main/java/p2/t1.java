package p2;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;

public class t1 {
	
	@Test(priority=1,description="hi",groups="g")
	public void m2()
	{
		System.out.println("Test case1");
	}
	@Test(priority=3,description="welcome",groups="g",invocationCount=4)
	public void m3()
	{
		System.out.println("Test case2");
	}
	
	@Test(priority=2,description="hello",groups="e",invocationCount=5,enabled=false)
	public void m1()
	{
		System.out.println("Test case3");
	}
	

}
