package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapPopHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[@id='signin-block']//i[@id='i-icon-profile']")).click();
		driver.findElement(By.xpath("//li[@id='signInLink' and contains(text(),'Sign In/Sign Up')]")).click();
		WebElement ele=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(ele);
	    driver.findElement(By.xpath("//button[ contains(text(),'signup with email')]")).click();
		driver.quit();	

	}

}
