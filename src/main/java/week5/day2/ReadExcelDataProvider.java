package week5.day2;


import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataProvider {
	
	public String[][] readDataExcel(String filename ) throws IOException {
	XSSFWorkbook book = new XSSFWorkbook("./data/"+filename+".xlsx");
	XSSFSheet sheetName = book.getSheet("Create_Lead");
	System.out.println(sheetName);
	int rowCount = sheetName.getLastRowNum();
	XSSFRow firstRow = sheetName.getRow(0);
	int colConunt = firstRow.getLastCellNum();
	String[][] data = new String[rowCount][colConunt];
	for (int j = 1; j <=rowCount ; j++) {
		System.out.println("*********");
		XSSFRow row = sheetName.getRow(j);
		for (int i = 0; i < colConunt; i++) {
			XSSFCell cell = row.getCell(i);
			String lastValue = cell.getStringCellValue();
			System.out.println(lastValue);
			data[j-1][i] = lastValue;
	} 
		System.out.println("*********");
	}
	book.close();
	return data;
	}
	
}
