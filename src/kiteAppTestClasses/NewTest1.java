package kiteAppTestClasses;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import basicClasses.BaseClassUsingProperties;
import utilityPackage.utilityUsingProperty;

public class NewTest1 extends BaseClassUsingProperties{
  @Test
  public void f() throws IOException {
	  
	  Reporter.log(utilityUsingProperty.getDatafromPropertyFile("URL"),true);
	  Reporter.log(utilityUsingProperty.getDatafromPropertyFile("UN"),true);
	  Reporter.log(utilityUsingProperty.getDatafromPropertyFile("PWD"),true);
	  Reporter.log(utilityUsingProperty.getDatafromPropertyFile("PIN"),true);
  }
}
