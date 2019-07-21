package utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopHandler {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.freecrm.com/index.html");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ajayk123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ajayk123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='raj kumar']//parent::td[@class='datalistrow']//preceding-sibling::td//input[@type='checkbox']")).click();
		
		
		
//		driver.findElement(By.xpath("//div[contains(@class,'goog-inline') and @title='Location']")).click();
//		List<WebElement> olists=driver.findElements(By.xpath("//div[contains(@class,'menuitem-content')]"));
//		
//		for(int i=0;i<olists.size();i++){
//			
//			String value=olists.get(i).getAttribute("innerHTML");
//			
//			if(value.equalsIgnoreCase("Andorra")){
//				
//				olists.get(i).click();
//				
//				break;
//				
//			}
//		}
//
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File srcfile=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcfile, new File("./ScreenshootFolder/google.png"));
//		
		
		
		
	}

}
