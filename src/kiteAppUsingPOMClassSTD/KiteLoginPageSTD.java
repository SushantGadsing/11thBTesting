package kiteAppUsingPOMClassSTD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPageSTD 
{

	//1. variable declaration-->WebElement
	
		@FindBy(id = "userid") private WebElement UserID;
		@FindBy(id="password") private WebElement Password;
		@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
		
		//2. use constructor-->public
		
		public KiteLoginPageSTD(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//3.methods
		
		public void enterUserID(String UN)
		{
			UserID.sendKeys(UN);
			
		}
		
		public void enterPAssword(String PWD)
		{
			Password.sendKeys(PWD);
		}
		
		public void clickOnLoginButtton()
		{
			LoginButton.click();
		}
	
	
	
	
	
	
	
}
