package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin {
	
	@Test
	public void VerifyLoginTest(){
		
		
		WebDriver ldriver=browserFactory.startBrowser("chrome","");
		ldriver.get("https://www.facebook.com/");
		ElementDefination opage=PageFactory.initElements(ldriver, ElementDefination.class);
		
		opage.LogintoApp("kumattt", "djklalll");
		
	}
}
