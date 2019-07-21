package utility;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWindow {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.naukri.com/");
		
		String parentwnd=driver.getWindowHandle();
		System.out.println(parentwnd);
		
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='geoLocPopUp']")));
//		WebElement ele=
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//span[text()='Later']")).click();
		
		Set<String> olists=driver.getWindowHandles();
		
		ArrayList<String> tab=new ArrayList<>(olists);
	
		int allwnd =olists.size();
		System.out.println("Child wnds are:"+allwnd);
		
		for(String child:olists ){
			
			
			
			if(!parentwnd.equals(child)){
				
				driver.switchTo().window(child);
				
				System.out.println(driver.getTitle());
				
				driver.close();
					
				
			}
		
		}
		    Thread.sleep(3000);
		    
		    String msg_alert=driver.switchTo().alert().getText();
		    
		    System.out.println(msg_alert);
		    
//		    driver.findElement(By.xpath("//*[@id='block']")).click();
		    
			driver.switchTo().window(parentwnd);
			
			System.out.println("Parent wnd title is:"+driver.getTitle());
			
			Set<String> wnds=driver.getWindowHandles();
			
		System.out.println(wnds.size());
			
			driver.findElement(By.xpath("//*[@id='qsbClick']/span[1]")).sendKeys("Selemium");
			
			driver.quit();
		
		

	}

}




