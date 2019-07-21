package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;


public class MyFirstTestcase {
	@Test
	public void VerifyTitle(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
    
	@Test
	public void Test2(){
		
		System.out.println("Second Test");
		Assert.assertTrue(false);
	}
	
	
}
