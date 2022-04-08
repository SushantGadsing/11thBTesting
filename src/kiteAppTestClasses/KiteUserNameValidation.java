package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basicClasses.BaseClass;
import kiteAppUsingPOMClasses.KiteLogInPage;
import kiteAppUsingPOMClasses.kitehomepage;
import kiteAppUsingPOMClasses.kitepinpage;
import utilityPackage.Utility;

public class KiteUserNameValidation extends BaseClass{
	
			
			KiteLogInPage login;
			kitepinpage pin;
			kitehomepage home;
			
			
			@BeforeClass 
			
			public void BrowserLaunch() 
			
			{   launchBrowser();
				login=new KiteLogInPage(driver);
				pin=new kitepinpage(driver);
				home=new kitehomepage(driver);
				
			}
			@BeforeMethod
			
			public void loginTokiteApp() throws EncryptedDocumentException, IOException
			
			{  
				login.enterUserID(Utility.readDataFromExcel(0, 0));
				login.enterPAssword(Utility.readDataFromExcel(0, 1));
				login.clickOnLoginButtton();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
				
				pin.sendPin(Utility.readDataFromExcel(0, 2));
				pin.clickOnContinueButton();
			}
			
			
		  @Test
		  public void userNameValidation() throws EncryptedDocumentException, IOException 
		  
		  {
		    int TCID=100;
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		    
		    String actualUserID=home.validateUserID();
		    String expectedUserID=Utility.readDataFromExcel(0, 3);
		    Assert.assertEquals(expectedUserID, actualUserID,"Actual and Expected not matching");
		    Utility.takeScreenshot(driver, TCID);
		    Reporter.log("Validated UserName", true);
		    }
		    @AfterMethod
		    public void logoutFromKiteApp() throws InterruptedException
		    {
		    home.clickOnLogout();
		    Reporter.log("Logging out", true);

		    
		    }
  
  
  
  
  
		    @AfterClass
		    public void   browserclosing()
		    {
		    	browserclose();
  
   }
}
