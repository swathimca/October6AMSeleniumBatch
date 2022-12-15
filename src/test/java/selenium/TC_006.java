package selenium;

import com.aventstack.extentreports.Status;

public class TC_006 extends BaseTest
{

		
	public static void main(String[] args) throws Exception 
	{
		init();
		test = rep.createTest("TC_006");
		test.log(Status.INFO, "init the properties files...");
				
		launch("chromebrowser");
		test.log(Status.INFO, "Opening the Browser :" + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigating to URl : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazonsearchdropbox_id","Books");
		test.log(Status.INFO, "Selecting the option Books By using the locator :" + orProp.getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		test.log(Status.INFO, "Entering the Text Harry Potter By using the Locator : " + orProp.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO, "Clicking on Element By using the Locator :" + orProp.getProperty("amazonsearchbutton_xpath"));
		
		rep.flush();
	}
}
