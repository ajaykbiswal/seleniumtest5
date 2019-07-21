package lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class CaptureScreenshot {
	
	
	
	public static void TakeScreenshot(WebDriver driver,String screenshotname){
		
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File srcfile=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("./Screenshot/"+screenshotname+".png"));
		} 
		
		catch (Exception e) 
		{
			
			System.out.println(e.getMessage());
		} 
	}

}
