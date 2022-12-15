package excelDriven;

public class DataManagement 
{

	public static void main(String[] args) throws Exception
	{
		ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testcaseName = "LoginTest";
		
		//To find the matching Testcase RowNumber
		int testStartRowNum = 0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testcaseName))
		{
			testStartRowNum++;
		}
		System.out.println("Test start row num ber is : " + testStartRowNum );
		
		
		int colStartRowNum = testStartRowNum+1;
		int dataStartRowNum  = testStartRowNum+2 ;
		
		//Calculate the rows of Data
		int rows = 0;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are : " +  rows);
		
		//calculate the cols of Data
		int cols = 0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Total cols are : " +  cols);
		
		// Read the test data
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++ )
		{
			for(int cNum=0;cNum<cols;cNum++)
			{
				System.out.println(e.getCellData(sheetName, cNum, rNum));
			}
		}

	}

}
