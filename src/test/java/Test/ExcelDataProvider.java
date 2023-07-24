package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static String getstringdata(String sheetname, int row,int cell) throws IOException {
		
		String Path="C:\\Users\\admin\\eclipse-workspace\\Test_project\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(Path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
}
