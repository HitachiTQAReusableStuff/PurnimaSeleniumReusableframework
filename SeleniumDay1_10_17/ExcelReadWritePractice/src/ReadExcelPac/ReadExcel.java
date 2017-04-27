package ReadExcelPac;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
File src = new File("C:\\PurnimaExcelSelenium\\ExcelData\\TestData.xlsx");
FileInputStream fis = new FileInputStream(src);

XSSFWorkbook Wb = new XSSFWorkbook(fis);
XSSFSheet sheet = Wb.getSheetAt(0);

String ts = sheet.getRow(0).getCell(0).getStringCellValue();
System.out.println(ts);

	}}
