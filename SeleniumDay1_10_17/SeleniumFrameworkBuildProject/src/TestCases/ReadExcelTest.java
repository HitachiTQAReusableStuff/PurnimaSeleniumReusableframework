package TestCases;

import org.testng.annotations.*;



import UtilityMethods.LoadConfig;
import UtilityMethods.ReadExcel;

public class ReadExcelTest {

	@Test
		public void ReadExceltestdata() throws Exception, Exception{
			ReadExcel RDEX = new ReadExcel();
			RDEX.Readexceldata(LoadConfig.ReadConfigFile("FilePath"),LoadConfig.ReadConfigFile("FileName"),LoadConfig.ReadConfigFile("SheetName"));
			
		}
	}


