package basicPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownAscDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver.", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/");
		Select tools=new Select(driver.findElement(By.xpath("//select[@id='tools']")));
		List<WebElement> elements=tools.getOptions();
		List<String> actuallist=new ArrayList<>();
		
		for(WebElement ele:elements){
			
			if(ele.getText().equals("")){
				
			}
		}
		
		

	}

}
