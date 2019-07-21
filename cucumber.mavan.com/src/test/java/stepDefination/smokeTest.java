package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
	WebDriver driver;
	@Given("^Open Chrome and start application$")
	public void open_chrome_browser() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		
	}

	

	@When("^Enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_username(String userName, String password) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
	}



	@Then("^user should be able to login into application sucessfully$")
	public void user_should_be_able_to_login_sucessfully() throws Throwable {
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}
	
	@Then("^application shoud be closed$")
	public void application_shoud_be_closed() throws Throwable {
		driver.quit();
	}

	



}
