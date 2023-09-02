package p2;

import org.testng.annotations.Test;

public class t4 {

	
	@Test(priority=0,groups="s1")
	public void a()
	{
		System.out.println("A");
		
	}
	@Test(priority=1,groups="s1")
	public void b()
	{
		System.out.println("b");
	}
	@Test(priority=2,dependsOnGroups="s1")
	public void c()
	
	{
		System.out.println("c");
	}
	
	
	
}
