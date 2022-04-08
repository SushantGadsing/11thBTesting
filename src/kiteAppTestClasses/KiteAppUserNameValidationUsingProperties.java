package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basicClasses.BaseClassUsingProperties;
import kiteAppUsingPOMClassSTD.KiteHomePage;
import kiteAppUsingPOMClassSTD.KiteLoginPageSTD;
import kiteAppUsingPOMClassSTD.KitePinPage;
import utilityPackage.utilityUsingProperty;

public class KiteAppUserNameValidationUsingProperties extends BaseClassUsingProperties 
	{KiteLoginPageSTD login;
	KitePinPage pin;
	KiteHomePage home;
	int TCID=11;
	@BeforeClass
	public void launchingBrowser() throws IOException
	{
		browserLaunch();
		
		login= new KiteLoginPageSTD(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void LoginToKiteApp() throws IOException
	{
		login.enterUserID(utilityUsingProperty.getDatafromPropertyFile("UN"));
		login.enterPAssword(utilityUsingProperty.getDatafromPropertyFile("PWD"));
		login.clickOnLoginButtton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.enterPin(utilityUsingProperty.getDatafromPropertyFile("PIN"));
		pin.clickonContinueButton();
	}
	
	@Test
	public void validateUserID() throws IOException 
	{
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 String expectedUserID = utilityUsingProperty.getDatafromPropertyFile("UN");
	 String actualUserID = home.getActualUserID();
	
	 Assert.assertEquals(expectedUserID, actualUserID,"Actual and Expected UserID not matching ");
	 //UtilityUsingPropertyFile.takeScreenshot(driver, TCID);
	 
	}
	
	}
