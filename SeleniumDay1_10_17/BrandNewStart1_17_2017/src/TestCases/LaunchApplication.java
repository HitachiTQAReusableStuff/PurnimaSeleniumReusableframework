package TestCases;

import static org.junit.Assert.*;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.junit.Test;
import org.testng.annotations.*;
import CommonUtilities.ReadConfig;
import CommonUtilities.Utilities;



public class LaunchApplication {

	@Test
	public void AppLaunch() throws IOException, InterruptedException {
		Utilities.LaunchApp(ReadConfig.ReadConfigFile("Gmailurl"));
		Utilities.InputText(ReadConfig.ReadConfigFile("GmailUsernameXpath"),ReadConfig.ReadConfigFile("GmailUsername1"),ReadConfig.ReadConfigFile("GmailUsername"));
		Utilities.WebButton(ReadConfig.ReadConfigFile("GmailNextButtonXpath"),"Next");
		Utilities.InputText(ReadConfig.ReadConfigFile("GmailPasswordXpath"),ReadConfig.ReadConfigFile("GmailPasswordvalue"),ReadConfig.ReadConfigFile("GmailPassword"));
        Utilities.WebButton(ReadConfig.ReadConfigFile("GmailSigninButton"),"SignIn");
        //Utilities.ClickLinkByHref("My Account",ReadConfig.ReadConfigFile("gmailsettingshref"),"Gmail");
        //Utilities.ClickLinkByHref("My Account",ReadConfig.ReadConfigFile("gmailhref"),ReadConfig.ReadConfigFile("SignButton"));
        Utilities.WebDropDown(ReadConfig.ReadConfigFile("Settingsid1"),ReadConfig.ReadConfigFile("Settingoptionvalue"),"Settings");
       //Utilities.WebDropDown(ReadConfig.ReadConfigFile("conversationsperpage"),ReadConfig.ReadConfigFile("conversationsperpageValue"),"conversationsperpage");
       //Utilities.WebRadioButtonorCheckBox(ReadConfig.ReadConfigFile("ImagesRadioButtonxpath"));
       //Utilities.WebRadioButtonorCheckBox(ReadConfig.ReadConfigFile("undosendxpath"));
       //Utilities.WebButton(ReadConfig.ReadConfigFile("savechanges"));
       //Utilities.WebButton(ReadConfig.ReadConfigFile("ComposeButton"));
       //Utilities.InputText(ReadConfig.ReadConfigFile("ToField"),LoadConfig.ReadConfigFile("ToValue"));
        }
	}

