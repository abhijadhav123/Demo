package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_9 {
	
	@Test
	
	public  void A1() {
		
		System.out.println("username");
		System.out.println("password");
		String Actualtitle="Test";
		String Expectedtitle="Test1";
		
		Assert.assertEquals(Actualtitle, Expectedtitle);
		
		System.out.println("bwoserclose");
	}
   
	@Test
	
	public void B1() {
		
		System.out.println("B1");
	}
}
