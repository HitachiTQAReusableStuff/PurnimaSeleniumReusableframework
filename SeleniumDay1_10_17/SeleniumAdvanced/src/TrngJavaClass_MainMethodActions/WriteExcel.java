package TrngJavaClass_MainMethodActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
public class WriteExcel {


public static void writeExcel(String filePath, String fileName, String sheetName, String[] dataToWrite) throws IOException{
		
		//Create an object of File class to open xlsx file
		File file =    new File(filePath+"\\"+fileName);

		  
		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		
		//Create reference of Workbook interface and assign null
		Workbook workbook = null;
		
		//Find the file extension by spliting file name in substring and getting only extension name
		 String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		//Check condition if the file is xlsx file
		 if(fileExtensionName.equals(".xlsx")){
		     //If it is xlsx file then create object of XSSFWorkbook class
			 workbook = new XSSFWorkbook(inputStream);
		     }
		//Check condition if the file is xls file
		 else if(fileExtensionName.equals(".xls")){
		     //If it is xls file then create object of HSSFWorkbook class
		     workbook = new HSSFWorkbook(inputStream);
		    }
		//Read sheet inside the workbook by its name
		 Sheet sheet = workbook.getSheet(sheetName);
		 
		//Find number of rows in excel file
		int rowCount = sheet.getLastRowNum()-sheet.getLastRowNum() ;
		//rowCount++;
		 //System.out.println(rowCount);
		 
		//Get the first row from the sheet
		  //Row firstRow = sheet.getRow(0);
		  

		if(rowCount!=0){
		  //Create a new row and append it at the bottom of sheet\
			rowCount--;
		  Row newRow = sheet.createRow(rowCount+1);
		 //For non-blank file.Create a loop over the cell of newly created Row
		  for(int j = 0; j < dataToWrite.length; j++){
		     //Fill data in row
		      Cell cell = newRow.createCell(j);
		      cell.setCellValue(dataToWrite[j]);
		    }
		}else{		  
			
		 //For blank sheet use below for loop
		  Row newRow = sheet.createRow(rowCount);
		
		 for(int j = 0; j < dataToWrite.length; j++){
		 Cell cell = newRow.createCell(j);
	      cell.setCellValue(dataToWrite[j]);
		 }
	    }
		 
		  
			
				
			
		
		//Close input stream
		  inputStream.close();
		
		//Create an object of FileOutputStream class to create write data in excel file
		  FileOutputStream outputStream = new FileOutputStream(file);
	
	    //write data in the excel file
		  workbook.write(outputStream);
		 
	    //close output stream
		  outputStream.close();
		
	}
	

public static void main(String[] args) throws IOException {

	//Create an array with the data in the same order in which you expect to be filled in excel file
	 String[] dataToWrite = {"Test1","Test2","Test3"};
	//Path of excel file as below
	 String filePath = System.getProperty("user.dir")+"\\src\\DataFiles";
	//Write the file using file name , sheet name and the data to be filled
    writeExcel(filePath,"ExcelTestdata.xlsx","Credentials",dataToWrite);
    System.out.println("Successfully added a new data set1.");
   
   String[] dataToWrite1 = {"Test4","Test5","Test6"};
    writeExcel(filePath,"ExcelTestdata.xlsx","Credentials",dataToWrite1);
    System.out.println("Successfully added a new data set2.");
    String[] dataToWrite2 = {"Test7","Test8","Test9"};
    writeExcel(filePath,"ExcelTestdata.xlsx","Credentials",dataToWrite2);
}

}