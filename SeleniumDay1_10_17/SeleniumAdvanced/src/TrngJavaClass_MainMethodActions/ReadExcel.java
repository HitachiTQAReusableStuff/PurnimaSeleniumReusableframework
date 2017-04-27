package TrngJavaClass_MainMethodActions;










//https://www.apache.org/dyn/closer.lua/poi/dev/bin/poi-bin-3.15-beta2-20160702.zip

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel {

/**
*   #### Classes and Interfaces in POI API###
*     URL -   http://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-3.13-20150929.zip
   
* Workbook: XSSFWorkbook and HSSFWorkbook classes implement this interface.
* - XSSFWorkbook: Is a class representation of XLSX file.
* - HSSFWorkbook: Is a class representation of XLS file.

* Sheet: XSSFSheet and HSSFSheet classes implement this interface.
* - XSSFSheet: Is a class representing a sheet in a XLSX file.
* - HSSFSheet: Is a class representing a sheet in a XLS file.

* Row: XSSFRow and HSSFRow classes implement this interface.
* - XSSFRow: Is a class representing a row in sheet of XLSX file.
* - HSSFRow: Is a class representing a row in sheet of XLS file.

* Cell: XSSFCell and HSSFCell classes implement this interface.
* - XSSFCell: Is a class representing a cell in a row of XLSX file.
* - HSSFCell: Is a class representing a cell in a row of XLS file.
* 
*/
	
	public  void readExcel(String filePath, String fileName, String sheetName) throws IOException{
		
		//Create an object of File class to open xlsx file
		File file = new File(filePath+"\\"+fileName);
				
		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		
				
		// POI
		//Create reference of Workbook interface and assign null
		Workbook Workbook = null;
		
		//Find the file extension by spliting file name in substring and getting only extension name
		 String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		//Check condition if the file is xlsx file
		 if(fileExtensionName.equals(".xlsx")){
		     //If it is xlsx file then create object of XSSFWorkbook class
			 Workbook = new XSSFWorkbook(inputStream);
		     }
		
		 //Check condition if the file is xls file
		 else if(fileExtensionName.equals(".xls")){
		     //If it is xls file then create object of HSSFWorkbook class
		     Workbook = new HSSFWorkbook(inputStream);
		    }
		
		//Read sheet inside the workbook by its name
		 Sheet Sheet = Workbook.getSheet(sheetName);
		 
		//Find number of rows in excel file
		 int rowCount = Sheet.getLastRowNum()-Sheet.getFirstRowNum();
		 //System.out.println("Total no row -"+rowCount);
		 //Create a loop over all the rows of excel file to read it
		 
		 for (int i = 0; i < rowCount+1; i++) {
		         Row row = Sheet.getRow(i);
		 
		         //Create a loop to print cell values in a row
		         for (int j = 0; j < row.getLastCellNum(); j++) {
		           //Print excel data in console
		             System.out.print(row.getCell(j).getStringCellValue()+"|| ");
		             // 0 + 0, 0+1
		         }
		         System.out.println();
		     }
	}
	
	
	//Call excelRead method in main	
	 public static void main(String...strings) throws IOException {
		//Path of excel file as below
		ReadExcel rde = new ReadExcel();
		String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
System.out.println(filePath);
		 //Call readExcel file method of the class to read data
rde.readExcel(filePath,"Kishore.xlsx","Credentials");
	}
}

