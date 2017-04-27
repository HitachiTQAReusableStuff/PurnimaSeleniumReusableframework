package Utilities;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumDay1Learning.OpenNshoreusingJavaApp;


public class Applicationloggerstest {
private static WebDriver driver;
	static Logger APPLICATION_LOGS=Logger.getLogger("devpinoyLogger");
		
	public static void main(String[] args) throws IOException, InterruptedException {
		//System.setProperty("webdriver.gecko.driver","D:\\Arjun\\Educational  stuff\\Selenium\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\Arjun\\Educational  stuff\\Selenium\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	APPLICATION_LOGS.debug("URL is getting Passed and Application Starts");
	driver.get(OpenNshoreusingJavaApp.readProperty("url"));
	Thread.sleep(2000);
	
	APPLICATION_LOGS.debug("Xpath is getting Passed");
	WebElement UsernameXpath = driver.findElement(By.xpath(OpenNshoreusingJavaApp.readProperty("UserNameTextXPath")));
	UsernameXpath.sendKeys(OpenNshoreusingJavaApp.readProperty("Username"));	
	Thread.sleep(2000);
	APPLICATION_LOGS.debug("User Name Xpath is Passed");
	
	APPLICATION_LOGS.debug("PasswordXpath is getting Passed");
	WebElement PasswordXpath = driver.findElement(By.xpath(OpenNshoreusingJavaApp.readProperty("PasswordTextXPath")));
	PasswordXpath.sendKeys(OpenNshoreusingJavaApp.readProperty("Password"));	
	
	APPLICATION_LOGS.debug("PasswordXpath is Passed");
	WebElement LoginXPath = driver.findElement(By.xpath(OpenNshoreusingJavaApp.readProperty("LoginClick")));
	//LoginXPath.click();;	
	WebDriverWait wait = new WebDriverWait(driver, 60);	
boolean b1 = wait.until(ExpectedConditions.visibilityOf(LoginXPath)).isEnabled();	
if(b1){
	LoginXPath.click();
}
	}
	
	
}