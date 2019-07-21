package utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverHandler {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement ele=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//div[@class='dropdown-content']//a[text()='TestNG']")).click();
//		List<WebElement> olists=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		
		
		
		
		
		
		

	}

}
