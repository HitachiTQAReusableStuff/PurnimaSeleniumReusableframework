package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;



import UtilityMethods.LaunchApp;
import UtilityMethods.LoadConfig;

public class LoginGmail {

	@Test
    public void gmaillogin() throws Exception
    {
          LaunchApp.LaunchApplication(LoadConfig.ReadConfigFile("Gmailurl"));
      	  LaunchApp.InputText(LoadConfig.ReadConfigFile("GmailUsernameXpath"),LoadConfig.ReadConfigFile("GmailUsername1"),LoadConfig.ReadConfigFile("GmailUsername"));
          LaunchApp.WebButton(LoadConfig.ReadConfigFile("GmailNextButtonXpath"),LoadConfig.ReadConfigFile("NextButton"));
          LaunchApp.InputText(LoadConfig.ReadConfigFile("GmailPasswordXpath"),LoadConfig.ReadConfigFile("GmailPasswordvalue"),LoadConfig.ReadConfigFile("GmailPassword"));
         //LaunchApp.WebButton(LoadConfig.ReadConfigFile("GmailSigninButton"));
         // LaunchApp.clickLinkByHref(LoadConfig.ReadConfigFile("gmailsettingshref"));
         // LaunchApp.clickLinkByHref(LoadConfig.ReadConfigFile("gmailhref"));
         // LaunchApp.DropDownSelection(LoadConfig.ReadConfigFile("Settingsid1"),LoadConfig.ReadConfigFile("Settingoptionvalue"));
         // LaunchApp.DropDownSelection(LoadConfig.ReadConfigFile("conversationsperpage"),LoadConfig.ReadConfigFile("conversationsperpageValue"));
         // LaunchApp.WebRadioButtonorCheckBox(LoadConfig.ReadConfigFile("ImagesRadioButtonxpath"));
         // LaunchApp.WebRadioButtonorCheckBox(LoadConfig.ReadConfigFile("undosendxpath"));
         // LaunchApp.WebButton(LoadConfig.ReadConfigFile("savechanges"));
         // LaunchApp.WebButton(LoadConfig.ReadConfigFile("ComposeButton"));
         //LaunchApp.InputText(LoadConfig.ReadConfigFile("ToField"),LoadConfig.ReadConfigFile("ToValue"));
          }

}
