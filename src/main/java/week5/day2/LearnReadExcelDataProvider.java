package week5.day2;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LearnReadExcelDataProvider {
	
	@Test
	public void readDataExcel() throws IOException {
	XSSFWorkbook book = new XSSFWorkbook("./data/CreateLead.xlsx");
	XSSFSheet sheetName = book.getSheet("CL");
	System.out.println(sheetName);
	int rowCount = sheetName.getLastRowNum();
	for (int j = 1; j <=rowCount ; j++) {
		System.out.println("*********");
		XSSFRow row = sheetName.getRow(j);
		int colConunt = row.getLastCellNum();
		for (int i = 0; i < colConunt; i++) {
			XSSFCell cell = row.getCell(i);
			String lastValue = cell.getStringCellValue();
			//if(lastValue.con
			System.out.println(lastValue);
	} 
		System.out.println("*********");
	}
	book.close();
	
	}
}
