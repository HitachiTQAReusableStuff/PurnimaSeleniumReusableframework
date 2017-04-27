package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
	//import org.junit.Test;
import org.testng.annotations.*;
import CommonUtilities.ReadConfig;
import CommonUtilities.Utilities;

	public class LaunchFlipcart {



		@Test
		public void AppLaunch() throws IOException, InterruptedException {
			Utilities.LaunchApp(ReadConfig.ReadConfigFile("Flipcarturl"));
			Utilities.ClickLinkByHref(ReadConfig.ReadConfigFile("LogInhref"),"Log In");
			Utilities.InputText(ReadConfig.ReadConfigFile("FlipcartUsernamexpath"),ReadConfig.ReadConfigFile("FlipcartUsername"),ReadConfig.ReadConfigFile("FlipCartUserName"));
			Utilities.InputText(ReadConfig.ReadConfigFile("FlipcartPasswordXpath"),ReadConfig.ReadConfigFile("FlipcartPassword"),ReadConfig.ReadConfigFile("FlipCartPassword"));
	        Utilities.WebButton(ReadConfig.ReadConfigFile("FlipcartSignInButtonXpath"),"SignIn");
	        Utilities.InputText(ReadConfig.ReadConfigFile("FlipcartSearchBoxxpath"),ReadConfig.ReadConfigFile("SearchValue1"),ReadConfig.ReadConfigFile("SearchField"));
	        Utilities.WebButton(ReadConfig.ReadConfigFile("SearchButtonxpath"),"Search");
	        Thread.sleep(4000);
	        Utilities.InputText(ReadConfig.ReadConfigFile("FlipcartSearchBoxxpath"),ReadConfig.ReadConfigFile("ActualSearchValue"),ReadConfig.ReadConfigFile("SearchField"));
	        Utilities.WebButton(ReadConfig.ReadConfigFile("SearchButtonxpath"),"Search");
	        Thread.sleep(8000);
	        Utilities.SearchResults(ReadConfig.ReadConfigFile("DivClassname"),ReadConfig.ReadConfigFile("linktext"),"Phone Selection");
            Utilities.PhoneSelection(ReadConfig.ReadConfigFile("anchorClassname"),ReadConfig.ReadConfigFile("ActualMobileSelection"),"LinkSelection");
	       // Utilities.ClickLinkByHref(ReadConfig.ReadConfigFile("ActualMobileSelection"),"Phone Selection");
	     
	        Utilities.WebButton(ReadConfig.ReadConfigFile("AddtocartButtonxpath"),"searchlinktext");
	        Utilities.WebButton(ReadConfig.ReadConfigFile("GotoCartxpath"),"AddtoCart");
	//purnimaedited line
	          Utilities.WebButton(ReadConfig.ReadConfigFile("Removelinkxpath"),"Removeitemfromcart");
	 
	        }
		}
