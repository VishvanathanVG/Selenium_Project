package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnReadDataExcelOwn {

	public String[][] readDataExcel(String filename, String sheetname ) throws IOException {
		
	XSSFWorkbook book = new XSSFWorkbook("./data/"+filename+".xlsx");
	XSSFSheet sheetName = book.getSheet(sheetname);
	//XSSFSheet sheetName = book.getSheetAt(0);
	int rowCount = sheetName.getLastRowNum();
	XSSFRow firstRow = sheetName.getRow(0);
	int colCount = firstRow.getLastCellNum();
	String[][] data = new String[rowCount][colCount];
	for (int j = 1; j <=rowCount; j++) {
		XSSFRow row = sheetName.getRow(j);
		for (int i = 0; i < colCount; i++) {
			XSSFCell cellValue = row.getCell(i);
			String stringCellValue = cellValue.getStringCellValue();
			data[j-1][i] = stringCellValue;
		} 
	}
	
	book.close();
	return data;
	
	}
}
