package utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverHandler_Filpkart {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Thread.sleep(1000);
		
		WebElement ele=driver.findElement(By.xpath("//a[@title='Men']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).perform();
				
	   WebDriverWait wait=new WebDriverWait(driver,30);
		
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shirts']"))).click();
	
	

		

		
		
		
		
		

	}

}
