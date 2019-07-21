package utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDropHandler {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.navigate().to("http://jqueryui.com/resizable/");
		//driver.navigate().to("http://jqueryui.com/droppable/");
		//driver.navigate().to("http://jqueryui.com/draggable/");
//		driver.navigate().to("http://jqueryui.com/selectmenu/");
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select list=new Select(ele);
		
		list.selectByValue("3");
		
		
		
		
				

//		List<WebElement> ele=
//		int item_count=ele.size();
//		
//		for(int i=0;i<item_count;i++){
//			
//			System.out.println(ele.get(i).getText());
//			
//			
//		}
//			
//			
//		
		
		//driver.navigate().to("http://jqueryui.com/slider/#colorpicker");
		
//		driver.switchTo().frame(0);
		
//		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
//		WebElement drag=driver.findElement(By.xpath("//div[@id='red']//span"));
		//WebElement drop=driver.findElement(By.xpath("//div[contains(@class,'gripsmall-diagonal-se')]"));
//		Actions action= new Actions(driver);
		
//		action.contextClick(drag).perform();
//		action.doubleClick(drag).perform();
		//action.moveToElement(drop).moveByOffset(60, 40).build().perform();
		  
//		action.clickAndHold(drag).moveByOffset(-60, 40).release().build().perform();//resizable
		
//		action.dragAndDrop(drag, drop).perform();
//		action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		
		
		
		
		
		
		
		
	}

}
