package TrngJavaClass_MainMethodActions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://myaccount.google.com/?pli=1");
	
		    List<WebElement> anchors = driver.findElements(By.tagName("a"));
		    Iterator<WebElement> i = anchors.iterator();
		 
	
		        WebElement anchor = i.next();
		     if(anchor.getAttribute("href").contains("https://www.google.co.in/intl/en/options/")); {
		         anchor.click();}
		     WebElement anchor1 = i.next();
		     if(anchor.getAttribute("href").contains("https://mail.google.com/mail/"));{
		     anchor1.click();
		 	driver.findElement(By.className("T-I J-J5-Ji ash T-I-ax7 L3")).click();}
		    

		}


}
