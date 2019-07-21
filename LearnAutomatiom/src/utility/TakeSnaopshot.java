package utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import lib.CaptureScreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnaopshot {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		CaptureScreenshot.TakeScreenshot(driver,"Browser_Started");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ahjjdkka");
		CaptureScreenshot.TakeScreenshot(driver,"Type_UserName");
		driver.quit();
	
		

	}

	
	
	
	
}
