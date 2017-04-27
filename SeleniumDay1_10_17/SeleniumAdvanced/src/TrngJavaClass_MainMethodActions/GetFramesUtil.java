package TrngJavaClass_MainMethodActions;


import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class GetFramesUtil {
private static WebDriver driver;

@Test
	public void LoggedInTest() throws IOException {
		//System.out.println(readProperty("url"));
		//LoginNshore Loginapp = new LoginNshore(driver);
		Loginapp.Loginapp();
		Loginapp.frameChecking(".//*[@id='frmLink']/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a[4]");


}

			

}
	
	

