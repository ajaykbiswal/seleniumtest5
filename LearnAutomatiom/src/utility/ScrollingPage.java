package utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollingPage {
	
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.naukri.com/");
		WebElement ele=driver.findElement(By.xpath("//p[@class='blocTxt' and contains(text(),'Connect to')]"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
//		je.executeScript("scroll(0, 400)");
		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		System.out.println(ele.getText());
		
		Alert alert=new WebDriverWait(driver,20).until(ExpectedConditions.alertIsPresent());
		
		alert.authenticateUsing(new UserAndPassword("user","password"));
		
		
		TakesScreenshot te=(TakesScreenshot)driver;
		File src=te.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("../ScreenshootFolder/test.png"));
		
				
				
				
	}

	

}
