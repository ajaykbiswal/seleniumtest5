package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FreecrmTest {
	
	confingRedaer config;
	WebDriver driver;
	@BeforeTest
	public void Setup(){
		
		 config=new confingRedaer();
		 System.setProperty("webdriver.chrome.driver", config.getChromeDriver());
		 System.out.println("<<<<<<< SetUP IS READY >>>>>");
	}
	
	
	@Test(dataProvider="testdata")
	public void VerifyLogin(String userName,String Password) throws Exception{
		 
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get(config.getApplicationURL());
		 driver.findElement(By.name("username")).sendKeys(userName);
		 driver.findElement(By.name("password")).sendKeys(Password);
		 driver.findElement(By.xpath("//input[@value='Login']")).submit();
		 Thread.sleep(2000);
		 driver.switchTo().frame(1);
		 WebElement ele=driver.findElement(By.xpath("//ul[@class='mlddm']//li/a[text()='Home']"));
		 Assert.assertTrue(ele.getAttribute("title").contains("Home"));
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] passData(){
		
		excelconfig reader=new excelconfig(config.getExcelPath());
		int row=reader.getrow(0);
		Object[][] data=new Object[row][2];
		for(int i=0;i<row;i++){
			data[i][0]=reader.getData(0, i, 0);
			data[i][1]=reader.getData(0, i, 1);
		}
		return data;
	}

	
	
}
