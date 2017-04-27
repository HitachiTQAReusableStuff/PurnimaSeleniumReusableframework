package Practicepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {
private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
driver = new FirefoxDriver();
driver.get("www.google.com");
	}

}
