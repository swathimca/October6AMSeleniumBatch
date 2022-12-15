package verifications;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = rep.createTest("Verify3");
		test.log(Status.INFO, "init the properties files...");
				
		launch("chromebrowser");
		test.log(Status.INFO, "Opening the Browser :" + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigating to URl : " + childProp.getProperty("amazonurl"));

		String expectedLink = "Customer Servic";
		
		if(!isLinksEqual(expectedLink))
			reportFailure("Both links are not equal");
		else	
			reportPass("Both links are equal");
		
		rep.flush();
	}
}
