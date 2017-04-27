package SeleniumDay1Learning;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Multiselect {
private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//To get Gecko Driver exe file
   		//System.setProperty("webdriver.gecko.driver","D:\\Arjun\\Educational  stuff\\Selenium\\geckodriver.exe");

   		//To get Chrome Driver exe file
   		//System.setProperty("webdriver.chrome.driver","D:\\Arjun\\Educational  stuff\\Selenium\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		
		Select S1 = new Select(driver.findElement(By.xpath(".//*[@id='selenium_commands']")));

		List<WebElement> Z1 = S1.getOptions();
		int ilist = Z1.size();
		
		for (int i=0; i<ilist; i++){
			S1.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		S1.deselectAll();
		
		
	}

}
