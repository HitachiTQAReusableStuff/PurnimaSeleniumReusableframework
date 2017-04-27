package TrngJavaClass_MainMethodActions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeSeleniummethodsexample {
public static void main(String[] args) throws InterruptedException {

 WebDriver driver;

//System.setProperty("webdriver.chrome.driver", "C:\\CMAP\\automation\\appium\\Appium\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");

//driver = new ChromeDriver();
driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

//WebElement RadioButton = driver.findElement(By.name("firstname"));
//RadioButton.click();
//Actions act = new Actions(driver);
//act.sendKeys(Keys.TAB);
//Actions act = new Actions(driver);
//act.moveToElement(driver.findElement(By.linkText("Partial Link Test")));
//act.contextClick().perform();
//driver.get("https://www.naukri.com/");

//WebElement Link = driver.findElement(By.linkText("Partial Link Test"));
//String LinkText = Link.getText();
//String TagName = Link.getAttribute("href");
//System.out.println(LinkText );
//System.out.println(TagName );
//List<WebElement> LinksonPage = driver.findElements(By.tagName("a"));
//int totallinks=LinksonPage.size();
//System.out.println(totallinks);
//Iterator<WebElement> itr = LinksonPage.iterator();
//for(int i = 0;i<=totallinks;i++){
	//String Linktextview = itr.next().getText();
	//System.out.println(Linktextview);
	//}

//GETATTRIBUTE GETS THE VALUE OF THE ATTRIBUTE THAT WE SPECIFY here value is attributnmae,female is attribute value

//WebElement RadioButton = driver.findElement(By.id("sex-1"));
//RadioButton.click();
//String E= RadioButton.getAttribute("value");
//System.out.println(E);
//WebElement date = driver.findElement(By.id("datepicker"));
//date.sendKeys("11/4/2016");
//WebElement P = driver.findElement(By.id("profession-1"));

//P.click();
//WebElement P = driver.findElement(By.id("photo"));
//P.click();
//driver.switchTo().defaultContent();
//Set<String> AllWindows = driver.getWindowHandles();
//int winnum  = AllWindows.size();
//System.out.println(winnum);
//Iterator<String> itr = AllWindows.iterator();
//String MW1 = itr.next();
//String popup = itr.next();
//driver.switchTo().window(popup);
//driver.close();
//driver.switchTo().window(MW1);
//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//int j = tabs.size();
//System.out.println(j);
//driver.switchTo().window(tabs.get(0));

//driver.switchTo().window(tabs.get(1));
//String shifttab = Keys.chord(Keys.SHIFT,Keys.ENTER);
//RadioButton.sendKeys(shifttab);
//WebElement dropdown = driver.findElement(By.id("selenium_commands"));
//Select selectvalues = new Select(dropdown);

//List<WebElement> dropdownvalues = selectvalues.getOptions();
//int i = dropdownvalues.size();
//dropdown.click();
//Iterator<WebElement> itr = dropdownvalues.iterator();
//for(int j=0;j<=i;j++)
//{
	//String Value = itr.next().getText();
	//System.out.println(Value);
	
	
	//selectvalues.selectByIndex(j);
	//Thread.sleep(1000);
	
	
	
	
	
	
}
}

