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

public class MouseHoverHandler_RightStart {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://rightstartmath.com/");
		
		Thread.sleep(1000);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Our Curriculum']//parent::li[@id='menu-item-45']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).perform();
		
		WebElement eles=driver.findElement(By.xpath("//a[text()='Our Products']//parent::li[@id='menu-item-72']"));
		
		action.moveToElement(eles).perform();
		
		WebElement oele=driver.findElement(By.xpath("//*[@id='menu-item-74']//a[text()='Tutoring and Games']"));
		
		action.moveToElement(oele).click().build().perform();
		
//	   WebDriverWait wait=new WebDriverWait(driver,30);
//		
//	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shirts']"))).click();
	
	

		

		
		
		
		
		

	}

}
