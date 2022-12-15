package excelDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;

public class FinalTest 
{
  @Test(dataProvider = "dp")
  public void f(Hashtable<String, String> obj) 
  {
	  if(obj.get("RunMode").equals("N"))
		  throw new SkipException("Testcase is skipped due to runmpde N");
	  System.out.println(obj.get("UserName"));
  }

  @DataProvider
  public Object[][] dp() throws Exception 
  {
	  ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
	  String sheetName = "data";
	  String testcaseName = "LoginTest";
	  
	return DataUtils.getTestData(e, sheetName, testcaseName);
    
  }
}
