package utility;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Hard Assertation
public class AssertationDemo {

	
		@Test
		public void SoftTest(){
			
			SoftAssert art=new SoftAssert();
			System.out.println("Test Method 1 Started");
			art.assertEquals(12, 13,"Expected not matched With Actual");
			System.out.println("Test Method 1 Completed");
			art.assertAll();
		}
		
		@Test
		public void HardTest(){
			
			SoftAssert art=new SoftAssert();
			System.out.println("Test Method 2 Started");
			Assert.assertEquals(12, 13,"Expected not matched With Actual");
			System.out.println("Test Method 2 Completed");
		}
		
}
