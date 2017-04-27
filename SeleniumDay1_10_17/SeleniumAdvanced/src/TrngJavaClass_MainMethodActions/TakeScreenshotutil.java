package TrngJavaClass_MainMethodActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshotutil {
	private static WebDriver driver;
	public static void main(String[] args) throws IOException {
		//Setting up Properties for Gecko driver and Chrome Driver
		//System.setProperty("webdriver.chrome.driver","D:\\Arjun\\Educational  stuff\\Selenium\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\Arjun\\Educational  stuff\\Selenium\\geckodriver.exe");
			
		// Creating an object of WebDriver Interface
		//WebDriver driver = new ChromeDriver();
			
		}
	
	
	
		public void Screenprintcapture(String ScreenPrintName) throws IOException{


		 //Type Conversion
		TakesScreenshot TakeScreen = (TakesScreenshot) driver;
		 
		 //With the help Take screen reference variable we have used GetScreenShotsAs method which comes Take screen shot Interface 
		 File srcFile = TakeScreen.getScreenshotAs(OutputType.FILE);
		
		 //Destination Folder
		

		 File destFile = new File("C:\\Users\\v-poori\\Desktop\\PoornimaInterniewrelated\\Screenprints\\"+ScreenPrintName+".jpeg");
		 //Through file Utils we are copying source File to destination file
		 FileUtils.copyFile(srcFile, destFile);
			}

		}

}
