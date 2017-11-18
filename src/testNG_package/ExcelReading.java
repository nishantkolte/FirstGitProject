package testNG_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReading {
	
	@Test (dataProvider ="getdata")
	public void testme(String username1, String password1 ){
		System.out.println(" username is: " + username1 + " password is: "+ password1);
		
	}

	
	@DataProvider (name = "getdata")
		public Object[][] GetData() throws IOException{
		
		//		reading excel data 
		
		File myfile = new File("C:\\Users\\NISH\\Automation\\Workspace\\TESTNG PROJECT\\TestData\\Testdata.xls");
		FileInputStream mystream = new FileInputStream(myfile);
		HSSFWorkbook mybook = new HSSFWorkbook(mystream);
		Sheet mysheet = mybook.getSheet("Sheet1");

		Object[][] r = new Object[mysheet.getLastRowNum()][2];
		
		for(int i=mysheet.getFirstRowNum()+1;i<=mysheet.getLastRowNum();i++)
		{
			Row myrow = mysheet.getRow(i);
			for(int j=myrow.getFirstCellNum();j<myrow.getLastCellNum();j++)
			{
				Cell mycell = myrow.getCell(j);
				r[i-1][j]=mycell.getStringCellValue();
			}
		}

		return r;
	}
			
}
