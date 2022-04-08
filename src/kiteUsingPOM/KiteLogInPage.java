package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage {

	//1. variable declaration-->WebElement
	
		@FindBy(id = "userid") private WebElement UserID;
		@FindBy(id="password") private WebElement Password;
		@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
		
		//2. use constructor-->public
		
		public KiteLogInPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//3.methods
		
		public void enterUserID()
		{
			UserID.sendKeys("HD5857");
			
		}
		
		public void enterPAssword()
		{
			Password.sendKeys("Ajinkya@123");
		}
		
		public void clickOnLoginButtton()
		{
			LoginButton.click();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

