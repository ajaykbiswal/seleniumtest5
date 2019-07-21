package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementDefination {
	
//	WebDriver driver;
//	public ElementDefination(WebDriver ldriver){
//		
//		this.driver=ldriver;
//		
//	}
	
	@FindBy(id="email") 
	WebElement userName;
	
	@FindBy(how=How.ID,using="pass")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@value='Log In']")
	WebElement login_button;
	
	
	    
	public void LogintoApp(String userid,String pass){
		
		userName.sendKeys(userid);
		password.sendKeys(pass);
		login_button.click();
	}
}
