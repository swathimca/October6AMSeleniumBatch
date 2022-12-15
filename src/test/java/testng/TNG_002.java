package testng;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
	@Parameters("browser")
  @BeforeMethod(groups = {"regression","sanity"})
  public void startProcess(String btype) throws Exception 
  {
	  System.out.println("BeforeMethod");
	    init();
		test = rep.createTest("TNG_002");
		test.log(Status.INFO, "init the properties files...");
				
		launch(btype);
		test.log(Status.INFO, "Opening the Browser :" + btype);
				
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigating to URl : " + childProp.getProperty("amazonurl"));
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	  System.out.println("Amazon Test");
	    selectOption("amazonsearchdropbox_id","Books");
		test.log(Status.INFO, "Selecting the option Books By using the locator :" + orProp.getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		test.log(Status.INFO, "Entering the Text Harry Potter By using the Locator : " + orProp.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO, "Clicking on Element By using the Locator :" + orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess() 
  {
	  System.out.println("AfterMethod");
	  rep.flush();
	  driver.quit();
  }

}
