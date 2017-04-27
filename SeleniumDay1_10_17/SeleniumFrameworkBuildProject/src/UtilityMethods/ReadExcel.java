package UtilityMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public void Readexceldata(String FilePath,String FileName,String SheetName) throws Exception{
		File src = new File(FilePath+"\\"+FileName);
		FileInputStream Input = new FileInputStream(src); 
		String Fileext = FileName.substring(FileName.indexOf("."));
		Workbook wb = null;
		if(Fileext.equals(".xlsx")){
			wb = new XSSFWorkbook(Input);
			
		}
		else if(Fileext.equals(".xls")){
			
			wb = new HSSFWorkbook(Input);
		}
		Sheet sheet = wb.getSheet(SheetName);
		int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0;i<rowcount+1;i++){
		Row row = sheet.getRow(i);

		for (int j =0;j<row.getLastCellNum();j++){
			
			System.out.print(row.getCell(j).getStringCellValue()+"||");
		}
		System.out.println();	
		}
	
			
		}
	}
	
	

	

