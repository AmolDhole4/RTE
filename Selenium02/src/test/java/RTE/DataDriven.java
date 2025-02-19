package RTE;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@Test
	@DataProvider(name="loginData")
	public String [][]  getData() throws IOException {
		
		//String file = null;
		FileInputStream fil=new FileInputStream("https://d.docs.live.net/F079FBFE926902FA/Documents/RTE.excel.xlx");
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
	int No_Of_ROWS=	sheet.getPhysicalNumberOfRows();
	int No_of_COlumns=sheet.getRow(0).getLastCellNum();
	String data [][]=new String[No_Of_ROWS-1][No_of_COlumns];
	for(int i=0;i<No_Of_ROWS-1;i++) {
		for(int j=0;j<No_of_COlumns;j++) {
			
			//DataFormater df=new DataFormater();
			
			data[i][j]	=sheet.getRow(i).getCell(j).getStringCellValue();	
		}
	}
	
		return data;
}
}