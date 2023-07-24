package Test;

import org.testng.annotations.Test;

public class Test4 {

	@Test(groups="sanity")
	public void m1() {
		System.out.println("this is test m1");
	}
	
	@Test(groups="regression")
	public void m2() {
		System.out.println("this is test m2");
	}
	
	@Test(groups="sanity,regression")
	public void m3() {
		System.out.println("this is test m3");
	}
	
}
