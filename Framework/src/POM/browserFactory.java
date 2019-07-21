package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserFactory {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String brName,String URL){
		
		if(brName.equalsIgnoreCase("firefox")){
			
			driver=new FirefoxDriver();
		}
		
		else if(brName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			WebDriver ldriver=new ChromeDriver();
			
		}
		else if(brName.equalsIgnoreCase("ie")){
			
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
		
	}

}
