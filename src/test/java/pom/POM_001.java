package pom;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class POM_001 extends BaseTest
{
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String btype) throws Exception 
  {
	  	System.out.println("BeforeMethod");
	    init();
		test = rep.createTest("POM_001");
		test.log(Status.INFO, "init the properties files...");
				
		launch(btype);
		test.log(Status.INFO, "Opening the Browser :" + btype);
				
		navigateUrl("automationurl");
		test.log(Status.PASS, "Navigating to URl : " + childProp.getProperty("automationurl"));
  }
  
  @Test
  public void f() 
  {
	  CustomerRegistration obj = new CustomerRegistration(driver);
	  obj.customerRegistration();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
