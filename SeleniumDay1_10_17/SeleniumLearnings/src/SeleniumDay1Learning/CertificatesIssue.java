package SeleniumDay1Learning;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CertificatesIssue {
	private static WebDriver driver121;
	
	@Test
	public  void Chromecertresolve() throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\v-poori\\Desktop\\PoornimaInterniewrelated\\Selenium Code\\exe\\exe\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\CMAP\\automation\\appium\\Appium\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ();       
        handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
		driver121 = new ChromeDriver (handlSSLErr);
		driver121.manage().window().maximize();
		driver121.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver121.get("https://onlineservices.tin.nsdl.com/etaxnew/tdsnontds.jsp");
	}

	

}
