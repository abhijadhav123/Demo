package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_10 {
	
	@Test
public  void B1() {
		

	SoftAssert Soft= new SoftAssert();
	
		System.out.println("username");
		System.out.println("password");
		String Actualtitle="Test";
		String Expectedtitle="Test1";
		
		Soft.assertEquals(Actualtitle, Expectedtitle);
		
		System.out.println("bwoserclose");
		
		Soft.assertAll();
	}

}
