package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class newcls {
	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Users\\v-poori\\Desktop\\selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	driver.get("https://www.google.co.in/");
	}
	}


