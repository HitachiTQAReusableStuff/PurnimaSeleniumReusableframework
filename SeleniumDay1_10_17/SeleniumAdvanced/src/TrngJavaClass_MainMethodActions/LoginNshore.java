package TrngJavaClass_MainMethodActions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginNshore {
	private static WebDriver driver;
	/*public static void main(String[] args) throws IOException {
		Loginapp();
	}*/
	
	
	public LoginNshore(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public void Loginapp() throws IOException{
	 driver = new FirefoxDriver();
		driver.get("https://nshore.hitachiconsulting.net/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Username = driver.findElement(By.id("txtLogin"));
		Username.sendKeys("primmanapudi");
		WebElement Password = driver.findElement(By.id("txtPassword"));
		Password.sendKeys("sony@w550i");
		driver.findElement(By.xpath(".//*[@id='frmLogin']/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/div/a/img")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath(".//*[@id='tblGrid032']/tbody/tr[4]/td[2]/a")).click();
		
	}	
		public void frameChecking(String xpathofFrame){
			List<WebElement> listTotalFrames = 	driver.findElements(By.tagName("frame"));
			int TotalFrames = listTotalFrames.size();
			for(int i=0;i<TotalFrames;i++)
			{
				driver.switchTo().defaultContent();
				driver.switchTo().frame(i);
		String link = xpathofFrame;
		int linksize = driver.findElements(By.xpath(link)).size();
		if(linksize==1)
		{
			System.out.println("Frame No in which the lement is found"  + i);
			driver.findElement(By.xpath(xpathofFrame)).click();
		}
		else
		{
		System.out.println("Element not found");
		}
		}	
		}
	}
	
	


