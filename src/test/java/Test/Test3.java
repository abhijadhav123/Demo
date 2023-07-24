package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {

	@Test(priority=-1,enabled=false)
	
	public void Z() {
		System.out.println("Z Test");
	}
	@Test(priority=1,invocationCount=2)
	public void A() {
		System.out.println("A Test");
	}
	@Test(priority=0)
	public void G() {
		System.out.println("G Test");
	}
	
	@Test(priority=0)
	public void H() {
		System.out.println("H Test");
		Assert.assertTrue(false);
	}
	
	@Test(priority=0,dependsOnMethods= {"H"})
	public void R() {
		System.out.println("R Test");
	}
}

