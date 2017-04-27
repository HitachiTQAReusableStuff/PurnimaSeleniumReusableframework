package UtilityMethods;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LaunchApp {
private static WebDriver driver;
static Logger APPLICATION_LOGS=Logger.getLogger("devpinoyLogger");
	public LaunchApp(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public static void LaunchApplication(String url) throws IOException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\v-poori\\Desktop\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  driver.get(url);
	  APPLICATION_LOGS.debug("Launched URL"   +url);
   
		}
	
	public static void InputText(String xpath,String Value,String Label) throws IOException
	{
       WebElement Username = driver.findElement(By.xpath(xpath));
       Username.sendKeys(Value);
	   //APPLICATION_LOGS.debug(Value+ "  Entered  in  "   +Username.getAttribute("name"));
       APPLICATION_LOGS.debug(Value+ "  Entered  in  "   +Label);
	}
	
	public static void WebButton(String xpath,String Label) throws IOException
	{
		WebElement SubmitButton = driver.findElement(By.xpath(xpath));
		 //APPLICATION_LOGS.debug("Clicked on "+SubmitButton.getAttribute("name") + "  Button");
		
		APPLICATION_LOGS.debug("Clicked on "+Label);
		SubmitButton.click();
		  
	}
	public static void clickLinkByHref(String href,String Label) {
	    List<WebElement> anchors = driver.findElements(By.tagName("a"));
	    Iterator<WebElement> i = anchors.iterator();
	 
	    while(i.hasNext()) {
	        WebElement anchor = i.next();
	     if(anchor.getAttribute("href").contains(href)) {
	         anchor.click();
	         break;
	        }
	     APPLICATION_LOGS.debug("Clicked on "+Label);
	    }
	}
	public static void DropDownSelection(String xpath,String selectvalue,String Label) throws Exception{
		
		WebElement E = driver.findElement(By.xpath(xpath));
		String Tag=E.getTagName();
	if(Tag.equals("select"))
		
		{
			Select Dropdown = new Select(E);
			List<WebElement> Values =Dropdown.getOptions();
			int i=Values.size();
			System.out.println(i);
			Iterator<WebElement> itr = Values.iterator();
			for(int j =0;j<=i+1;j++){
			String V= itr.next().getText();
			System.out.println(V);
			if(V.equals(selectvalue)){
				Dropdown.selectByValue(selectvalue);
				break;
			}
			APPLICATION_LOGS.debug("Select  "+selectvalue +" from "+Label +" DropDown ");
			}
		}
			else{
		E.click();	
           int y = Integer.parseInt(selectvalue);
		for(int i = 0; i <= y; i++){
			
		    Actions actions = new Actions(driver);
		    actions.sendKeys(Keys.DOWN).build().perform();
		    
		}
		Actions actions = new Actions(driver);
		    actions.sendKeys(Keys.ENTER).build().perform();//press enter
		}
	APPLICATION_LOGS.debug("Select  "+selectvalue +" from "+Label +" DropDown ");
	}
		
	public static void WebRadioButton(String xpath,String Label) throws Exception{		
		WebElement E=driver.findElement(By.xpath(xpath));
		if(E.isSelected()){;
		
			String Info=E.getAttribute("name")+"Already Selected";
			APPLICATION_LOGS.debug(Info );
			}
		
		else
		{
			E.click();
			APPLICATION_LOGS.debug("Select  "+Label );
		}
	}
	public static void WebCheckBox(String xpath,String Label) throws Exception{		
		WebElement E=driver.findElement(By.xpath(xpath));
		if(E.isSelected()){;
		
			String Info=E.getAttribute("name")+"Already Selected";
			APPLICATION_LOGS.debug(Info );
			}
		
		else
		{
			E.click();
			APPLICATION_LOGS.debug("Check "+ Label +" CheckBox" );
		}
	}
	public static void GetWindowHandles() throws Exception{
		Set<String> Allwindow = driver.getWindowHandles();
		System.out.println("Number of Total Windows"+Allwindow.size());
		for (String ids : Allwindow) {
			   System.out.println("Total Id's"+ids);
		  }
		Iterator<String> itr = Allwindow.iterator(); 
		String mainWindow = itr.next();
	    String popUpWindow = itr.next();
	    Thread.sleep(3000);
	    
	    //Finally we are switching it pop up window
	    driver.switchTo().window(popUpWindow).close();
	    driver.switchTo().window(mainWindow);
	 	}
	
		
	
	public static void GetFrames(String xpath) throws IOException{
		
		List<WebElement> listTotalFrames = 	driver.findElements(By.tagName("frame"));
		int TotalFrames = listTotalFrames.size();
		for(int i=0;i<TotalFrames;i++)
		{
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);
	        String link = xpath;
	int linksize = driver.findElements(By.xpath(link)).size();
	if(linksize==1)
	{
		System.out.println("Frame No in which the element is found is: Frame  "  + i);
	break;
	}
	else
	{
	System.out.println("element not found");
	}
	}	
	}

	public static void Screenprintcapture(String ScreenPrintName) throws IOException{	
		//Type Conversion
				TakesScreenshot ScreenPrint = (TakesScreenshot) driver;
				 
				 //With the help Take screen reference variable we have used GetScreenShotsAs method which comes Take screen shot Interface 
				 File srcFile = ScreenPrint.getScreenshotAs(OutputType.FILE);
				
				 //Destination Folder
				

				 File destFile = new File("C:\\Users\\v-poori\\Desktop\\PoornimaInterniewrelated\\Screenprints\\"+ScreenPrintName+".jpeg");
				 //Through file Utils we are copying source File to destination file
				 FileUtils.copyFile(srcFile, destFile);
					}

				


	
	
		public static  String GetAttribute(String Tag,String Attribute) throws IOException{
			
			
	    String AttributeValue =   driver.findElement(By.tagName(Tag)).getAttribute(Attribute);
	    return AttributeValue;			
		}
		public static void RightClick(WebElement Element)
		{
			Actions act = new Actions(driver);
			act.contextClick().perform();
			
			}
		public static void DoubleClick(WebElement Element1)
		{
			Actions act = new Actions(driver);
			act.doubleClick(Element1).perform();
			
			}		
		public static void OpenNewtab()
		{
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
			
			}
			public void switchtabs(int Index)
			{
			ArrayList<String> Tabs = new ArrayList<String>(driver.getWindowHandles());
			int NoofOpenTabs = Tabs.size();
			System.out.println("Number of Tabs Opened"  +NoofOpenTabs );
			driver.switchTo().window(Tabs.get(Index));	
			
		}
			public void mousehoveronElement(WebElement Element2){
				
				Actions act = new Actions(driver);
				act.moveToElement(Element2);
				
		}
			public void DragandDrop(WebElement src,WebElement dest){
				Actions act = new Actions(driver);
				act.dragAndDrop(src, dest);
				
			}
			public void HandleAlert()
			{
			//Create reference of Alert interface and make driver switch to 
			//Alert
			Alert alert = driver.switchTo().alert();
		//Once it is switched to Alert get the text of the alert
	
			System.out.println("Text of Alert"+alert.getText());
		
		//Through accept method Selenium automatically clicks OK button of the alter
		//Through Dismiss method Selenium automatically closes the alert	
			alert.accept();
	
				}
	
public void Handlepopup()
{
	
	Set<String>  Popups= driver.getWindowHandles();
	int openedwindowcount = Popups.size();
	System.out.println("No of Windows Opened"+openedwindowcount);
	Iterator<String> itr = Popups.iterator();
	if(openedwindowcount>1){
		String M1 = itr.next();
		String P1= itr.next();
		driver.switchTo().window(P1).close();
		driver.switchTo().window(M1);
	}
	


}



}





	


