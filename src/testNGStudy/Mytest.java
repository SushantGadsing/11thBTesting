package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytest {
  @Test
  public void MyMethod() 
  
  
  {
	  System.out.println("Welcome to TestNG");
	  
  }
  
  @Test
  public void MyMethod2() 
  
  {
	  
	  System.out.println("Welcome to TestNG2");
	  Reporter.log("Welcome to Test NG2", true);
  }
  
  
  
}



